package Classes.Annotation;

public class FunctionInterface {
    
}

//will give error if more than 1 abstract method used.
@FunctionalInterface
public interface Bird{
    public boolean fly();
    public boolean fly1();
}

