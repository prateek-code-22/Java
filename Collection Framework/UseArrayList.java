/*
array in java has fixed size and cannot be changed on runtime.
we will use the ArrayList in place which is same as list in python.
After entering the 'n' elements in the arraylist, then internally, it will make new arraylist of size n+ n/2 +1 and copy the old values in new and dump the old one.

Functions:
- add(e)                        = add element e in list
- add(i,e)                      = add element e at index i in list
- addAll(old_list)              = add the old list elements in new list
- get(i)                        = to get the element at index i
- remove(i)                     = to remove the element present at index i
- remove(Integer.valueOf(e))    = to remove the element e from the list
- clear()                       = to remove all elements in list 

it takes O(N) to remove the element from the list.

*/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UseArrayList {

    public static void main(String [] args){
        
        // creates the empty string array
        ArrayList<String> studentsName = new ArrayList<>();
        studentsName.add("Prateek");
        
        // add function
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        
        // added new element
        list.add(5);
        
        // add element e at index i
        list.add(1, 50);
        
        // create new list and add the old list elements inside it.
        List<Integer> newList = new ArrayList<>();
        newList.add(100);
        newList.add(100);

        newList.addAll(list);
        
        // to get the element at index i
        System.out.println(list.get(1));

        // remove the element at index 1
        list.remove(1);

        // remove the element by value
        list.remove(Integer.valueOf(3));
        
        // to remove all elements in list
        list.clear();

        // to set the element at index 
        list.set(2, 1000);

        // to check element present in list or not O(N)
        list.contains(30);

        //traverse the list using for loop
        for(int i = 0; i < list.size(); i++){
            System.out.println("element is" + list.get(i));
        }

        // traverse using for each 
        for(Integer element: list){
            System.out.println("foreach element"+ element);
        }

        //using foreach method
        list.forEach(val -> System.out.println(val));

        // using iterator
        Iterator<Integer> iterateList = list.iterator();
        while (iterateList.hasNext()){
            //each val
            int val = iterateList.next();
            System.out.println(val);
            if(val == 3){
                //removes 3 from list
                iterateList.remove();
            }
        }
        

    }
}