public class customException extends Exception{
    customException(String message){
        super(message);
    }
}


class Main{
    public static void main(String args[]){
        try{
            method1();
        }
        catch(customException e){
            //handle exception
        }
    }
    
    public static void method1() throws customException {
        throw new customException("issue detected");
    }
}

