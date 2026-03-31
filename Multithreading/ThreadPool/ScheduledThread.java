
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledThread {
    public static void main(String[] args) {

        //scheduledthreadPool run after time delay(ex:5sec)
        //1. using runnable 
        ScheduledExecutorService poolObj = Executors.newScheduledThreadPool(5);
        poolObj.schedule(() -> {
            System.out.print("Hi");
        }, 5000, TimeUnit.MICROSECONDS);

        //2. Using callable, return value
        Future<String> futureObj = poolObj.schedule(() -> {
            System.out.print("Hi");
        }, 5000, TimeUnit.MICROSECONDS);

        try {
            System.out.println(futureObj.get());
        } catch (Exception e) {
        }

        //3.fixedrate repeat running of thread with initaldelay of 2sec and then after every 5sec.
        poolObj.scheduleAtFixedRate(() -> {
            System.out.print("Hi");
        },2,5, TimeUnit.SECONDS);
        
        //have to stop, using cancel()
        
        //3.fixedrate repeat running of thread with initaldelay delay and then after each task complete, wait for delay
        poolObj.scheduleWithFixedDelay(() -> {
        }, 1, 3, TimeUnit.SECONDS);
        


    }    
}
