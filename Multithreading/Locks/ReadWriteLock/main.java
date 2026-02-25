package Locks.ReadWriteLock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class main {
    SharedResource resource = new SharedResource();
    ReadWriteLock lock = new ReentrantReadWriteLock();

    Thread T1 = new Thread(() -> {
        resource.producer(lock);
    });
    
    Thread T2 = new Thread(() -> {
        resource.producer(lock);
    });
    
    SharedResource resource1 = new SharedResource();
    Thread T3 = new Thread(() -> {
        resource.producer(lock);
    });

    T1.start();
    T2.start();
    T3.start();

}

