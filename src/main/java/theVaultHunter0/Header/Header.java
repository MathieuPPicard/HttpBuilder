package theVaultHunter0.Header;

import theVaultHunter0.As;
import theVaultHunter0.Header.Section.*;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class Header {

    private static Map<String, String> parameterToSection = new HashMap<>();
    private GeneralHeader generalHeader;
    private EntityHeader entityHeader;
    private SecurityHeader securityHeader;
    private CustomHeader customHeader;
    private ResponseSpecific responseHeader;
    private RequestSpecific requestHeader;

    public Header() {
        initParameterToSection();
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
        initParameterToSection();
    }

    public Header(CustomHeader customHeader) {
        this.customHeader = customHeader;
        initParameterToSection();
    }

    public String toString(){
        StringBuilder result = new StringBuilder();
        Class<?> type = this.getClass();
        Field[] fields = type.getDeclaredFields();
        for(Field field : fields){
            if(!field.getName().equals("parameterToSection")){
                field.setAccessible(true);
                try{
                    if(field.get(this) != null){
                        result.append(field.get(this).toString());
                    }
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return result.toString();
    }

    public static Header fromString(HashMap<String, String> map, boolean isRequest){
        Header result = new Header();
        Map<String, String> parameterToSection = result.getParameterToSection();
        for(Map.Entry<String, String> entry : map.entrySet()){
            String key = entry.getKey();
            String section = parameterToSection.get(key);
            //
            //Find a way to initialize section, verify if the section as already been initialised.
            //
            if(!(section == null)){
                //entry need to go in its appropriate section
            }
            else{
                //entry need to go into custom
            }
        }

        return new Header();
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

    private void initParameterToSection(){
        Map<String, String> result = new HashMap<>();
        Class<?> type = this.getClass();
        Field[] fields = type.getDeclaredFields();
        for(Field field : fields){
            field.setAccessible(true);
            if(!field.getName().equals("parameterToSection") && !field.getName().equals("customHeader")){
               Field[] SectionFields = field.getType().getDeclaredFields();
               for(Field SectionField : SectionFields){
                   SectionField.setAccessible(true);
                   String fieldName = SectionField.getAnnotation(As.class).value();
                   String section = field.getName();
                   result.put(fieldName, section);
               }
            }
        }
        parameterToSection = result;
    }

    public Map<String, String> getParameterToSection(){
        return parameterToSection;
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
