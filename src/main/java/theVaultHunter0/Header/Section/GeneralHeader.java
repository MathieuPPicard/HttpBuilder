package theVaultHunter0.Header.Section;

public class GeneralHeader {
    private String cacheControl;
    private String connection;
    private String Date;
    private String pragma;
    private String trailer;
    private String transferEncoding;
    private String upgrade;
    private String via;
    private String warning;

    public GeneralHeader() {}

    public GeneralHeader(String cacheControl, String connection, String date, String pragma, String trailer, String transferEncoding, String upgrade, String via, String warning) {
        this.cacheControl = cacheControl;
        this.connection = connection;
        this.Date = date;
        this.pragma = pragma;
        this.trailer = trailer;
        this.transferEncoding = transferEncoding;
        this.upgrade = upgrade;
        this.via = via;
        this.warning = warning;
    }

    public String getCacheControl() {
        return cacheControl;
    }

    public String getConnection() {
        return connection;
    }

    public String getDate() {
        return Date;
    }

    public String getPragma() {
        return pragma;
    }

    public String getTrailer() {
        return trailer;
    }

    public String getTransferEncoding() {
        return transferEncoding;
    }

    public String getUpgrade() {
        return upgrade;
    }

    public String getVia() {
        return via;
    }

    public String getWarning() {
        return warning;
    }

    public void setWarning(String warning) {
        this.warning = warning;
    }

    public void setCacheControl(String cacheControl) {
        this.cacheControl = cacheControl;
    }

    public void setConnection(String connection) {
        this.connection = connection;
    }

    public void setDate(String date) {
        Date = date;
    }

    public void setPragma(String pragma) {
        this.pragma = pragma;
    }

    public void setTrailer(String trailer) {
        this.trailer = trailer;
    }

    public void setTransferEncoding(String transferEncoding) {
        this.transferEncoding = transferEncoding;
    }

    public void setUpgrade(String upgrade) {
        this.upgrade = upgrade;
    }

    public void setVia(String via) {
        this.via = via;
    }
}
