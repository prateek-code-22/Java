import java.util.Arrays;
import java.util.List;

public class useParallelStream {
    public static void main(String args[]){
        List<Integer> numbers = Arrays.asList(11,2,2,33,4,55,45,5);

        //sequential stream
        numbers.stream()
                .map((Integer val) -> val*val)
                .forEach((Integer val) -> System.out.println(val));   

        //parallel stream
        numbers.parallelStream()
                .map((Integer val) -> val*val)
                .forEach((Integer val) -> System.out.println(val));   
        
    }    
}
