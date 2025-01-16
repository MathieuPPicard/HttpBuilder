package theVaultHunter0.Header;

import theVaultHunter0.Header.Section.CustomHeader;
import theVaultHunter0.Header.Section.EntityHeader;
import theVaultHunter0.Header.Section.GeneralHeader;
import theVaultHunter0.Header.Section.SecurityHeader;

import java.lang.reflect.Field;

public class Header {

    private GeneralHeader generalHeader;
    private EntityHeader entityHeader;
    private SecurityHeader securityHeader;
    private CustomHeader customHeader;

    public Header(GeneralHeader generalHeader, EntityHeader entityHeader,
                  SecurityHeader securityHeader, CustomHeader customHeader) {
        this.generalHeader = generalHeader;
        this.entityHeader = entityHeader;
        this.securityHeader = securityHeader;
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
}
