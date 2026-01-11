//if class implements the interface and abstract methods then also it comes under concrete class

package Classes;
public class concrete_class {
    int emp;
    concrete_class(int emp){
        this.emp = emp;
    }

    public int getEmp(){
        return emp;
    }

    public static void main(String [] arg){

        concrete_class c = new concrete_class(12);
        System.out.println(c.getEmp());
    }
}
