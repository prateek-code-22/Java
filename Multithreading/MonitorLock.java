public class MonitorLock {
    
    public synchronized void task1(){
        try{
            System.out.println("starting task1");
            Thread.sleep(10000);
        }
        catch(Exception e){

        }
    }

    public void task2(){
        System.out.println("starting task2");
        //this = obj
        synchronized (this) {
            System.out.println("finished task2");
        }
    }

    public void task3(){
        System.out.println("completed task3");
    }

}



class Main{
    public static void main(String[] args) {
        MonitorLock obj = new MonitorLock();
        
        //all threads using the same obj, synch will put lock on obj, for threads to run one by one
        Thread t1 = new Thread(() -> {obj.task1();});
        Thread t2 = new Thread(() -> {obj.task2();});
        Thread t3 = new Thread(() -> {obj.task3();});

        //starting thread
        t1.start();
        t2.start();
        t3.start();
    }
}