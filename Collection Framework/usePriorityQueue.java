import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class usePriorityQueue {
    public static void main(String [] args){
        
        // pq is priority queue & comparator is used to define the priority to highest element first
        Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.offer(12);
        pq.offer(22);
        pq.offer(32);

        // internally by default have min heap sorts the elements
        System.out.println(pq);

        // remove the element
        pq.poll();

        // peek element 
        System.out.println(pq.peek());

        
    }
}
