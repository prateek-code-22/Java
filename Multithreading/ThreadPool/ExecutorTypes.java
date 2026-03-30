import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;

public class ExecutorTypes {
    public static void main(String[] args) {

        //fixed thread pool executor - fixed no of threads
        ExecutorService fixed = Executors.newFixedThreadPool(5);
        fixed.submit(() ->{
            System.out.println("Async Task executing by thread");
        });

        //cached thread pool executor - dynamic creation of threads
        ExecutorService dynamic = Executors.newCachedThreadPool();
        dynamic.submit(() ->{
            System.out.println("Async Task executing by thread");
        });

        //fork-join pool executor, compute is method where task is divided into subtask.
        ForkJoinPool pool = ForkJoinPool.commonPool();
        Future<Integer> futureObj = pool.submit(new Compute(0,100));
        try{
            System.out.println(futureObj.get());
        }catch(Exception e){

        }

    }
}
