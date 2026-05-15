package javaeight;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}


public class ComparatorOldWay {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Alice", "Bob");

        List<String> myList = Stream.of("a", "b").map(String::toUpperCase).collect(Collectors.toList());
        
        //way0
        
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        });

        System.out.println("way0: "+names); // Output: [Alice, Bob, John]
        
        // way1 -- Using Anonymous comparator Class
        
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s2.compareTo(s1);
            }
        });

        System.out.println("way1: "+names); // Output: [Alice, Bob, John]
        
        
        //way2
        
        names.sort(String::compareTo);

        System.out.println("way2: "+names); // Output: [Alice, Bob, John]
        
        
        //way3 ****
        
        List<String> namesList = new ArrayList<>(Arrays.asList("John", "Alice", "Bob"));

        namesList.sort((a, b) -> a.compareTo(b));

        System.out.println("way3: "+namesList); // Output: [Alice, Bob, John]
        
        
        // reverse order way
        names.sort((a, b) -> b.compareTo(a));

        System.out.println("Reverse order way: "+names); // Output: [John, Bob, Alice]
        
        
        
        // compare sorting
        
        List<Person> people = Arrays.asList(new Person("John"), new Person("Alice"), new Person("Bob"));

        people.sort((p1, p2) -> p1.name.compareTo(p2.name));

        System.out.println("compare sorting: "+people); // Output: [Alice, Bob, John]
    }
}
