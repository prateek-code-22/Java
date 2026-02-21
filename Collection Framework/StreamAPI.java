import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {
    
    public static void main(String[] args) {

        //create stream
        Stream<Integer> numStream = Stream.of(100,200,300);
        
        // #-------------Intermediate Operations------------------
        //using filter
        Stream<Integer> filterVal = numStream.filter((Integer num) -> num > 100 );
        
        //using map
        Stream<Integer> mulVal = numStream.map((Integer num) -> num*2);
        
        //flatmap
        List<List<String>> sentenceList = Arrays.asList(
            Arrays.asList("I", "love","Java"),
            Arrays.asList("I", "love","python"),
            Arrays.asList("I", "love","rust")
        );

        Stream<String> wordsStream = sentenceList.stream().flatMap((List<String> sentence) -> sentence.stream());
        // "I", "love","Java" "I", "love","python", "I", "love","rust"

        Stream<String> wordsStreamLower = sentenceList.stream().flatMap((List<String> sentence) -> sentence.stream().map((String value) -> value.toLowerCase()));
        // in small case:  "I", "love","Java" "I", "love","python", "I", "love","rust"


        //distinct
        Integer[] arr = {1,3,4,4,6,7,7};

        Stream<Integer> arrStream = Arrays.stream(arr).distinct();
        //1,3,4,6,7

        //sorted
        Stream<Integer> arrStream1 = Arrays.stream(arr).sorted();
        //sorted in desc order
        Stream<Integer> arrStream2 = Arrays.stream(arr).sorted((Integer val1, Integer val2) -> val2-val1);


        // #-------------Terminal Operations------------------
        
        //forEach()
        List<Integer> numbers = Arrays.asList(2,1,4,7,10);
        numbers.stream()
                    .filter((Integer val) -> val>=3)
                    .forEach((Integer val) -> System.out.println(val));

        //toArray
        Object[] filteredNumber = numbers.stream()
                    .filter((Integer val) -> val >=3)
                    .toArray();
        
        Object[] filteredNumber2 = numbers.stream()
                    .filter((Integer val) -> val >=3)
                    .toArray((int size) -> new Integer[size]);
        

        //reduce
        Optional<Integer> redVAlue = numbers.stream()
                        .reduce((Integer val1, Integer val2) -> val1+val2);

        System.out.println(redVAlue.get()); //total sum of array elements 

        //collect
        List<Integer> filteredNum = numbers.stream()
        .filter((Integer val) -> val >=3)
        .collect(Collectors.toList());


    }
}
