package theVaultHunter0.Header.Section;

public class SecurityHeader {
    private String contentSecurityPolicy;
    private String strictTransportSecurity;
    private String xContentTypeOptions;
    private String xFrameOptions;
    private String xXssProtection;
    private String setCookie;
    private String cookie;
    private String authorization;
    private String wwwAuthenticate;
    private String proxyAuthenticate;
    private String proxyAuthorization;
    private String accesControlAllowOrigin;
    private String accesControlAllowCredentials;
    private String accesContorlAllowHeader;
    private String accesControlAllowMethods;
    private String accesControlExposeHeaders;
    private String accesControlMaxAge;

    public SecurityHeader() {}

    public SecurityHeader(String contentSecurityPolicy, String strictTransportSecurity, String xContentTypeOptions, String xFrameOptions, String xXssProtection, String setCookie, String cookie, String authorization, String wwwAuthenticate, String proxyAuthenticate, String proxyAuthorization, String accesControlAllowOrigin, String accesControlAllowCredentials, String accesContorlAllowHeader, String accesControlAllowMethods, String accesControlExposeHeaders, String accesControlMaxAge) {
        this.contentSecurityPolicy = contentSecurityPolicy;
        this.strictTransportSecurity = strictTransportSecurity;
        this.xContentTypeOptions = xContentTypeOptions;
        this.xFrameOptions = xFrameOptions;
        this.xXssProtection = xXssProtection;
        this.setCookie = setCookie;
        this.cookie = cookie;
        this.authorization = authorization;
        this.wwwAuthenticate = wwwAuthenticate;
        this.proxyAuthenticate = proxyAuthenticate;
        this.proxyAuthorization = proxyAuthorization;
        this.accesControlAllowOrigin = accesControlAllowOrigin;
        this.accesControlAllowCredentials = accesControlAllowCredentials;
        this.accesContorlAllowHeader = accesContorlAllowHeader;
        this.accesControlAllowMethods = accesControlAllowMethods;
        this.accesControlExposeHeaders = accesControlExposeHeaders;
        this.accesControlMaxAge = accesControlMaxAge;
    }

    public String getContentSecurityPolicy() {
        return contentSecurityPolicy;
    }

    public String getStrictTransportSecurity() {
        return strictTransportSecurity;
    }

    public String getxContentTypeOptions() {
        return xContentTypeOptions;
    }

    public String getxFrameOptions() {
        return xFrameOptions;
    }

    public String getxXssProtection() {
        return xXssProtection;
    }

    public String getSetCookie() {
        return setCookie;
    }

    public String getCookie() {
        return cookie;
    }

    public String getAuthorization() {
        return authorization;
    }

    public String getWwwAuthenticate() {
        return wwwAuthenticate;
    }

    public String getProxyAuthenticate() {
        return proxyAuthenticate;
    }

    public String getProxyAuthorization() {
        return proxyAuthorization;
    }

    public String getAccesControlAllowOrigin() {
        return accesControlAllowOrigin;
    }

    public String getAccesControlAllowCredentials() {
        return accesControlAllowCredentials;
    }

    public String getAccesContorlAllowHeader() {
        return accesContorlAllowHeader;
    }

    public String getAccesControlAllowMethods() {
        return accesControlAllowMethods;
    }

    public String getAccesControlExposeHeaders() {
        return accesControlExposeHeaders;
    }

    public String getAccesControlMaxAge() {
        return accesControlMaxAge;
    }

    public void setContentSecurityPolicy(String contentSecurityPolicy) {
        this.contentSecurityPolicy = contentSecurityPolicy;
    }

    public void setStrictTransportSecurity(String strictTransportSecurity) {
        this.strictTransportSecurity = strictTransportSecurity;
    }

    public void setxContentTypeOptions(String xContentTypeOptions) {
        this.xContentTypeOptions = xContentTypeOptions;
    }

    public void setxFrameOptions(String xFrameOptions) {
        this.xFrameOptions = xFrameOptions;
    }

    public void setxXssProtection(String xXssProtection) {
        this.xXssProtection = xXssProtection;
    }

    public void setSetCookie(String setCookie) {
        this.setCookie = setCookie;
    }

    public void setCookie(String cookie) {
        this.cookie = cookie;
    }

    public void setAuthorization(String authorization) {
        this.authorization = authorization;
    }

    public void setWwwAuthenticate(String wwwAuthenticate) {
        this.wwwAuthenticate = wwwAuthenticate;
    }

    public void setProxyAuthenticate(String proxyAuthenticate) {
        this.proxyAuthenticate = proxyAuthenticate;
    }

    public void setProxyAuthorization(String proxyAuthorization) {
        this.proxyAuthorization = proxyAuthorization;
    }

    public void setAccesControlAllowOrigin(String accesControlAllowOrigin) {
        this.accesControlAllowOrigin = accesControlAllowOrigin;
    }

    public void setAccesControlAllowCredentials(String accesControlAllowCredentials) {
        this.accesControlAllowCredentials = accesControlAllowCredentials;
    }

    public void setAccesContorlAllowHeader(String accesContorlAllowHeader) {
        this.accesContorlAllowHeader = accesContorlAllowHeader;
    }

    public void setAccesControlAllowMethods(String accesControlAllowMethods) {
        this.accesControlAllowMethods = accesControlAllowMethods;
    }

    public void setAccesControlExposeHeaders(String accesControlExposeHeaders) {
        this.accesControlExposeHeaders = accesControlExposeHeaders;
    }

    public void setAccesControlMaxAge(String accesControlMaxAge) {
        this.accesControlMaxAge = accesControlMaxAge;
    }
}
