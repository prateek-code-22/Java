import java.util.concurrent.*;

public class shutdownExecutor {
    public static void main(String[] args) {
        
        ExecutorService pool = Executors.newFixedThreadPool(5);
        pool.submit(() -> {
            
            try{
                Thread.sleep(5000); 
            
            }catch(Exception e){
                
            }
            
            System.out.println("Thread 1 is running");
        });

        pool.shutdown();

        //awaitTermination is used after shutdown, to execute the caller thread.
        try{
            boolean isTerminated = pool.awaitTermination(2, TimeUnit.SECONDS);
            System.out.println("Main thread is completed");
        }
        catch(Exception e){
            
        }

        //shutdownNow - shutdown the active and waiting thread 
        pool.shutdownNow();
        
    }
}
