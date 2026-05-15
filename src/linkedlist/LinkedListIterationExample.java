package linkedlist;

import java.util.*;

public class LinkedListIterationExample {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>(Arrays.asList("Red", "Green", "Blue"));

        // 1️⃣ For-each loop
        for (String c : colors)
            System.out.println("Color: " + c);

        // 2️⃣ Iterator
        Iterator<String> it = colors.iterator();
        while (it.hasNext())
            System.out.println("Using Iterator: " + it.next());

        // 3️⃣ Using Stream API
        colors.stream().forEach(System.out::println);
    }
}
