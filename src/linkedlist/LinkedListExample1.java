package linkedlist;

import java.util.*;

public class LinkedListExample1 {
    public static void main(String[] args) {
        // Create LinkedList of Strings
        LinkedList<String> animals = new LinkedList<>();

        // Add elements
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Horse");
        animals.add("Cow");

        System.out.println("Animals List: " + animals);
    }
}
