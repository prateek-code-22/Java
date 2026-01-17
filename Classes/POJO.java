package Classes;
// plain old java object - POJO

//simple public class to have var, method, getter, setter.
//no extend  and implement interface, no @entity annotation allowed.

public class POJO {
    String name;
    private int rollNumber;
    protected String address;
    

    public String getName(){
        return name;
    }

    public void setAddress(String address){
        this.address = address;
    }

}
