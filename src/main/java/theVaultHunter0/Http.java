package theVaultHunter0;

import theVaultHunter0.Header.Header;
import theVaultHunter0.StartLine.StartLine;

import java.nio.charset.StandardCharsets;

public class Http {

    private StartLine startLine;
    private Header header;
    private String body;

    public Http(StartLine startLine, Header header, String body) {
        this.startLine = startLine;
        this.header = header;
        this.body = body;
    }

    public String toString(){
        return startLine.toString() + header.toString() + body;
    }

    public byte[] toBytes(){
        return this.toString().getBytes(StandardCharsets.US_ASCII);
    }

    public String getBody() {
        return body;
    }

    public Header getHeader() {
        return header;
    }

    public StartLine getStartLine() {
        return startLine;
    }
}
