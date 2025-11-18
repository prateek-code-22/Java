package OOPS;

class Pen{
    String color;
    String type;

    // write method
    public void write(){
        System.out.println("writing something");
    }

    // color method
    // this points to the current object
    public void printColor(){
        System.out.println(this.color);
    } 
}



class Student{
    String name;
    int age;

    //method
    public void printName(){
        System.out.println(this.name);
        System.out.println(this.age);
    }


    //constructor
    /* 
    Student(){
        System.out.println("Cosntructor called");
    }
    */


    
    /* 
    //parameterized constructor
    Student(String name, int age){
        this.name = name;
        this.age = age;
    }
    */

    Student(){

    }

    //copy constructor
    Student(Student s2){
        this.name = s2.name;
        this.age = s2.age;
    }

}



public class example {
    public static void main(String [] args){
        Pen p = new Pen();
        p.color = "blue";
        p.type = "gel";

        Pen p1 = new Pen();
        p1.color = "black";

        p.printColor();
        p1.printColor();


        Student s1 = new Student();
        s1.name= "jack";
        s1.age = 14;

        Student s2 = new Student(s1);
        s2.printName();
    }
}
