package OOPS;


interface Animal{
    int eyes= 2;
    void walk();
}

//multiple inherit
interface Heribore{

}

class Horse implements Animal, Heribore{
    public void walk(){
        System.out.println("walk on 4 legs");
    }
}

public class interface_example {
    public static void main(String args[]){
        
    }    
}
