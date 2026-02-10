package Classes.Annotation.Java Annotation;
import java.util.ArrayList;
import java.util.List;

public class safeVarargs {
    
}


public class Log{
    // method takes the lognumberlist in integer

    @SafeVarargs // to avoid heap pollution warning
    public static void printLogValues(List<Integer>... logNumberList){
        Object[] objectList = logNumberList;

        List<String> stringValuesList = new ArrayList<>();
        stringValuesList.add("hello");
        objectList[0] = stringValuesList;
    }
}

 