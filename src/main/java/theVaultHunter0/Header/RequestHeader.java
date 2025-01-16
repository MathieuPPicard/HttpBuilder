package theVaultHunter0.Header;

import theVaultHunter0.Header.Section.*;

public class RequestHeader extends Header {

    private final RequestSpecific requestSpecific;

    public RequestHeader(RequestSpecific requestSpecific,GeneralHeader generalHeader, EntityHeader entityHeader, SecurityHeader securityHeader, CustomHeader customHeader) {
        super(generalHeader, entityHeader, securityHeader, customHeader);
        this.requestSpecific = requestSpecific;
    }

    public RequestSpecific getRequestSpecific() {
        return this.requestSpecific;
    }

    @Override
    public String toString() {
        return super.toString() + this.requestSpecific.toString();
    }
}
