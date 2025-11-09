// HashMap contains the unique keys.
// if again try to enter the existing key then the value of that key will get updated.


import java.util.HashMap;
import java.util.Map;

public class useMap {
    public static void main(String [] args){
        Map<String, Integer> numbers = new HashMap<>();

        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);

        System.out.println(numbers);

        // will override the value of Two
        if(!numbers.containsKey("Two")){
            numbers.put("Two", 23);
        }
        
        System.out.println(numbers);

        numbers.putIfAbsent("Two", 55);

        // traverse the hashmap
        for(Map.Entry<String, Integer> e: numbers.entrySet()){
            System.out.println(e);
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        // print the keys 
        for(String key: numbers.keySet()){
            System.out.println(key);
        }
        
        // print the values 
        for(Integer value: numbers.values()){
            System.out.println(value);
        }
        
        // if map contains the value 2
        numbers.containsValue(2);

        // check is map is empty
        numbers.isEmpty();

        // to remove the key from map
        numbers.remove("Three");

    }    
}
