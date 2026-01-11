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
// public class objectClass{
//     public static void main(String[] args) {
//         inner_member_Class outerobj = new inner_member_Class();

//         inner_member_Class.InnerClass innerObj = new inner_member_Class.InnerClass();
//         innerObj.print();
//     }
// }
