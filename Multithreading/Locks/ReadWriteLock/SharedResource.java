import java.util.concurrent.locks.ReadWriteLock;

public class SharedResource {
    
    public void producer(ReadWriteLock lock){
        try{
            //read lock
            lock.readLock().lock();
            System.out.println("Read Lock acquired by: "+ Thread.currentThread().getName());
            Thread.sleep(8000);
        }catch(Exception e){

        }
        finally{
            //release the lock
            lock.readLock().unlock();
            System.out.println("read lock released by "+Thread.currentThread().getName());
        }
    }

    public void consume(ReadWriteLock lock){
        try{
            //write lock
            lock.writeLock().lock();
            System.out.println("Write Lock acquired by: "+ Thread.currentThread().getName());
            isAvailable = false;
        }
        catch(Exception e){

        }
        finally{
            lock.writeLock().unlock();
            System.out.println("Write lock release by: "+ Thread.currentThread().getName());
        }
    }

}

