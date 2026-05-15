package javatwentyone;

import java.util.*;

public class SequencedExample {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.add("Alice");
        names.add("Bob");
        names.addLast("Charlie");
        names.addFirst("Zoe");

        System.out.println(names.getFirst());  // Zoe
        System.out.println(names.getLast());   // Charlie

        names.removeFirst();
        names.removeLast();

        System.out.println(names.reversed());  // [Bob, Alice]
        
        SequencedCollection<String> snames = new LinkedList<>();
        snames.add("Alice");
        snames.add("Bob");
        snames.addLast("Charlie");
        names.addFirst("Zoe");

        System.out.println(names.getFirst());  // Zoe
        System.out.println(names.getLast());   // Charlie

        names.removeFirst();
        names.removeLast();
    }
}
