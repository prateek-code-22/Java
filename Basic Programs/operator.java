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

        //uniary operator(++a, a++, --a, a--, -a, !a, +a)
        int num = 1;
        System.out.print(num++);
        System.out.print(num);

        //Relational operator
        /*
         * a == b
         * a != b
         * a < b
         * a > b
         * a <= b
         * a >= b
         */
        
        
        // logical opertor && ||
        int c = 23, d =234;
        if(c<50 && d> 23){
            System.out.print("data");
        }


        //assignment ( = += -= *= /= %=)

        //bitwise operater
        // & = and
        // | = OR
        // ^ = XOR
        // ~ = Not n = -(n+1)
        
        // Bitwise shift operator
        // << signed left shift *2
        // >> signed right shift /2
        // >>> unsigned right shift /2


        //ternary operator
        // (expression) ? true : false
        int aa = 4, bb =5;
        int maxValue = (aa>bb) ? a : b;
        System.out.println(maxValue);
    
        
        //instanceof operator
        // obj instanceof class - true/false 
        

        
    }
}
