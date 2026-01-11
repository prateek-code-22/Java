package Classes;

public class Nested_Static_Class {
    int instanceVar = 12;
    static int classVar = 20;
    
    //nested class(can be public, private and protected) inside outer class
    public static class nestedClass{
        public void print(){
            System.out.println("inside nested class");
        }
    }


    private static class PrivnestedClass{
        public void print(){
            System.out.println("inside nested class");
        }
    }

    //called private nested class, because obj can't be created outside this class 
    public void display(){
        PrivnestedClass nest_obj = new PrivnestedClass();
        nest_obj.print();
    }


    //this is calling of nested class can be written in new file.
    public void display_message(){
        nestedClass obj = new nestedClass();
        obj.print();
    }
}