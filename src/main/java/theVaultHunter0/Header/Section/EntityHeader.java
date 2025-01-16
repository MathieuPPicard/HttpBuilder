package theVaultHunter0.Header.Section;

import theVaultHunter0.Header.Header;

public class EntityHeader extends Section {

    private String contentType;
    private String contentLength;
    private String contentEncoding;
    private String contentLanguage;
    private String contentLocation;
    private String lastModified;

    public EntityHeader(String contentType, String contentLength, String contentEncoding,
                        String contentLanguage, String contentLocation, String lastModified) {
        this.contentType = contentType;
        this.contentLength = contentLength;
        this.contentEncoding = contentEncoding;
        this.contentLanguage = contentLanguage;
        this.contentLocation = contentLocation;
        this.lastModified = lastModified;
    }

    public String getContentType() {
        return contentType;
    }

    public String getContentLength() {
        return contentLength;
    }

    public String getContentEncoding() {
        return contentEncoding;
    }

    public String getContentLanguage() {
        return contentLanguage;
    }

    public String getContentLocation() {
        return contentLocation;
    }

    public String getLastModified() {
        return lastModified;
    }
}
