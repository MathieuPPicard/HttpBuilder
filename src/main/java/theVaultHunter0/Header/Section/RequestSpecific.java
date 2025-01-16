package theVaultHunter0.Header.Section;

public class RequestSpecific {
    private String accept;
    private String acceptCharset;
    private String acceptEncoding;
    private String acceptLanguage;
    private String authorization;
    private String expect;
    private String forwarded;
    private String host;
    private String ifMatch;
    private String ifModifiedSince;
    private String ifNoneMatch;
    private String ifRange;
    private String ifUnmodifiedSince;
    private String origin;
    private String referer;
    private String TE;
    private String userAgent;
    private String upgradeInsecudeRequests;

    public RequestSpecific(){}

    public RequestSpecific(String accept, String acceptCharset, String acceptEncoding, String acceptLanguage, String authorization, String expect, String forwarded, String host, String ifMatch, String ifModifiedSince, String ifNoneMatch, String ifRange, String ifUnmodifiedSince, String origin, String referer, String TE, String userAgent, String upgradeInsecudeRequests) {
        this.accept = accept;
        this.acceptCharset = acceptCharset;
        this.acceptEncoding = acceptEncoding;
        this.acceptLanguage = acceptLanguage;
        this.authorization = authorization;
        this.expect = expect;
        this.forwarded = forwarded;
        this.host = host;
        this.ifMatch = ifMatch;
        this.ifModifiedSince = ifModifiedSince;
        this.ifNoneMatch = ifNoneMatch;
        this.ifRange = ifRange;
        this.ifUnmodifiedSince = ifUnmodifiedSince;
        this.origin = origin;
        this.referer = referer;
        this.TE = TE;
        this.userAgent = userAgent;
        this.upgradeInsecudeRequests = upgradeInsecudeRequests;
    }

    public String getAccept() {
        return accept;
    }

    public String getAcceptCharset() {
        return acceptCharset;
    }

    public String getAcceptEncoding() {
        return acceptEncoding;
    }

    public String getAcceptLanguage() {
        return acceptLanguage;
    }

    public String getAuthorization() {
        return authorization;
    }

    public String getExpect() {
        return expect;
    }

    public String getForwarded() {
        return forwarded;
    }

    public String getHost() {
        return host;
    }

    public String getIfMatch() {
        return ifMatch;
    }

    public String getIfModifiedSince() {
        return ifModifiedSince;
    }

    public String getIfNoneMatch() {
        return ifNoneMatch;
    }

    public String getIfRange() {
        return ifRange;
    }

    public String getIfUnmodifiedSince() {
        return ifUnmodifiedSince;
    }

    public String getOrigin() {
        return origin;
    }

    public String getReferer() {
        return referer;
    }

    public String getTE() {
        return TE;
    }

    public String getUserAgent() {
        return userAgent;
    }

    public String getUpgradeInsecudeRequests() {
        return upgradeInsecudeRequests;
    }
}
