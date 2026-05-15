package linkedlist;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListExample4 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("Dog", "Cat", "Pig", "Cow"));

        list.remove("Pig");        // by value
        list.remove(1);            // by index
        list.removeFirst();        // removes first element
        list.removeLast();         // removes last element

        System.out.println("After removals: " + list);
    }
}
