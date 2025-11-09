import java.util.Arrays;

public class useArray {
    public static void main(String [] args){
        
        int[] numbers = {1, 2,3,4,5,6,7,8,9,10};
        
        // direct Binary search using the array
        int index = Arrays.binarySearch(numbers, 4);

        // sort the arrays
        Arrays.sort(numbers);

        //to fill the array with -1 
        Arrays.fill(numbers, -1);



    }
}
