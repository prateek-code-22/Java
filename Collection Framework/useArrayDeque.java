// double ended queue (arraydeque)
// insertion and deletion from both ends.
//insertion - O(1) most time, O(N) - when queue size reached threshold.
//search - O(1)
//deletion - O(1)

import java.util.ArrayDeque;

public class useArrayDeque {
    public static void main(String [] args){

        ArrayDeque<Integer> adq = new ArrayDeque<>();

        // add the element
        adq.offer(22);
        
        // add the element at front
        adq.offerFirst(242);

        // add the element at last
        adq.offerLast(45);

        System.out.println(adq);

        // peek elements 
        System.out.println(adq.peek());
        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast());

        // remove elements
        System.out.println(adq.poll());
        System.out.println(adq.pollFirst());
        System.out.println(adq.pollLast());

    }
}
