package OOPS;

class Classroom{

    String name;
    int age;

    public void abc(int age){
        System.out.println(age);
    }

    public void abc(String name, int age){
        System.out.println(name+" "+age);
    }

    public void abc(String name){
        System.out.println(name);
    }
}


public class overloading {
    public static void main(String [] args){
        Classroom s = new Classroom();
        s.name = "jack";
        s.age = 12;

        s.abc(s.name);
        s.abc(s.age);
        s.abc(s.name,s.age);
    }    
}
