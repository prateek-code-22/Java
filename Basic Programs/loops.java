public class loops {
    public static void main(String []args){

        // for loop
        for(int i=100; i>= 1;i-- ){
            System.out.println(i);
        }

        //for each loop
        int[] valArray = {1,2,3,4,5};
        for(int val : valArray){
            System.out.println(val);
        }
        
        //while loop
        int j = 100;
        while(j>=1){
            System.out.println(j);
            j --;
        }

        //do while loop (at least one time loop will run)
        int k =100;
        do{
            System.out.println(k);
            k -=1;
        }while(k>=1);


    }
    
}
