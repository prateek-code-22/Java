public class methods {

    public static void printHello(){
        System.out.println("Hello");
    }

    public static void printName(String name){
        System.out.println(name);
    }

    public static int add(int a, int v){
        return (a+v);
    }

    public static void main(String [] args){
        printHello();
        printHello();
        printHello();

        printName("Jack");
        printName("john");

        System.out.println(add(8,8));

    }
    
}
