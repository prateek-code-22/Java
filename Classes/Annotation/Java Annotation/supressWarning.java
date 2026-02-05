package Classes.Annotation;

public class supressWarning {
    
}


//this class has deprecated method, will give warning
public class Mobile{

    @Deprecated
    public void dummyMethod(){
        //code...
    }
}

//using this supress the deprecated warning
//options - deprecated, unused, all

class Main{

    @SuppressWarnings("Deprecated")
    public static void Main(String [] args){
        Mobile obj = new Mobile();
        obj.dummyMethod();

    }
}
