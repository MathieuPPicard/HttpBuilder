package theVaultHunter0.Header.Section;

import theVaultHunter0.Header.Header;

public class EntityHeader extends Section {

    private String allow;
    private String contentDisposition;
    private String contentEncoding;
    private String contentLanguage;
    private String contentLength;
    private String contentLocation;
    private String contentMD5;
    private String contentRange;
    private String contentType;
    private String expires;
    private String lastModified;

    public EntityHeader() {}

    public EntityHeader(String allow, String contentDisposition, String contentEncoding, String contentLanguage, String contentLength, String contentLocation, String contentMD5, String contentRange, String contentType, String expires, String lastModified) {
        this.allow = allow;
        this.contentDisposition = contentDisposition;
        this.contentEncoding = contentEncoding;
        this.contentLanguage = contentLanguage;
        this.contentLength = contentLength;
        this.contentLocation = contentLocation;
        this.contentMD5 = contentMD5;
        this.contentRange = contentRange;
        this.contentType = contentType;
        this.expires = expires;
        this.lastModified = lastModified;
    }

    public String getAllow() {
        return allow;
    }

    public String getContentDisposition() {
        return contentDisposition;
    }

    public String getContentEncoding() {
        return contentEncoding;
    }

    public String getContentLanguage() {
        return contentLanguage;
    }

    public String getContentLength() {
        return contentLength;
    }

    public String getContentLocation() {
        return contentLocation;
    }

    public String getContentMD5() {
        return contentMD5;
    }

    public String getContentRange() {
        return contentRange;
    }

    public String getContentType() {
        return contentType;
    }

    public String getExpires() {
        return expires;
    }

    public String getLastModified() {
        return lastModified;
    }

    public void setAllow(String allow) {
        this.allow = allow;
    }

    public void setContentDisposition(String contentDisposition) {
        this.contentDisposition = contentDisposition;
    }

    public void setContentEncoding(String contentEncoding) {
        this.contentEncoding = contentEncoding;
    }

    public void setContentLanguage(String contentLanguage) {
        this.contentLanguage = contentLanguage;
    }

    public void setContentLength(String contentLength) {
        this.contentLength = contentLength;
    }

    public void setContentLocation(String contentLocation) {
        this.contentLocation = contentLocation;
    }

    public void setContentMD5(String contentMD5) {
        this.contentMD5 = contentMD5;
    }

    public void setContentRange(String contentRange) {
        this.contentRange = contentRange;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public void setExpires(String expires) {
        this.expires = expires;
    }

    public void setLastModified(String lastModified) {
        this.lastModified = lastModified;
    }
}
