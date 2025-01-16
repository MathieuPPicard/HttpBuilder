package theVaultHunter0.Header;

import theVaultHunter0.Header.Section.*;

import java.lang.reflect.Field;
import java.util.Map;

public class Header {

    private GeneralHeader generalHeader;
    private EntityHeader entityHeader;
    private SecurityHeader securityHeader;
    private CustomHeader customHeader;
    private ResponseSpecific responseHeader;
    private RequestSpecific requestHeader;

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

    public static Header fromString(Map<String, String> map, boolean isRequest){
        CustomHeader custom = new CustomHeader(map);
        if(isRequest)
        {
            return new Header(custom);
        }
        else{
            return new Header(custom);
        }
    }

    public CustomHeader getCustomHeader() {
        return customHeader;
    }

    public SecurityHeader getSecurityHeader() {
        return securityHeader;
    }

    public EntityHeader getEntityHeader() {
        return entityHeader;
    }

    public GeneralHeader getGeneralHeader() {
        return generalHeader;
    }

    public ResponseSpecific getResponseHeader() {
        return responseHeader;
    }

    public RequestSpecific getRequestHeader() {
        return requestHeader;
    }
}
