package Classes.Interface;

public class defaultMethod {
    
}

//interface
public interface abc{

    //default method can have implementation
    default int method1(){
        return 100;
    }
}


//note: in case of class extending multiple classes, then we need to provide the method implementation in child class.

interface Bird{
    default boolean canBreathe(){
        return true;
    }
}

interface Dog{
    default boolean canBreathe(){
        return true;
    }
}

// 
public class animal implements Bird, Dog{
    //conflict will occur becauz of same method name in both extended classes.
    public boolean canBreathe(){
        return true;
    }
}
