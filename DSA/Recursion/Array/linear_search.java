import java.util.ArrayList;

public class linear_search {
    public static void main(String[] args) {
        int[] arr = {1,5,63,6,7,5};
        int target = 5;
        System.out.println(LinearSearch(arr,0, target));
        
        FindAllIndex(arr, target, 0);
        System.out.println(list);
        
        // called the function with new list object
        System.out.println(FindAllIndex2(arr, target, 0, new ArrayList<>()));

    }

    static int LinearSearch(int[] arr,int index, int target){
        // I traversed till the length of array, so element not found 
        if(index == arr.length){
            return -1;
        }

        // target matched, return index
        if(arr[index] == target){
            return index;
        }

        // call the function for remaining array
        else{     
            return LinearSearch(arr, index+1, target);
        }
    }

        // return the answer list containing all the index of target element
        // method 1: - declare the arraylist outside function add when found.
        // method 2: - return type as arraylist for function.
        // method 3: - without answer list argument

        // method 1
        
        static ArrayList<Integer> list = new ArrayList<>();
        static void FindAllIndex(int [] arr, int target, int index){
            if(index == arr.length){
                return;
            }

            if(arr[index] == target){
                list.add(index);
            }

            FindAllIndex(arr, target, index+1);

        }

        // method 2:
        static ArrayList<Integer> FindAllIndex2(int [] arr, int target, int index, ArrayList<Integer> list ){
            if(index == arr.length){
                return list;
            }

            if(arr[index] == target){
                list.add(index);
            }

            return FindAllIndex2(arr, target, index+1, list);
        }

        // method 3
        static ArrayList<Integer> FindAllIndex3(int [] arr, int target, int index){
            // new for each function call
            ArrayList<Integer> list = new ArrayList<>();

            if(index == arr.length){
                return list;
            }

            if(arr[index] == target){
                list.add(index);
            }

            // add the res list from the below function call
            ArrayList<Integer> fromCurrentCall = FindAllIndex3(arr, target, index+1);
            
            list.addAll(fromCurrentCall);

            return list;

        }










}
