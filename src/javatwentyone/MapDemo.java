package javatwentyone;

import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        SequencedMap<Integer, String> studentMap = new LinkedHashMap<>();

        studentMap.putFirst(2, "Bob");
        studentMap.putFirst(1, "Alice");
        studentMap.putLast(3, "Charlie");
        //studentMap.putFirst(2, "Burgees");
        //studentMap.putFirst(4, "Burgees");
        
        System.out.println(studentMap); // {1=Alice, 2=Bob, 3=Charlie}
        System.out.println("First Entry: " + studentMap.firstEntry()); // 1=Alice
        System.out.println("Last Entry: " + studentMap.lastEntry());   // 3=Charlie

        SequencedMap<Integer, String> reversed = studentMap.reversed();
        System.out.println("Reversed Map: " + reversed); // {3=Charlie, 2=Bob, 1=Alice}
    }
}
