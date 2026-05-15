package interview;

import java.util.*;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.add(50);
        minHeap.add(10);
        minHeap.add(30);

        System.out.println("Min element: " + minHeap.peek()); // 10
        System.out.println("Element: " + minHeap); 
        while (!minHeap.isEmpty()) {
            System.out.println("Removing: " + minHeap.poll()); // in sorted order
        }
        
        System.out.println("minHeap: " + minHeap); 
        
        
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(10);
        pq.add(20);
        pq.add(5);

        System.out.println("peek(): " + pq.peek()); // 5
        System.out.println("After peek: " + pq);     // [5, 20, 10] - queue unchanged

        System.out.println("poll(): " + pq.poll()); // 5
        System.out.println("After poll: " + pq);    // [10, 20] - 5 is removed
        
    }
}
