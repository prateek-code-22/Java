// HashMap contains the unique keys.
// if again try to enter the existing key then the value of that key will get updated.


import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class useMap {
    public static void main(String [] args){

        //HashMap - not threadsafe
        Map<String, Integer> numbers = new HashMap<>();

        //HashTable is thread safe

        //LinkedHashMap not thread safe, maintains order, insertion/access.
        Map<String, Integer> num = new LinkedHashMap<>();

        //to make thread safe
        Map<String, Integer> threadSafe= Collections.synchronizedMap(new LinkedHashMap<>());

        //for access order(least used to most used)
        Map<String, Integer> accessorder = new LinkedHashMap<>(16, .75F,true);

        num.put("hi", 1);        
        num.put("hey", 2);        
        num.put("bye", 3);        


        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);

        System.out.println(numbers);

        // create map int:int
        // for(int num: numbers){
        //     map.put(numbers, map.getOrDefault(numbers, 0) + 1);
        // }

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
