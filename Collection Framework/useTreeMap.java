import java.util.Map;
import java.util.TreeMap;

public class useTreeMap {
    
    public static void main(String [] args){
        Map<Integer, String> map1 = new TreeMap<>((Integer key1, Integer key2 ) -> key2 - key1);
        map1.put(21, "SJ");
        map1.put(21, "AJ");
        map1.put(21, "PJ");
        map1.put(21, "OJ");
        
        map1.forEach((Integer key, String value) -> System.out.println(key + ":" + value));

    }
}
