package theVaultHunter0.Header.Section;

import theVaultHunter0.As;
import theVaultHunter0.Header.Header;

public class EntityHeader extends Section {

    @As("allow")
    private String Allow;
    @As("content-disposition")
    private String ContentDisposition;
    @As("content-encoding")
    private String ContentEncoding;
    @As("content-language")
    private String ContentLanguage;
    @As("content-length")
    private String ContentLength;
    @As("content-location")
    private String ContentLocation;
    @As("content-md5")
    private String ContentMD5;
    @As("content-range")
    private String ContentRange;
    @As("content-type")
    private String ContentType;
    @As("expires")
    private String Expires;
    @As("last-modified")
    private String LastModified;

    public EntityHeader() {}

    public EntityHeader(String allow, String contentDisposition, String contentEncoding, String contentLanguage, String contentLength, String contentLocation, String contentMD5, String contentRange, String contentType, String expires, String lastModified) {
        this.Allow = allow;
        this.ContentDisposition = contentDisposition;
        this.ContentEncoding = contentEncoding;
        this.ContentLanguage = contentLanguage;
        this.ContentLength = contentLength;
        this.ContentLocation = contentLocation;
        this.ContentMD5 = contentMD5;
        this.ContentRange = contentRange;
        this.ContentType = contentType;
        this.Expires = expires;
        this.LastModified = lastModified;
    }

    public String getAllow() {
        return Allow;
    }

    public String getContentDisposition() {
        return ContentDisposition;
    }

    public String getContentEncoding() {
        return ContentEncoding;
    }

    public String getContentLanguage() {
        return ContentLanguage;
    }

    public String getContentLength() {
        return ContentLength;
    }

    public String getContentLocation() {
        return ContentLocation;
    }

    public String getContentMD5() {
        return ContentMD5;
    }

    public String getContentRange() {
        return ContentRange;
    }

    public String getContentType() {
        return ContentType;
    }

    public String getExpires() {
        return Expires;
    }

    public String getLastModified() {
        return LastModified;
    }

    public void setAllow(String allow) {
        this.Allow = allow;
    }

    public void setContentDisposition(String contentDisposition) {
        this.ContentDisposition = contentDisposition;
    }

    public void setContentEncoding(String contentEncoding) {
        this.ContentEncoding = contentEncoding;
    }

    public void setContentLanguage(String contentLanguage) {
        this.ContentLanguage = contentLanguage;
    }

    public void setContentLength(String contentLength) {
        this.ContentLength = contentLength;
    }

    public void setContentLocation(String contentLocation) {
        this.ContentLocation = contentLocation;
    }

    public void setContentMD5(String contentMD5) {
        this.ContentMD5 = contentMD5;
    }

    public void setContentRange(String contentRange) {
        this.ContentRange = contentRange;
    }

    public void setContentType(String contentType) {
        this.ContentType = contentType;
    }

    public void setExpires(String expires) {
        this.Expires = expires;
    }

    public void setLastModified(String lastModified) {
        this.LastModified = lastModified;
    }
}
