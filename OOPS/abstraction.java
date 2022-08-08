package OOPS;


abstract class Animal{
    abstract public void walk();
}

class Horse extends Animal{
    public void walk(){
        System.out.println("WaLK on 4 legs");
    }
}


class Hen extends Animal{
    public void walk(){
        System.out.println("WaLK on 2 legs");
    }
}

public class abstraction {
    public static void main(String [] args){

    Horse h = new Horse();
    h.walk();
    
    }
}
