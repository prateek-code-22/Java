package Classes.Interface;

public class functionalInterface {
    
}

//functional interface can have only 1 abstract method.

@FunctionalInterface //(optional)
public interface Birds{
    
    //abstract method
    void canFly();
    
    //default method
    default void getHeight(){

    }

    //static method
    static void canEat(){

    }

    //object class method
    String toString();

}


//way to implement the functional interface.

@FunctionalInterface
public interface Bird{
    void canFly(String val);
}

//1st way: using implements
public class Eagle implements Bird{
    @Override
    public void canFly(String val){
        System.out.println("eagle bird");
    }
}

//2nd way: using anonymous class.
public class Main{
    public static void main(String[] args) {
        //give implementation and complier we create class and implememting the function
        Bird eagleObj = new Bird(){
            @Override
            public void canFly(String val){
                System.out.println("bird implemented");
            }
        };

        eagleObj.canFly("vertical");
    }
}


//3rd way: using lambda 
public class Main{
    public static void main(String[] args) {
        //
        Bird eagleObject = (String value) -> { System.err.println("eagle bird"); }; 

        eagleObj.canFly("vertical");
    }
}