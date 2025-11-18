package DSA.Recursion.Array;

public class check_sorted_array {
    public static void main(String [] args){
        int [] arr = {1,2,3,4};
        System.out.print(solve(arr));
    
    }
    
    // Note: the Array arr is not changed during the recursion calls.
    // new function variable of arr are pointing towards the same object.

    // solve function
    static boolean solve(int [] arr){
        return helper(arr,0);
    }
    
    // helper function
    static boolean helper(int [] arr, int index){
        int n = arr.length;
        
        // if index reached the last return 
        if(index == n-1){
            return true;
        }

        // check if any element greator than its right element return false
        if(arr[index] > arr[index+1]){
            return false;
        }

        // call the function on next index
        return helper(arr, index+1);
    }
}   
