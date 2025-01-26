package theVaultHunter0.Header.Section;

public class GeneralHeader extends Section{
    private String CacheControl;
    private String Connection;
    private String Date;
    private String Pragma;
    private String Trailer;
    private String TransferEncoding;
    private String Upgrade;
    private String Via;
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
