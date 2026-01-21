package Classes.Interface;

public class InterfaceAsPolymorphism {
    //bird interface is used as data type 
    Bird obj1 = new Eagle();
    Bird obj2 = new Eagle();

    obj1.fly(); // calls eagle class function
    obj2.fly(); // calls hen class function
}

//interface definition
public interface Bird{
    public void fly();
}

//class1
public class Eagle implements Bird{
    @Override
    public void fly(){
        System.out.println("Eagle fly");
    }
}

//class2
public class Hen implements Bird{
    @Override
    public void fly(){
        System.out.println("Hen fly");
    }
}

