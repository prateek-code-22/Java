/*
add() :  Inserts the specified element to the queue. If the queue is full, it throws an exception. Time Complexity: O(logN) where N denotes the number of elements present in the PriorityQueue.
offer() - Inserts the specified element to the queue. If the queue is full, it returns false. Time Complexity: O(logN)
poll() - returns and removes the head of the queue. Time Complexity: O(logN)
peek() - return the head of the queue. Time Complexity: O(1)
 */

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class usePriorityQueue {
    public static void main(String [] args){
        
        // pq is priority queue & comparator is used to define the priority to highest element first
        Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        
        // using the PQ package, without argument so, smallest element first.
        // PriorityQueue pq = new PriorityQueue<>();

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
