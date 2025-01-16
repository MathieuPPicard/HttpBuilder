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
}
