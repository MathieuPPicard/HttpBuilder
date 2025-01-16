package theVaultHunter0;

import theVaultHunter0.Body.Body;
import theVaultHunter0.Body.ByteBody;
import theVaultHunter0.Body.StrBody;
import theVaultHunter0.Header.Header;
import theVaultHunter0.Header.Section.EntityHeader;
import theVaultHunter0.StartLine.Emethod;
import theVaultHunter0.StartLine.StartLineRequest;

import java.net.http.HttpRequest;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        StartLineRequest startLine = new StartLineRequest(Emethod.GET,"users", "HTTP/1.1");
        EntityHeader entityHeader = new EntityHeader("asd", "asd" , "asd" ,"asd", "asd","asd","asd","asd","asd","asd","asd");
        Header RequestHeader = new Header(null, entityHeader, null, null, null,null);
        String str = "{ parametre : token }";
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);

        ByteBody byteBody = new ByteBody(bytes);

        Http httpRequestByte = new Http(startLine, RequestHeader, byteBody);
        System.out.println(httpRequestByte);
        System.out.println("==========");

        byte[] httpByte = httpRequestByte.toBytes();
        System.out.println(httpByte);
        System.out.println("==========");

        String httpString = new String(httpByte, StandardCharsets.UTF_8);
        System.out.println(httpString);
        System.out.println("==========");

        Http http1 = Http.fromString(httpString);
        System.out.println(http1);
        System.out.println("==========");

        //Need to add the test to create a http from a string
        String mes = "POST /api/resource HTTP/1.1\r\nHost: example.com\r\nUser-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64)\r\nAccept: application/json\r\nContent-Type: application/json\r\nContent-Length: 27\r\n\r\n{\"key\": \"value\", \"id\": 123}";
        Http http = Http.fromString(mes);
        System.out.println(http);
    }
}