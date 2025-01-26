package theVaultHunter0.Header.Section;

import java.lang.reflect.Field;

public class Section {

    public String toString(){
        StringBuilder result = new StringBuilder();
        Class<?> type = this.getClass();
        Field[] fields = type.getDeclaredFields();
        for(Field field : fields){
            field.setAccessible(true);
            try {
            if(field.get(this) != null){
                result.append(field.getName()).append(": ").append(field.get(this)).append("\r\n");
            }
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }
        return result.toString();
    }

    public boolean verifyParameterExist(String parameter){
        Class<?> type = this.getClass();
        Field[] fields = type.getDeclaredFields();
        for(Field field : fields){
            if(field.getName().equals(parameter)){
                return true;
            }
        }
        return false;
    }

    public void assignValueToParameter(String parameter, String value) throws IllegalAccessException {
        Class<?> type = this.getClass();
        Field[] fields = type.getDeclaredFields();
        for(Field field : fields){
            if(field.getName().equals(parameter)){
                field.setAccessible(true);
                field.set(this, value);
                return;
            }
        }
    }
}
