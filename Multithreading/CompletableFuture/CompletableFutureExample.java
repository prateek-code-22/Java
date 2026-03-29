import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class CompletableFutureExample {
    public static void main(String [] args) {
    
        //executor
    try {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 10,
            TimeUnit.MINUTES, new ArrayBlockingQueue<>(2), Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());

            //supplyasync - task which thread need to execute
            CompletableFuture<String> asyncTask1 = CompletableFuture.supplyAsync(() -> {
                return "task completed";
            }, executor);

            //.get() - it will wait till the execution is complete and return the result.
            System.out.println(asyncTask1.get());
        


        //2. thenApply() -> uses prev thread to complete the task. 
        CompletableFuture<String> asyncTask2 = CompletableFuture.supplyAsync(() -> {
                return "Coding and ";
            }, executor).thenApply((String val) -> {
                return val + "Concept";
            })
            ;
        
            CompletableFuture<String> asyncTask3 = CompletableFuture.supplyAsync(() -> {
                return "Coding and ";
            }, executor);
        
            asyncTask3.thenCompose((String val) -> {
                return CompletableFuture.supplyAsync(() -> val + "hello");

            }, executor);
        
        
        }
        catch(Exception e){

        }

    }
}
