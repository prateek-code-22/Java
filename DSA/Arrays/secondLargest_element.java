//optimal - single pass 2 variable 


package DSA.Arrays;

public class secondLargest_element {
    public static void main(String[] args) {
        
    int [] arr = {1,2,4,6,3,7};

    int largest = arr[0];
    int secondLargest = -1;

    for(int i = 0; i < arr.length; i++){

        if(arr[i] > largest){
            secondLargest = largest;
            largest = arr[i];
        }
        else if(arr[i] < largest && arr[i] > secondLargest){
            secondLargest = arr[i];
        }
    }
    System.out.print("The second largest element is "+ secondLargest);
    
    }
}
