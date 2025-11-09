// hashing concept is used inside set to check duplicate values and it stores only the unique values.

import java.util.HashSet;
import java.util.Set;

public class useSet {
    public static void main(String [] args){
        Set<Integer> set = new HashSet<>(); // O(1) acceess
        // Set<Integer> set = new LinkedHashSet<>(); - order will be mainted
        // Set<Integer> set = new TreeSet<>(); - unique and BST(sorted) - O(logn)
    

        // adds the element in set and if already present no operation.
        set.add(25);
        set.add(45);
        set.add(243);
        set.add(265);
        set.add(275);

        // remove element
        set.remove(45);

        // returns True/False if present 
        set.contains(100);

        // returns true is empty
        set.isEmpty();

        // size of set
        set.size();

        // delete all elements
        set.clear();

    }
}
