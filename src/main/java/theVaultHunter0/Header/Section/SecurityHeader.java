package theVaultHunter0.Header.Section;

public class SecurityHeader extends Section {
    private String ContentSecurityPolicy;
    private String StrictTransportSecurity;
    private String XContentTypeOptions;
    private String XFrameOptions;
    private String XXssProtection;
    private String SetCookie;
    private String Cookie;
    private String Authorization;
    private String WWWAuthenticate;
    private String ProxyAuthenticate;
    private String ProxyAuthorization;
    private String AccessControlAllowOrigin;
    private String AccessControlAllowCredentials;
    private String AccessControlAllowHeader;
    private String AccessControlAllowMethods;
    private String AccessControlExposeHeaders;
    private String AccessControlMaxAge;

    public SecurityHeader() {}

    public SecurityHeader(String contentSecurityPolicy, String strictTransportSecurity, String xContentTypeOptions, String xFrameOptions, String xXssProtection, String setCookie, String cookie, String authorization, String wwwAuthenticate, String proxyAuthenticate, String proxyAuthorization, String accesControlAllowOrigin, String accesControlAllowCredentials, String accesContorlAllowHeader, String accesControlAllowMethods, String accesControlExposeHeaders, String accesControlMaxAge) {
        this.ContentSecurityPolicy = contentSecurityPolicy;
        this.StrictTransportSecurity = strictTransportSecurity;
        this.XContentTypeOptions = xContentTypeOptions;
        this.XFrameOptions = xFrameOptions;
        this.XXssProtection = xXssProtection;
        this.SetCookie = setCookie;
        this.Cookie = cookie;
        this.Authorization = authorization;
        this.WWWAuthenticate = wwwAuthenticate;
        this.ProxyAuthenticate = proxyAuthenticate;
        this.ProxyAuthorization = proxyAuthorization;
        this.AccessControlAllowOrigin = accesControlAllowOrigin;
        this.AccessControlAllowCredentials = accesControlAllowCredentials;
        this.AccessControlAllowHeader = accesContorlAllowHeader;
        this.AccessControlAllowMethods = accesControlAllowMethods;
        this.AccessControlExposeHeaders = accesControlExposeHeaders;
        this.AccessControlMaxAge = accesControlMaxAge;
    }

    public String getContentSecurityPolicy() {
        return ContentSecurityPolicy;
    }

    public String getStrictTransportSecurity() {
        return StrictTransportSecurity;
    }

    public String getXContentTypeOptions() {
        return XContentTypeOptions;
    }

    public String getXFrameOptions() {
        return XFrameOptions;
    }

    public String getXXssProtection() {
        return XXssProtection;
    }

    public String getSetCookie() {
        return SetCookie;
    }

    public String getCookie() {
        return Cookie;
    }

    public String getAuthorization() {
        return Authorization;
    }

    public String getWWWAuthenticate() {
        return WWWAuthenticate;
    }

    public String getProxyAuthenticate() {
        return ProxyAuthenticate;
    }

    public String getProxyAuthorization() {
        return ProxyAuthorization;
    }

    public String getAccessControlAllowOrigin() {
        return AccessControlAllowOrigin;
    }

    public String getAccessControlAllowCredentials() {
        return AccessControlAllowCredentials;
    }

    public String getAccessControlAllowHeader() {
        return AccessControlAllowHeader;
    }

    public String getAccessControlAllowMethods() {
        return AccessControlAllowMethods;
    }

    public String getAccessControlExposeHeaders() {
        return AccessControlExposeHeaders;
    }

    public String getAccessControlMaxAge() {
        return AccessControlMaxAge;
    }

    public void setContentSecurityPolicy(String contentSecurityPolicy) {
        this.ContentSecurityPolicy = contentSecurityPolicy;
    }

    public void setStrictTransportSecurity(String strictTransportSecurity) {
        this.StrictTransportSecurity = strictTransportSecurity;
    }

    public void setXContentTypeOptions(String XContentTypeOptions) {
        this.XContentTypeOptions = XContentTypeOptions;
    }

    public void setXFrameOptions(String XFrameOptions) {
        this.XFrameOptions = XFrameOptions;
    }

    public void setXXssProtection(String XXssProtection) {
        this.XXssProtection = XXssProtection;
    }

    public void setSetCookie(String setCookie) {
        this.SetCookie = setCookie;
    }

    public void setCookie(String cookie) {
        this.Cookie = cookie;
    }

    public void setAuthorization(String authorization) {
        this.Authorization = authorization;
    }

    public void setWWWAuthenticate(String WWWAuthenticate) {
        this.WWWAuthenticate = WWWAuthenticate;
    }

    public void setProxyAuthenticate(String proxyAuthenticate) {
        this.ProxyAuthenticate = proxyAuthenticate;
    }

    public void setProxyAuthorization(String proxyAuthorization) {
        this.ProxyAuthorization = proxyAuthorization;
    }

    public void setAccessControlAllowOrigin(String accessControlAllowOrigin) {
        this.AccessControlAllowOrigin = accessControlAllowOrigin;
    }

    public void setAccessControlAllowCredentials(String accessControlAllowCredentials) {
        this.AccessControlAllowCredentials = accessControlAllowCredentials;
    }

    public void setAccessControlAllowHeader(String accessControlAllowHeader) {
        this.AccessControlAllowHeader = accessControlAllowHeader;
    }

    public void setAccessControlAllowMethods(String accessControlAllowMethods) {
        this.AccessControlAllowMethods = accessControlAllowMethods;
    }

    public void setAccessControlExposeHeaders(String accessControlExposeHeaders) {
        this.AccessControlExposeHeaders = accessControlExposeHeaders;
    }

    public void setAccessControlMaxAge(String accessControlMaxAge) {
        this.AccessControlMaxAge = accessControlMaxAge;
    }
}
