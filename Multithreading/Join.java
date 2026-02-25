// join make sure that Main thread should wait for thread1 completion.


public class Join {
    public static void main(String[] args) {
        System.out.println("Main thread started");
        
        Thread th1 = new Thread(() -> {
            System.out.println("Thread1 calling produce method");
        });

        //start thread1 
        th1.start();

        try {         
            System.out.println("Main thread is waiting for thread1 completion");
            th1.join();
        } catch (Exception e) {}
        
        System.out.println("Main thread is finished");
    }
}
