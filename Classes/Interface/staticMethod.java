package Classes.Interface;

public class staticMethod {
    
}


//
public interface Bird{

    void canFly(); //abstract method

    
    public default void minFlyHeight(){
        myStatic();
        myPrivate();
        myPrivateStatic();
    }

    static void myStatic(){
        myPrivateStatic();  // only static method can be called inside static
    }

    private void myPrivate(){

    }

    private static void myPrivateStatic(){

    }

}