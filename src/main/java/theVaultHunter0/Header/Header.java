package theVaultHunter0.Header;

import theVaultHunter0.As;
import theVaultHunter0.Header.Section.*;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

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

    public static Header fromString(HashMap<String, String> map) throws IllegalAccessException, InvocationTargetException {
        Header result = new Header();
        Map<String, String> parameterToSection = result.getParameterToSection();
        for(Map.Entry<String, String> entry : map.entrySet()){
            String key = entry.getKey().toLowerCase();
            String section = parameterToSection.get(key);
            result = initSection(section, result);
            if(section != null){
                //entry need to go in its appropriate section
                result = initParameter(section, key, entry.getValue(), result);
            }
            else{
                //entry need to go into custom
                result.getCustomHeader().getMap().put(entry.getKey(), entry.getValue());
            }
        }
        return result;
    }

    private static Header initParameter(String section, String parameter, String value, Header header) throws IllegalAccessException, InvocationTargetException {
        Class<?> type = header.getClass();
        Field[] fields = type.getDeclaredFields();
        for(Field field : fields){
            Object obj = field.get(header);
            field.setAccessible(true);
            if(field.getName().equals(section)){
                Method[] methods = field.getType().getDeclaredMethods();
                for(Method method : methods){
                    String strMethod = method.getName().toLowerCase();
                    parameter = removeSpacesAndDashes(parameter);
                    if(strMethod.equals("set" + parameter)){
                        method.invoke(obj, value);
                    }
                }

//                Field[] SectionFields = field.getType().getDeclaredFields();
//                for(Field sectionField : SectionFields){
//                    sectionField.setAccessible(true);
//                    if(sectionField.getAnnotation(As.class).value().equals(parameter)){
//                        sectionField.set(, value);
//                        return header;
//                    }
//                }
            }
        }
        return header;
    }

    //Verify if the section in the header pass in args is already init if not it add it to the header.
    private static Header initSection(String section, Header header) throws IllegalAccessException {
        Class<?> type = header.getClass();
        Field[] fields = type.getDeclaredFields();
        for(Field field : fields){
            field.setAccessible(true);
            if(field.getName().equals("customHeader")){
                if(section == null)
                {
                    if(field.get(header) == null){
                        header.addCustomHeader();
                        header.getCustomHeader().setMap(new HashMap<String,String>());
                        return header;
                    }
                }
            }
            if(field.getName().equals(section)){
                //Verify if the section is not already initialise
                if(field.get(header) == null){
                    //If not add the section to the object
                    switch(section){
                        case "responseHeader" : {header.addResponseSpecificHeader();
                            break;}
                        case "requestHeader" : {header.addRequestSpecificHeader();
                            break;}
                        case "entityHeader" : {header.addEntityHeader();
                            break;}
                        case "securityHeader" : {header.addSecurityHeader();
                            break;}
                        case "generalHeader" : {header.addGeneralHeader();
                            break;}
                    }
                }
                return header;
            }
        }
        return header;
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

    //Create the hashmap of parameter : section
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

    public static String removeSpacesAndDashes(String input) {
        if (input == null) {
            return null; // Handle null case
        }
        return input.replaceAll("[\\s-]", ""); // Remove spaces and dashes
    }
}
