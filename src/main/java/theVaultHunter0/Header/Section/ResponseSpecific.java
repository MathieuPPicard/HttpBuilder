package theVaultHunter0.Header.Section;

public class ResponseSpecific extends Section {
    private String AcceptRanges;
    private String Age;
    private String Etag;
    private String Location;
    private String ProxyAuthenticate;
    private String RetryAfter;
    private String Server;
    private String Vary;
    private String WWWAuthenticate;

    public ResponseSpecific() {}

    public ResponseSpecific(String acceptRanges, String age, String etag, String location, String proxyAuthenticate, String retryAfter, String server, String vary, String wwwAuthenticate) {
        this.AcceptRanges = acceptRanges;
        this.Age = age;
        this.Etag = etag;
        this.Location = location;
        this.ProxyAuthenticate = proxyAuthenticate;
        this.RetryAfter = retryAfter;
        this.Server = server;
        this.Vary = vary;
        this.WWWAuthenticate = wwwAuthenticate;
    }

    public String getAcceptRanges() {
        return AcceptRanges;
    }

    public String getAge() {
        return Age;
    }

    public String getEtag() {
        return Etag;
    }

    public String getLocation() {
        return Location;
    }

    public String getProxyAuthenticate() {
        return ProxyAuthenticate;
    }

    public String getRetryAfter() {
        return RetryAfter;
    }

    public String getServer() {
        return Server;
    }

    public String getVary() {
        return Vary;
    }

    public String getWWWAuthenticate() {
        return WWWAuthenticate;
    }

    public void setAcceptRanges(String acceptRanges) {
        this.AcceptRanges = acceptRanges;
    }

    public void setAge(String age) {
        this.Age = age;
    }

    public void setEtag(String etag) {
        this.Etag = etag;
    }

    public void setLocation(String location) {
        this.Location = location;
    }

    public void setProxyAuthenticate(String proxyAuthenticate) {
        this.ProxyAuthenticate = proxyAuthenticate;
    }

    public void setRetryAfter(String retryAfter) {
        this.RetryAfter = retryAfter;
    }

    public void setServer(String server) {
        this.Server = server;
    }

    public void setVary(String vary) {
        this.Vary = vary;
    }

    public void setWWWAuthenticate(String WWWAuthenticate) {
        this.WWWAuthenticate = WWWAuthenticate;
    }
}
