public class ThreadLocalExample {
    
    public static void main(String[] args) {
        
    
    ThreadLocal<String> threadLocalObj = new ThreadLocal<>();
    
    //main thread - automatic detect by threadlocal
    threadLocalObj.set(Thread.currentThread().getName());
    
    Thread thread1 = new Thread( () -> {
        threadLocalObj.set(Thread.currentThread().getName());
        System.out.println("Task1");
        });
        
    thread1.start();

        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            }

        System.out.println(threadLocalObj.get());
    }
}
