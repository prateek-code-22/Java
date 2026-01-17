package Classes.Singleton Class;

public class Lazy_init {

    //obj only defined not created 
    private static Lazy_init Lazy_obj;
    
    private Lazy_init(){
    }

    //check obj if not created then create
    public static Lazy_init getInstance(){
        
        if(Lazy_obj == null) Lazy_obj = new Lazy_init();
        return Lazy_obj;
    }    
}



// Main class
class Main{
    public static void main(String[] args) {
        //lazy 
        Lazy_init connection = Lazy_init.getInstance();

    }
}