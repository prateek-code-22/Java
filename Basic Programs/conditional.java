public class conditional {
    public static void main(String [] args){

        //if-else
        boolean value = false;
        if(value == true) {
            System.out.print("Yes");
        }
        else{
            System.out.println("No");
        }

        int a = 5, b = 0;
        //if-else-if-else
        if(a > b){
            System.out.println(a);
        }
        else if( a == b){
            System.out.println("Equal");
        }
        else{
            System.out.println(b);
        }


        //switch case
        // 2 case cannot have same value, same data type for case matching
        // case type = literal or constant
        //return not possible
        int day = 1;

        switch(day){
            case 1:
            System.out.println("Monday");
            break;
            
            case 2:
            System.out.println("Tuesday");
            break;
            
            //if none case match then default gets executed. not always gets executed.
            default:
            System.out.println("wed - sunday");

        }

        //switch expression
        //all possible use cases should be covered.
        int val = 1;
        String outputval = switch (val) {
            case 1 -> "One";
            case 2 -> "Two";
            default -> "None";
        };

        System.out.println(outputval);

        //another way to define it. 
        // to use {} we need yeild keyword
        case 1 -> {
            //print
            yield "one";
        }
    }
    
}
