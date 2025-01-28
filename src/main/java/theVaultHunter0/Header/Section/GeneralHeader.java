package theVaultHunter0.Header.Section;

import theVaultHunter0.As;

public class GeneralHeader extends Section{
    @As("cache-control")
    private String CacheControl;
    @As("connection")
    private String Connection;
    @As("date")
    private String Date;
    @As("pragma")
    private String Pragma;
    @As("trailer")
    private String Trailer;
    @As("transfer-encoding")
    private String TransferEncoding;
    @As("upgrade")
    private String Upgrade;
    @As("via")
    private String Via;
    @As("warning")
    private String Warning;

    public GeneralHeader() {}

    public GeneralHeader(String cacheControl, String connection, String date, String pragma, String trailer, String transferEncoding, String upgrade, String via, String warning) {
        this.CacheControl = cacheControl;
        this.Connection = connection;
        this.Date = date;
        this.Pragma = pragma;
        this.Trailer = trailer;
        this.TransferEncoding = transferEncoding;
        this.Upgrade = upgrade;
        this.Via = via;
        this.Warning = warning;
    }

    public String getCacheControl() {
        return CacheControl;
    }

    public String getConnection() {
        return Connection;
    }

    public String getDate() {
        return Date;
    }

    public String getPragma() {
        return Pragma;
    }

    public String getTrailer() {
        return Trailer;
    }

    public String getTransferEncoding() {
        return TransferEncoding;
    }

    public String getUpgrade() {
        return Upgrade;
    }

    public String getVia() {
        return Via;
    }

    public String getWarning() {
        return Warning;
    }

    public void setWarning(String warning) {
        this.Warning = warning;
    }

    public void setCacheControl(String cacheControl) {
        this.CacheControl = cacheControl;
    }

    public void setConnection(String connection) {
        this.Connection = connection;
    }

    public void setDate(String date) {
        Date = date;
    }

    public void setPragma(String pragma) {
        this.Pragma = pragma;
    }

    public void setTrailer(String trailer) {
        this.Trailer = trailer;
    }

    public void setTransferEncoding(String transferEncoding) {
        this.TransferEncoding = transferEncoding;
    }

    public void setUpgrade(String upgrade) {
        this.Upgrade = upgrade;
    }

    public void setVia(String via) {
        this.Via = via;
    }
}
