package theVaultHunter0.Header;

import theVaultHunter0.Header.Section.*;

import java.lang.reflect.Field;
import java.util.HashMap;

public class Header {

    private GeneralHeader generalHeader;
    private EntityHeader entityHeader;
    private SecurityHeader securityHeader;
    private CustomHeader customHeader;
    private ResponseSpecific responseHeader;
    private RequestSpecific requestHeader;

    public Header() {

    }

    public Header(GeneralHeader generalHeader, EntityHeader entityHeader,
                  SecurityHeader securityHeader, CustomHeader customHeader,
                  ResponseSpecific responseHeader, RequestSpecific requestHeader) {
        this.generalHeader = generalHeader;
        this.entityHeader = entityHeader;
        this.securityHeader = securityHeader;
        this.customHeader = customHeader;
        this.responseHeader = responseHeader;
        this.requestHeader = requestHeader;
    }

    public Header(CustomHeader customHeader) {
        this.customHeader = customHeader;
    }

    public String toString(){
        StringBuilder result = new StringBuilder();
        Class<?> type = this.getClass();
        Field[] fields = type.getDeclaredFields();
        for(Field field : fields){
            field.setAccessible(true);
            try{
                if(field.get(this) != null){
                    result.append(field.get(this).toString());
                }
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }

        }
        return result.toString();
    }

    public static Header fromString(HashMap<String, String> map, boolean isRequest){
        CustomHeader custom = new CustomHeader(map);
        if(isRequest)
        {
            return new Header(custom);
        }
        else{
            return new Header(custom);
        }
    }

    public boolean validateSection(String section) {
        Section nsec;
        switch (section.toLowerCase()) {
            case "response" -> nsec = getResponseHeader();
            case "general" -> nsec = getGeneralHeader();
            case "entity" -> nsec = getEntityHeader();
            case "security" -> nsec = getSecurityHeader();
            case "custom" -> nsec = getCustomHeader();
            case "request" -> nsec = getRequestHeader();
            default -> {
                return false;
            }
        };

        return nsec != null;
    }

    public CustomHeader getCustomHeader() {
        return customHeader;
    }

    public void addCustomHeader() {
        this.customHeader = new CustomHeader();
    }

    public SecurityHeader getSecurityHeader() {
        return securityHeader;
    }

    public void addSecurityHeader(){
        this.securityHeader = new SecurityHeader();
    }

    public EntityHeader getEntityHeader() {
        return entityHeader;
    }

    public void addEntityHeader(){
        this.entityHeader = new EntityHeader();
    }

    public GeneralHeader getGeneralHeader() {
        return generalHeader;
    }

    public void addGeneralHeader(){
        this.generalHeader = new GeneralHeader();
    }

    public ResponseSpecific getResponseHeader() {
        return responseHeader;
    }

    public void addResponseSpecificHeader(){
        this.responseHeader = new ResponseSpecific();
    }

    public RequestSpecific getRequestHeader() {
        return requestHeader;
    }

    public void addRequestSpecificHeader(){
        this.requestHeader = new RequestSpecific();
    }
}
