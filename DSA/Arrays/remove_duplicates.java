package DSA.Arrays;


public class remove_duplicates {
    public static void main(String[] args) {
        int [] arr = {1,1,2,2,2,3,3};

        // //brute force approach
        // Set<Integer> set = new LinkedHashSet<>();
        // for(int  i = 0;i < arr.length;i++){
        //     set.add(arr[i]);
        // }
        
        // int index = 0;
        // for(int i: set){
        //     arr[index] = i;
        //     index++;
        // }
        
        // System.out.print("The unique element is "+ index);
    
        int i = 0;  
        // single pass optimal approach
        for(int j = 1; j < arr.length; j++){
            if(arr[j] != arr[i]){
                arr[i+1] = arr[j];
                i++;
            }
        }

        System.out.println("unique elements "+(i+1));
    }

}
