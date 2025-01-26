package theVaultHunter0.Header.Section;

public class RequestSpecific extends Section {
    private String Accept;
    private String AcceptCharset;
    private String AcceptEncoding;
    private String AcceptLanguage;
    private String Authorization;
    private String Expect;
    private String Forwarded;
    private String Host;
    private String IfMatch;
    private String IfModifiedSince;
    private String IfNoneMatch;
    private String IfRange;
    private String IfUnmodifiedSince;
    private String Origin;
    private String Referer;
    private String TE;
    private String UserAgent;
    private String UpgradeInsecureRequests;

    public RequestSpecific(){}

    public RequestSpecific(String accept, String acceptCharset, String acceptEncoding, String acceptLanguage, String authorization, String expect, String forwarded, String host, String ifMatch, String ifModifiedSince, String ifNoneMatch, String ifRange, String ifUnmodifiedSince, String origin, String referer, String TE, String userAgent, String upgradeInsecudeRequests) {
        this.Accept = accept;
        this.AcceptCharset = acceptCharset;
        this.AcceptEncoding = acceptEncoding;
        this.AcceptLanguage = acceptLanguage;
        this.Authorization = authorization;
        this.Expect = expect;
        this.Forwarded = forwarded;
        this.Host = host;
        this.IfMatch = ifMatch;
        this.IfModifiedSince = ifModifiedSince;
        this.IfNoneMatch = ifNoneMatch;
        this.IfRange = ifRange;
        this.IfUnmodifiedSince = ifUnmodifiedSince;
        this.Origin = origin;
        this.Referer = referer;
        this.TE = TE;
        this.UserAgent = userAgent;
        this.UpgradeInsecureRequests = upgradeInsecudeRequests;
    }

    public String getAccept() {
        return Accept;
    }

    public String getAcceptCharset() {
        return AcceptCharset;
    }

    public String getAcceptEncoding() {
        return AcceptEncoding;
    }

    public String getAcceptLanguage() {
        return AcceptLanguage;
    }

    public String getAuthorization() {
        return Authorization;
    }

    public String getExpect() {
        return Expect;
    }

    public String getForwarded() {
        return Forwarded;
    }

    public String getHost() {
        return Host;
    }

    public String getIfMatch() {
        return IfMatch;
    }

    public String getIfModifiedSince() {
        return IfModifiedSince;
    }

    public String getIfNoneMatch() {
        return IfNoneMatch;
    }

    public String getIfRange() {
        return IfRange;
    }

    public String getIfUnmodifiedSince() {
        return IfUnmodifiedSince;
    }

    public String getOrigin() {
        return Origin;
    }

    public String getReferer() {
        return Referer;
    }

    public String getTE() {
        return TE;
    }

    public String getUserAgent() {
        return UserAgent;
    }

    public String getUpgradeInsecureRequests() {
        return UpgradeInsecureRequests;
    }

    public void setAccept(String accept) {
        this.Accept = accept;
    }

    public void setUpgradeInsecureRequests(String upgradeInsecureRequests) {
        this.UpgradeInsecureRequests = upgradeInsecureRequests;
    }

    public void setUserAgent(String userAgent) {
        this.UserAgent = userAgent;
    }

    public void setTE(String TE) {
        this.TE = TE;
    }

    public void setReferer(String referer) {
        this.Referer = referer;
    }

    public void setOrigin(String origin) {
        this.Origin = origin;
    }

    public void setIfUnmodifiedSince(String ifUnmodifiedSince) {
        this.IfUnmodifiedSince = ifUnmodifiedSince;
    }

    public void setIfRange(String ifRange) {
        this.IfRange = ifRange;
    }

    public void setIfNoneMatch(String ifNoneMatch) {
        this.IfNoneMatch = ifNoneMatch;
    }

    public void setIfModifiedSince(String ifModifiedSince) {
        this.IfModifiedSince = ifModifiedSince;
    }

    public void setIfMatch(String ifMatch) {
        this.IfMatch = ifMatch;
    }

    public void setHost(String host) {
        this.Host = host;
    }

    public void setForwarded(String forwarded) {
        this.Forwarded = forwarded;
    }

    public void setExpect(String expect) {
        this.Expect = expect;
    }

    public void setAuthorization(String authorization) {
        this.Authorization = authorization;
    }

    public void setAcceptLanguage(String acceptLanguage) {
        this.AcceptLanguage = acceptLanguage;
    }

    public void setAcceptEncoding(String acceptEncoding) {
        this.AcceptEncoding = acceptEncoding;
    }

    public void setAcceptCharset(String acceptCharset) {
        this.AcceptCharset = acceptCharset;
    }
}
