package Classes.Singleton Class;

public class Eager_Initialization {

    //eobj belongs to class and private to this class.
    //object is created first and is static
    private static Eager_Initialization eobj = new Eager_Initialization();
    
    private Eager_Initialization(){
    }

    //returns the obj
    public static Eager_Initialization getInstance(){
        return eobj;
    }

}


// Main class
class Main{
    public static void main(String[] args) {

        Eager_Initialization connection = Eager_Initialization.getInstance();

    }
}