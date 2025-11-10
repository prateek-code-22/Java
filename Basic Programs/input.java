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

        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();                // read first line (5)
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();            // reads first number of the pair
                int b = sc.nextInt();            // reads second number of the pair
                // process the pair (here we just print)
                System.out.println(a + " " + b);
            }
        }


    }
    
}
