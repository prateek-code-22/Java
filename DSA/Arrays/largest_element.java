//TC - O(N)
//SC - O(1)

package DSA.Arrays;

class largest_element{
    public static void main(String [] args){

        int[] numbers = {7,8,3,1,5,9,10};

        int largest = numbers[0];
        for(int i = 0;i < numbers.length; i++){
            if(numbers[i] > largest){
                largest = numbers[i];
            }
        }

        System.out.print("Largest element is "+largest);
    }
}