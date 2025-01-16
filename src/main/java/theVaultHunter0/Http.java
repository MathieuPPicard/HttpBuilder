package theVaultHunter0;

import theVaultHunter0.Body.StrBody;
import theVaultHunter0.Header.Header;
import theVaultHunter0.StartLine.StartLine;
import theVaultHunter0.StartLine.Emethod;
import theVaultHunter0.Body.Body;
import theVaultHunter0.StartLine.StartLineRequest;
import theVaultHunter0.StartLine.StartLineResponse;

import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

public class Http {

    private StartLine startLine;
    private Header header;
    private Body body;

    public Http(StartLine startLine, Header header, Body body) {
        this.startLine = startLine;
        this.header = header;
        this.body = body;
    }

    public Http() {
    }

    public static Http fromString(String string){
        boolean isRequest = false;      //Be used to initialise the right object (StartLine, Header)

        //Create tokens
        String[] tokens = string.split("\r\n");

        //Build the StartLine
        StartLine startLine = null;
        String[] strStartLine = tokens[0].split(" ");
        //Verify the type of Http message(request or response) by checking if the first token is a method
        for(Emethod method : Emethod.values()){
            if(method.name().equalsIgnoreCase(strStartLine[0]))
            {
                isRequest = true;
            }
        }

        if(isRequest){
            Emethod method = switch (strStartLine[0]) {
                case "GET" -> Emethod.GET;
                case "HEAD" -> Emethod.HEAD;
                case "POST" -> Emethod.POST;
                case "PUT" -> Emethod.PUT;
                case "DELETE" -> Emethod.DELETE;
                case "CONNECT" -> Emethod.CONNECT;
                case "OPTIONS" -> Emethod.OPTIONS;
                case "TRACE" -> Emethod.TRACE;
                case "PATCH" -> Emethod.PATCH;
                default -> throw new IllegalStateException("Unexpected value: " + strStartLine[0]);
            };
            startLine = new StartLineRequest(method,strStartLine[1],strStartLine[2]);
        }
        else{
            startLine = new StartLineResponse(strStartLine[0]);
        }

        //Build the header
        Map<String,String> headerMap = new HashMap<>();
        int i = 1;
        while(i < tokens.length && !tokens[i].isEmpty()){
           String[] headerPart = tokens[i].split(":",2);
           headerMap.put(headerPart[0],headerPart[1]);
           i++;
        }
        Header header = Header.fromString(headerMap,isRequest);

        //Build the body
        String bodyString = "";
        i++;
        while(i < tokens.length)
        {
            bodyString = tokens[i].trim();
            i++;
        }
        StrBody body = new StrBody(bodyString);
        return new Http(startLine,header,body);
    }

    public Http fromBytes(byte[] bytes){
        String newHttp = new String(bytes, StandardCharsets.UTF_8);
        return fromString(newHttp);
    }

    public String toString(){
        return startLine.toString()  + header.toString() + "\r\n" + body.toString();
    }

    public byte[] toBytes(){
        return this.toString().getBytes(StandardCharsets.US_ASCII);
    }

    public Body getBody() {
        return body;
    }

    public Header getHeader() {
        return header;
    }

    public StartLine getStartLine() {
        return startLine;
    }
}
