import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionClass {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(12);
        list.add(42);
        list.add(52);
        list.add(72);
        list.add(82);
        
        // to return the minimum from the list
        System.out.println(Collections.min(list));
    
        // to return the maximum from the list
        System.out.println(Collections.max(list));
    
        // to find the count of element in list
        System.out.println(Collections.frequency(list, 52));
    
        // sorting
        Collections.sort(list);
        // in reverse=desc
        Collections.sort(list, Comparator.reverseOrder());

        
    }    
}
