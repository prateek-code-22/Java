import java.util.Scanner; 
public class GuessNo {
    public static void main(String [] args){

        int mynumber = (int)(Math.random()*100);
        try (Scanner sc = new Scanner(System.in)) {
            int userNumber;
            do{
                System.out.println("Guess my number");
                userNumber = sc.nextInt();

                if(userNumber == mynumber){
                    System.out.println("Correct");
                    break;
                }

                else if(userNumber > mynumber){
                    System.out.println("Large");
                }
                else{
                    System.out.println("Small");
                }

            }while(userNumber >=0);
        }
        
    }
    
}
