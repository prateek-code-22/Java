// HashMap contains the unique keys.
// if again try to enter the existing key then the value of that key will get updated.


import java.util.Map;
import java.util.HashMap;

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

        for(Map.Entry<String, Integer> e: numbers.entrySet()){
            System.out.println(e);
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        





    }    
}
