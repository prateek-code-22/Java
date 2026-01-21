package Classes.Interface;

public class MultipleInheritace {
}

//interface 1 
public class WaterAnimal{
    public boolean canBreathe();
}

//interface 2
public class LandAnimal{
    public boolean canBreathe();
}


//class overrides the interface
public class Crocodile implements WaterAnimal, LandAnimal{

    @Override
    public boolean canBreathe(){
        return true;
    }

}

class Main{
    public static void main(String[] args) {
        Crocodile corc = new Crocodile();
        corc.canBreathe();
    }
}