// using synch we make sure that resource should be accessed by only one thread at a time.  
//but if multiple obj threads try to access the same resource. then this is used.

//like 1 lock can be locked by 1 thread and only that thread can release it, then other obj can lock it.
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {
        
        ReentrantLock lock = new ReentrantLock();

        //both the resources are using the same lock.
        //once lock acquired & released by the thread1, then only thread2 can acquire it.
        SharedResource resource1 = new SharedResource();
        Thread th1 = new Thread(() -> {
            resource1.producer(lock);
        });
        
        SharedResource resource2 = new SharedResource();
        Thread th2 = new Thread(() -> {
            resource2.producer(lock);
        });

        th1.start();
        th2.start();

    }
}
