// consumer - producer problem


import java.util.LinkedList;
import java.util.Queue;

public class SharedResource {
    boolean itemAvailable = false;

    private Queue<Integer> sharedBuffer;
    private int bufferSize;

    public SharedResource(int bufferSize){
        sharedBuffer = new LinkedList<>();
        this.bufferSize = bufferSize;
    }

    public synchronized void produce(int item)throws Exception{
        //If buffer is full, wait for the consumer to consume items
        while(sharedBuffer.size() == bufferSize){
            System.out.println("Buffer is full");
            wait();
        }

        sharedBuffer.add(item);
        System.out.println("Produced "+item);
        //notify consumer that items are available.
        notify();
    }

    public synchronized int consume() throws Exception{
        //buffer is empty, wait for producer to produce item.
        while(sharedBuffer.isEmpty()){
            System.out.println("Buffer is empty, consumer waiting");
            wait();
        }

        int item = sharedBuffer.poll();
        System.out.println("Consumed "+item);
        //notify producer
        notify();
        return item;
    }

}




public class ProducerConsumer{
    public static void main(String [] args){

        SharedResource shareBuffer = new SharedResource(3);

        Thread producerThread = new Thread(() -> {
            try {
                for(int i = 1;i <=6; i++){
                    shareBuffer.produce(i);
                }
            } catch (Exception e) {
            }
        });

        Thread consumerThread = new Thread(() -> {
            try {
                for(int i = 1;i <=6; i++){
                    shareBuffer.consume();
                }
            } catch (Exception e) {
            }
        });

        producerThread.start();
        consumerThread.start();


    }
}
