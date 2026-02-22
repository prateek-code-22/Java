//  Method 1- using Runnable class(used in prod)

// step1 = create a runnable object
// runnable (functional Interface) has abstract method 'run' method

public class multithreading implements Runnable{
    @Override
    public void run(){
        System.out.print("code executed by thread" + Thread.currentThread().getName());
    }
}


//step2 = create instance of class and the create thread
public class Main{
    public static void main(String args[]){
        System.out.println("Inside the main method" + Thread.currentThread().getName());
    
        //instance of class
        multithreading runnableObj = new multithreading();
        //thread is created
        Thread thread = new Thread(runnableObj);
        //thread is started
        thread.start(); // if not overriden, then run method of Thread class will get invoked.
    
        System.out.println("finished main thread");
    }
}

/*output:   inside main method: main
            finished main thread: Main
            code execute by thread: Thread - 0
*/

// #---------------------------------------------
// Method 2 - By extending Thread class

//step1 - extend thread  
public class multithreading2 extends Thread{
    @Override
    public void run(){
        System.out.print("code executed by thread" + Thread.currentThread().getName());
    }
}


//step2 = create instance of class and the create thread
public class Main{
    public static void main(String args[]){
        System.out.println("Inside the main method" + Thread.currentThread().getName());
    
        //instance of class
        multithreading2 myThread = new multithreading2();
        //thread is started
        MyThread.start(); // if not overriden, then run method of Thread class will get invoked.

        System.out.println("finished main thread");
    }
}


/*output:   inside main method: main
            finished main thread: Main
            code execute by thread: Thread - 0
*/