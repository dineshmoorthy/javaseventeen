package linkedlist;

import java.util.LinkedList;

public class LinkedListExample3 {
    public static void main(String[] args) {
        LinkedList<String> cities = new LinkedList<>();

        cities.add("New York");
        cities.add("London");
        cities.add("Paris");
        
        // Add at first and last
        cities.addFirst("Tokyo");
        cities.addLast("Sydney");

        // Add at index 2
        cities.add(2, "Dubai");

        System.out.println(cities);
    }
}
