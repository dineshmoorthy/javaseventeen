package javaeight;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class LinkedHashSetExample {

public static void main(String[] args) {
	
	List<String> result = Arrays.asList("apple", "banana", "apple", "orange");

	Set<String> unique = new HashSet<String>();
	for (String string : result) {
	    unique.add(string);
	}

	System.out.println("unique: " + unique);
	
	Set<String> uni = result.stream()
            .collect(Collectors.toCollection(LinkedHashSet::new));

	System.out.println("uni: " + uni);
	
	
	// Initialization of a LinkedHashMap
    // using Generics
    LinkedHashMap<Integer, String> lhm
        = new LinkedHashMap<Integer, String>();

    // Inserting elements into Map
    // using put() method
    lhm.put(3, "Geeks");
    lhm.put(2, "For");
    lhm.put(1, "Geeks");

    // For-each loop for traversal over Map
    for (Map.Entry<Integer, String> mapElement :
         lhm.entrySet()) {

        Integer k = mapElement.getKey();

        // Finding the value
        // using getValue() method
        String v = mapElement.getValue();

        // Printing the key-value pairs
        System.out.println(k + " : " + v);
    }
}
}
