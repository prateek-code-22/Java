//Unchecked/Runtime Exception

//Class Cast Exception
public class Main{
    public static void main(String[] args){
        Object val = 0;
        //converting integer to string
        System.out.println((String)val);
    }
}

//Arthmetic Exception
public class Main{
    public static void main(String[] args) {
        int val = 5/0; 
    }
}

//IndexOutofBound Exception
//(array)
public class Main{
    public static void main(String[] args) {
        int[] val = new int[2];
        //index is not present
        System.out.println(val[3]);
    }
}

//(array)
public class Main{
    public static void main(String[] args) {
        String val = "hello";
        System.out.println(chartAt(5));
    }
}

//NullPointerException
public class Main{
    public static void main(String[] args) {
        String val = null;
        //accessing the null value
        System.out.println(val.chartAt(0));
    }
}

//illegal argument exception
public class Main{
    public static void main(String[] args) {
        int val = Integer.parseInt("abc");
    }
}

