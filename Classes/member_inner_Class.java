package Classes;

public class member_inner_Class {
    int instanceVar = 10;
    static int classVar = 12;

    class InnerClass{
        public void print(){
            System.out.println("inside inner class");
        }
    }
}

// calling member inner class - by creating the obj of outer class and then obj of inner class
public class objectClass{
    public static void main(String[] args) {
        member_inner_Class outerobj = new member_inner_Class();

        member_inner_Class.InnerClass innerObj = new member_inner_Class.InnerClass();
        innerObj.print();
    }
}