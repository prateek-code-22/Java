/*
 Queue => FIFO(First in first out)
 methods:
 - offer    = to add the element in queue, if inserted returns True/False
 - add      = returns True if inserted successfull, else throws Exception
 - peek     = top element in stack, returns null if queue is empty
 - element  = returns head and throws error is queue is empty.

 */

import java.util.LinkedList;
import java.util.Queue;


public class useQueue {
    public static void main(String [] args){
        
        // queue is implemented by LL, so it has the methods
        Queue<Integer> queue = new LinkedList<>();

        // to add the elements in queue
        queue.offer(12);
        queue.offer(23);
        queue.offer(55);
        queue.offer(444);

        System.out.println(queue);

        // to pop the first element 
        System.out.println(queue.poll());
        
        // to view next item that will pop
        System.out.println(queue.peek());
        
    } 
}
