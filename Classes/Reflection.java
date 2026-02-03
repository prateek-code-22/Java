// Reflection is a Java API that allows inspection and manipulation of classes, methods, and fields at runtime.”

package Classes;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Reflection {
    
}

//present in java.lang.reflect

public class Eagle{
    public String breed;
    private boolean canSwim;

    public void fly(){
        System.out.println("fly");
    }
    private void eat(){
        System.out.println("eat");
    }

    public void flyHigh(int intParam, boolean boolParam, String strParm){
        System.out.println("fly intParam "+ intParam + "boolParam"+ boolParam);
    }

}

public class Main{
    public static void main(String[] args) {
        //reflection of class
        Class EagleObj = Eagle.class;

        System.out.println(EagleObj.getClass()); //eagle
        System.out.println(Modifier.toString(EagleObj.getModifiers())); //public
        System.out.println(EagleObj.getMethods()); //public
    
        //reflection of fields
        //gets only public fields
        Field[] fields = EagleObj.getFields();
        //to get all the public, private fields
        Field[] fields = EagleObj.getDeclaredFields();

    
        //reflection of method
        // only the public method is fetched, Includes inherited methods
        Method[] methods = EagleObj.getMethods();
        
        //to get all the public, private methods, no inherited methods
        Method[] methods = EagleObj.getDeclaredMethods();
        
        //will also contains the methods of Object class(Parent)
        for(Method method: methods){
            System.out.println("Method Name: " + method.getName());
            System.out.println("return type: " + method.getReturnType());
            System.out.println("class name: " + method.getDeclaringClass());
        }


        //invoke method by reflection
        Class eagleClass = Class.forName("Eagle");
        Object eagleObject = eagleClass.newInstance();
        //call the method by def
        Method flyMethod = eagleClass.getMethod("fly", int.class, boolean.class, String.class);
        flyMethod.invoke(eagleObject,1, true, "hello");


        Eagle obj = new Eagle();

        //Set the public field value
        Field field = eagleClass.getDeclaredField("breed");
        field.set(obj, "BrownEagle");
        System.out.println(obj.breed);

        //Set the private field value
        Field field = eagleClass.getDeclaredField("canSwim");
        field.setAccessible(true);
        field.set(obj, true);
        if(field.getBoolean(obj)){
            System.out.println("value is set true");
        }
    }
}


// #########################################################333
//Reflection of Constructor ( breaks singleton)
public class Woodpacker{

    privare Woodpacker(){
        //private constructor
    }        

    public void fly(){
        System.out.println( "fly");
    }
}
    
class Main{
    public static void main(String[] args) {
        
        Class WoodpackerClass = Woodpacker.class;

        //to access private constructor

        //get all the constructor
        Constructor[] WoodpackerConstructorList = WoodpackerClass.getDeclaredConstructors();
        
        for(Constructor WoodpackerConstructor: WoodpackerConstructorList){
            System.out.println("Modifier: "+Modifier.toString(WoodpackerConstructor()));
            
            //to give main class access to this private constructor
            WoodpackerConstructor.setAccessible(true);

            //created the obj to access the method
            Woodpacker obj = (Woodpacker) WoodpackerConstructor.newInstance();
            obj.fly();
        }



    }
}    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
