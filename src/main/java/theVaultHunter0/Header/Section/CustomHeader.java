package theVaultHunter0.Header.Section;

import java.util.HashMap;
import java.util.Map;

public class CustomHeader extends Section {

    private Map<String,String> map;

    public CustomHeader(Map<String,String> map) {
        this.map = map;
    }

    public String toString() {
        String result = "";
        for (Map.Entry<String,String> entry : map.entrySet()) {
            result += entry.getKey() + ": " + entry.getValue() + "\n";
        }
        return result;
    }

    public Map<String, String> getMap(){
        return map;
    }

}
