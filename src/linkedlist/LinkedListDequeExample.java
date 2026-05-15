package linkedlist;

import java.util.*;

public class LinkedListDequeExample {
    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<>();

        deque.addFirst("A");
        deque.addLast("B");
        deque.addFirst("C");
        deque.addLast("D");

        System.out.println("Deque: " + deque);

        deque.removeFirst();
        deque.removeLast();

        System.out.println("After removing ends: " + deque);
    }
}
