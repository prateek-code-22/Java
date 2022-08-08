public class operator {
    public static void main(String [] args){

        //arthmatic operator
        int a  = 1;
        int b  = 2;
        int add  =  a + b;
        int sub  =  a - b;
        int mul  =  a * b;
        int div = a / b;
        int mod = a % b;

        System.out.println(add+" "+sub+" "+mul+" "+div+" "+mod);

        //uniary operator
        int num = 1;
        System.out.print(num++);
        System.out.print(num);

        //comparison operator
        /*
         * a == b
         * a != b
         * a < b
         * a > b
         * a <= b
         * a >= b
         */
        
        
        // logical opertor && || !
        int c = 23, d =234;
        if(c<50 && d> 23){
            System.out.print("data");
        }
    }
    
}
