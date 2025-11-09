import java.util.PriorityQueue;
import java.util.Queue;

public class usePriorityQueue {
    public static void main(String [] args){

        Queue<Integer> pq = new PriorityQueue<>();

        pq.offer(12);
        pq.offer(22);
        pq.offer(32);

        // min heap sorts the elements
        System.out.println(pq);

        pq.poll();
        System.out.println(pq);

        System.out.println(pq.peek());

    }
}
