package Classes.Annotation;

public class deprecated {
    
}

//this class has deprecated method
public class Mobile{

    @Deprecated
    public void dummyMethod(){
        //code...
    }
}

class Main{
    public static void Main(String [] args){

        Mobile obj = new Mobile();
        //will give warning when used deprecated.
        obj.dummyMethod();

    }
}