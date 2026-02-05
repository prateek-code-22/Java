package Classes.Annotation;

public class override {
    
}

public interface Bird{
    public boolea n fly();
}

public class Eagle implements Bird{

    //override the interface method at runtime
    @Override
    public boolean fly(){
        return true;
    }
}