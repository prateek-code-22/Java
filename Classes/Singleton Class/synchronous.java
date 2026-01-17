// locking and unlocking of object by use in sync
package Classes.Singleton Class;

public class synchronous {
    public static synchronous sc;
}

private synchronous(){}

//method get instance
synchronized public static synchronous getInstance(){
    //check if object initalized
    if( sc == null){
        sc = new synchronous();
    }
}

 
class Main{
   public static void main(String[] args) {
       
   } 
}
