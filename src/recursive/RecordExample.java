package recursive;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

record Resource(int id, String name, String department, int salary) {
	
	// 1. Canonical Constructor (the one with all components)

	// You can customize it if you want to add validation or modify how parameters are assigned.
	public Resource {
        // This is the canonical constructor body
        if (salary < 0) throw new IllegalArgumentException("Salary cannot be negative");
        name = name.toUpperCase(); // allowed: reassigning constructor parameters
    }
	
	
	

//	2. Compact (or "custom") constructors with fewer parameters

//	You can define additional overloaded constructors — but they must delegate to the canonical constructor, directly or indirectly.

	
	    // Additional constructor with fewer arguments
	    public Resource(int id, String name) {
	        this(id, name, "General", 0); // delegates to canonical constructor
	    }

	    public Resource(String name) {
	        this(0, name, "General", 0); // delegates again
	    }
}
public class RecordExample{
	public static void main(String[] args) {
		String input = "indianodominico";
		
		Set<Character> duplicate = new HashSet<>();
		LinkedHashSet<Character> unique = new LinkedHashSet<>();
		
		char[] chararray = input.toCharArray();
		Map<Character, Integer> map = new HashMap<>();
		
		for (int i = 0; i < chararray.length; i++) {
			char c = chararray[i];

			// way  2
			map.put(c, map.getOrDefault(c, 0)+1);
			
			// way 1
			if(!unique.contains(c)) {
				unique.add(c);
			}else {
				duplicate.add(c);
			}
			
		}
		
		
		unique.removeIf(f -> duplicate.contains(f));
		
		System.out.println("Unique: "+unique);
		
		System.out.println("Duplicate: "+duplicate);
		System.out.println("First Unique: "+unique.getFirst());
		// way2
		System.out.println(map.values().stream().filter(f -> f.intValue() < 2).findFirst());
		
		
	/*
	 * When to use a record vs. a regular class
🧱 Use a record when:

The class is just data (like a DTO or value object)

You want immutability

You don’t need setters or mutable fields

You care about automatic equals, hashCode, toString

You only need a few simple constructors or validation logic	
	 */
		
		
	
	}
}