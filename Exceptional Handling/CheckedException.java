public class CheckedException{
    //used throws with exception to handle at main class level
    public static void main(String[] args) throws ClassNotFoundException{
        method1();
    }

    //this method can throw the exception, handled at method level and execution back to main.
    //if not handled at main then execution fails.use the same throws for main class also
    public static void method1() throws ClassNotFoundException{
        throw new ClassNotFoundException();
    }
}


