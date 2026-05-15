package linkedlist;

import java.util.*;

public class LinkedListQueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.offer("Task1");
        queue.offer("Task2");
        queue.offer("Task3");

        System.out.println("Queue: " + queue);

        System.out.println("Next to process: " + queue.peek());
        System.out.println("Processing: " + queue.poll());
        System.out.println("After poll: " + queue);
    }
}
