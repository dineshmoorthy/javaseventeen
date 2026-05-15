package javatwentyone;

import java.util.*;

public class SequencedCollectionDemo {
    public static void main(String[] args) {
        SequencedCollection<String> names = new LinkedList<>();

        names.addFirst("Alice");
        names.addLast("Bob");
        names.addLast("Charlie");

        System.out.println("First: " + names.getFirst()); // Alice
        System.out.println("Last: " + names.getLast());   // Charlie
        System.out.println("All: " + names);              // [Alice, Bob, Charlie]

        names.removeFirst();
        System.out.println("After removing first: " + names); // [Bob, Charlie]
        
        
        
        List<String> fruits = new ArrayList<>(List.of("Apple", "Banana", "Cherry"));
        SequencedCollection<String> sequencedFruits = (SequencedCollection<String>) fruits;

        System.out.println("Normal order: " + sequencedFruits);

        List<String> reversed = new ArrayList<>(sequencedFruits.reversed());
        System.out.println("Reversed order: " + reversed);

    }
}
