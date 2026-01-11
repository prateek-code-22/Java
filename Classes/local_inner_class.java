package Classes;

public class local_inner_class {
    
    int instanceVar = 10;
    static int classVar = 12;
    
    public void display(){
        //class defined inside the method
        class LocalInnerClass{
            public void print(){
                System.out.println("inside local inner class");
            }
        }

        //can only be called inside defined block
        LocalInnerClass obj = new LocalInnerClass();
        obj.print();

    }
    
}
