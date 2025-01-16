package theVaultHunter0;

import theVaultHunter0.Header.Header;
import theVaultHunter0.Header.Section.EntityHeader;
import theVaultHunter0.StartLine.Emethod;
import theVaultHunter0.StartLine.StartLineRequest;

import java.net.http.HttpRequest;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        StartLineRequest startLine = new StartLineRequest("HTTP/1.1", "users", Emethod.GET);
        EntityHeader entityHeader = new EntityHeader("asd", "asd" , "asd" ,"asd", "asd","asd");
        Header RequestHeader = new Header(null, entityHeader, null, null);
        String body = "\n{ parametre : token }";
        Http httpRequest = new Http(startLine, RequestHeader, body);
        System.out.println(httpRequest);
        byte[] bytes = httpRequest.toBytes();
        System.out.println(bytes);
        String fromBytes = new String(bytes, StandardCharsets.US_ASCII);
        System.out.println(fromBytes);
    }
}