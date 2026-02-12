package Classes.Annotation;

public class customAnnotation {
    
}

//example 1
public @interface MycustomAnnotation {
    String name();
}

@MycustomAnnotation(name = "testing")
public class Eagle{
    public void fly(){

    }
}


//example 2
public @interface MycustomAnnotation {
    String name() default "hello";
}

@MycustomAnnotation
public class Eagle{
    public void fly(){
        
    }
}