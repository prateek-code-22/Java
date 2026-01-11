package Classes;

//abstract class
// public abstract class Car{
//     public abstract void pressBrake();
// }

public class anonymous_class {
    public static void main(String[] args) {
       
        Car audi = new Car(){
            @Override
            public void pressBrake(){
                System.out.println("apply brake");
            }
        };

        audi.pressBrake();
    }       
}
