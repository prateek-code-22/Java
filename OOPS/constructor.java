// Constructor
package OOPS; 

class Animal{

    // same name as class name is known as constructor
    // use = when we want to perform some operation at the time of object creation
    Animal(){
        System.out.println("Inside the constructor");
    }

}

class Constructor {
    public static void main(String [] args){
    
        Animal dog = new Animal();
        
    }
}
