package DSA.Arrays;

public class check_sorted {
    public static void main(String[] args) {
        
        int [] arr = {1,1,4,3,3};
        String status = "Sorted";
        
        for(int i = 0;i < arr.length-1; i++){
            if(arr[i+1] < arr[i]){
                status = "Not sorted";
                break;
            }
        }
        System.out.print("Array is "+status);
    }
}
