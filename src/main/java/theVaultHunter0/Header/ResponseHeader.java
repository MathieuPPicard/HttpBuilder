package theVaultHunter0.Header;

import theVaultHunter0.Header.Section.*;

public class ResponseHeader extends Header{

    private final ResponseSpecific responseSpecific;

    public ResponseHeader(ResponseSpecific responseSpecific, GeneralHeader generalHeader, EntityHeader entityHeader, SecurityHeader securityHeader, CustomHeader customHeader) {
        super(generalHeader, entityHeader, securityHeader, customHeader);
        this.responseSpecific = responseSpecific;
    }

    public ResponseSpecific getResponseSpecific() {
        return this.responseSpecific;
    }

    @Override
    public String toString() {
        return super.toString() + this.responseSpecific.toString();
    }
}
