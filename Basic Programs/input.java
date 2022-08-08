import java.util.Scanner;

public class input {
    public static void main(String [] args){
        
        try (// take input
        Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter your age: ");
            //int age = sc.nextInt();
            //float weight = sc.nextFloat();
            String name = sc.nextLine();
            System.out.println(name);
        }


    }
    
}
