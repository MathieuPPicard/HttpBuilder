package theVaultHunter0.Header.Section;

public class ResponseSpecific {

    private String acceptRanges;
    private String age;
    private String etag;
    private String location;
    private String proxyAuthenticate;
    private String retryAfter;
    private String server;
    private String vary;
    private String wwwAuthenticate;

    public ResponseSpecific() {}

    public ResponseSpecific(String acceptRanges, String age, String etag, String location, String proxyAuthenticate, String retryAfter, String server, String vary, String wwwAuthenticate) {
        this.acceptRanges = acceptRanges;
        this.age = age;
        this.etag = etag;
        this.location = location;
        this.proxyAuthenticate = proxyAuthenticate;
        this.retryAfter = retryAfter;
        this.server = server;
        this.vary = vary;
        this.wwwAuthenticate = wwwAuthenticate;
    }

    public String getAcceptRanges() {
        return acceptRanges;
    }

    public String getAge() {
        return age;
    }

    public String getEtag() {
        return etag;
    }

    public String getLocation() {
        return location;
    }

    public String getProxyAuthenticate() {
        return proxyAuthenticate;
    }

    public String getRetryAfter() {
        return retryAfter;
    }

    public String getServer() {
        return server;
    }

    public String getVary() {
        return vary;
    }

    public String getWwwAuthenticate() {
        return wwwAuthenticate;
    }
}
