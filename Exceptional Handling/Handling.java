//try-catch handling

public class Handling {
    public static void main(String[] args) {
        // throws the exception
        try{
            method1();
        }
        //catch the exception, child execption
        catch(ClassNotFoundException exceptionObj){
            //handle it
        }

        //multiple exception
        catch(ClassNotFoundException | InterruptedException exceptionObj){
            //handle it
        }


        //parent exception
        catch(Exception exep){

        }

        finally{
            //always get executed, unless the error
        }
    }

    public static void method1() throws ClassNotFoundException{
        throw new ClassNotFoundException();
    }

}



