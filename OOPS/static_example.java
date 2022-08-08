package OOPS;

class ABC{
    String name = "javk";
    static String school="Middle";

    public void display(){
        System.out.println(name+""+school);
    }
    // public static void changeName(){
    //     school = "newschool";
    // }
}


public class static_example {
    public static void main(String [] args){
        ABC a  = new ABC();
        a.display();
    }    
}
