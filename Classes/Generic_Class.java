// Generic class is defined by - <>

package Classes;

public class Generic_Class<T> {
    T value;

    public T getValue(){
        return value;
    }
    public void setValue(T value){
        this.value = value;
    }


    //generic method
    public <T> void GM(T inp){
        System.out.println("hii"+ inp);
    }
}



class Main{
    public static void main(String[] args) {
        //while creating object giving the datatype
        Generic_Class<Integer> obj = new Generic_Class<Integer>();
        
        //raw type calling, complier will pass the type
        Generic_Class rawobj = new Generic_Class<>();
        rawobj.setValue(1);
        rawobj.getValue(); 

        //generic method calling
        Generic_Class obj = new Generic_Class<>();
        obj.GM(Integer 12);

        //input will be integer
        obj.setValue(10);
        
        //will receive integer value
        Integer v = obj.getValue();
        
        if(v == 1) System.out.println(true);
    }
}


