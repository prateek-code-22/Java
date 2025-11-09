public class conditional {
    public static void main(String [] args){

        boolean value = false;
        if(value == true) {
            System.out.print("Yes");
        }
        else{
            System.out.println("No");
        }


        //switch
        int day = 1;

        switch(day){
            case 1:
            System.out.println("Monday");
            break;
            
            case 2:
            System.out.println("Tuesday");
            break;
            
            default:
            System.out.println("wed - sunday");

        }
    }
    
}
