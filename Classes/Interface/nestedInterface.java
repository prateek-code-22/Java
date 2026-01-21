package Classes.Interface;

public class nestedInterface {
    
}


//outer interface
public interface Bird{
    public void canFly();

    //inner interface
    public interface NonFlyingBird{
        public void canRun();
    }
} 

//class implements outer interface method
public class Eagle implements Bird{
    @Override
    public void canFly(){
        
    }
}

//class implements inner interface method
public class Eagle implements Bird.NonFlyingBird{
    @Override
    public void canRun(){

    }
}

//main class
public class Main{
    public static void main(String[] args) {
        Bird boj = new Eagle();
        Bird.NonFlyingBird obj = new Eagle();
        obj.canRun();
        boj.canFly();
    }
}