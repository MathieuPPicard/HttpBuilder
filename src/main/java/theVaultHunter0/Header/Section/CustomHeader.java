package theVaultHunter0.Header.Section;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class CustomHeader extends Section {

    private Map<String,String> map;

    public CustomHeader(){}

    public CustomHeader(HashMap<String,String> map) {
        this.map = map;
    }

    public String toString() {
        String result = "";
        for (Map.Entry<String,String> entry : map.entrySet()) {
            result += entry.getKey() + ": " + entry.getValue() + "\n";
        }
        return result;
    }

    public boolean verifyParameterExist(String parameter){
        return map.containsKey(parameter);
    }

    public void assignValueToParameter(String parameter, String value){
        map.put(parameter,value);
    }

    public Map<String, String> getMap(){
        return map;
    }

    public void setMap(Map<String, String> map){
        this.map = map;
    }
}
