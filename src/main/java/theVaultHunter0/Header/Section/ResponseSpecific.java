package theVaultHunter0.Header.Section;

import theVaultHunter0.As;

public class ResponseSpecific extends Section {
    @As("accept-ranges")
    private String AcceptRanges;
    @As("age")
    private String Age;
    @As("e-tag")
    private String Etag;
    @As("location")
    private String Location;
    @As("proxy-authenticate")
    private String ProxyAuthenticate;
    @As("retry-after")
    private String RetryAfter;
    @As("server")
    private String Server;
    @As("vary")
    private String Vary;


    public ResponseSpecific() {}

    public ResponseSpecific(String acceptRanges, String age, String etag, String location, String proxyAuthenticate, String retryAfter, String server, String vary) {
        this.AcceptRanges = acceptRanges;
        this.Age = age;
        this.Etag = etag;
        this.Location = location;
        this.ProxyAuthenticate = proxyAuthenticate;
        this.RetryAfter = retryAfter;
        this.Server = server;
        this.Vary = vary;
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
}
