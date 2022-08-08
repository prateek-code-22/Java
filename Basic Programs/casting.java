public class casting {
    public static void main(String [] args){
        
        //implict casting large var contain small variable
        double price = 100.00;
        double finalprice = price+18;

        System.out.println(finalprice);

        //explict casting (DT)
        int p = 100;
        int fp = p + (int)18.0;
        System.out.println(fp);



        //constants
        // final keyword is used to fix the value of variable
       final float PI = 3.14f;
       System.out.println(PI);
    }
    
}
