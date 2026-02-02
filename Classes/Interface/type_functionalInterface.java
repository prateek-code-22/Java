package Classes.Interface;

public class type_functionalInterface {
    
}

//1.Consumer - accept single input & returns null
@FunctionalInterface
public interface Consumer<T> {
    void accept(T t);
}

public class Main{
    public static void main(String[] args) {
        Consumer<Integer> obj = (Integer val) -> {
            if(val > 10){
                System.out.print("Hii");
            }
        };
    }
}

//2.Suppiler - no input & returns result
@FunctionalInterface
public interface Suppiler<T> {
    T get();
}

public class Main{
    public static void main(String[] args) {
        Suppiler<Integer> obj = () -> {
            System.out.print("Hii");    
        };
    }
}

//3.Function - accepts 1 argument and returns result
@FunctionalInterface
public interface Function<T, R> {
    R apply(T t);
}

public class Main{
    public static void main(String[] args) {
        Function<Integer, String> obj = (Integer num) -> {
            String output = num.toString();
            return output;    
        };
    }
}

//3.Predicate - accepts 1 argument and returns boolean result
@FunctionalInterface
public interface Predicate<T> {
    boolean test(T t);
}

public class Main{
    public static void main(String[] args) {
        Predicate<Integer> isEven = (Integer val) -> {
            if(val%2 == 0){
                return true;
            }
            else{
                return false;
            }
        };

        System.out.println(isEven.test(19));
    }
}

