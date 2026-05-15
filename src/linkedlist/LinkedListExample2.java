package linkedlist;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListExample2 {
    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<>(Arrays.asList("Apple", "Banana", "Cherry"));

        System.out.println("First: " + fruits.getFirst());
        System.out.println("Last: " + fruits.getLast());
        System.out.println("At index 1: " + fruits.get(1));
    }
}
