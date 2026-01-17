package Classes.Singleton Class;

public class DoubleLocking {
    
    private static volatile DoubleLocking dobj;

    // A private constructor prevents object creation from outside the class using new
    public DoubleLocking() {
    }
    
    public static DoubleLocking getInstance(){
        if(dobj == null){
            synchronized (DoubleLocking.class){
            if(dobj == null){
                dobj = new DoubleLocking();
            }
        }
        }
        return dobj;
    }

    
}
