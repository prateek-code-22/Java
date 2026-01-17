package Classes;

import java.util.ArrayList;
import java.util.List;
//value of object can't be changed once created.
//no setter method
//all fields are private
//class is final, so no extend

final class Immutable_class {
    private final String name;
    private final List<Object> petList;

    Immutable_class(String name, List<Object> petList) {
        this.name = name;
        this.petList = petList;
    }

    public String getName(){
        return name;
    }

    public List<Object> getPetNameList(){
        //required to make list final
        // returning the new list is important because class points to this List
        //cannot point to new list, but still can add,delete values in it
        return new ArrayList<>(petList);
    }
}



public class Main{
    public static void main(String[] args) {
        List<Object> petName = new ArrayList<>();
        petName.add("sj");
        petName.add("pj");
        
        //creating object 
        Immutable_class obj = new Immutable_class("myname", petName);
        obj.getPetNameList().add("hello");
        System.out.println(obj.getPetNameList());
    }
}