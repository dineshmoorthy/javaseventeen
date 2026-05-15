package javaeight;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateExample {

	public static void main(String[] args) {
		
		List<String> studentList  =  Arrays.asList("dog", "cat", "zebra", "donkey", "lion", "dog");
		/*
		// 
		String[] arr = studentList.toArray(String[]::new);
		
		System.out.println(arr.toString());
		
		System.out.println(Arrays.toString(arr));
		
		
		Iterator<String> iterator  = studentList.iterator();
		while(iterator.hasNext()) {
			
			String out = iterator.next();
			System.out.println("out: "+out);
			if(out.equalsIgnoreCase("dog")) {
				iterator.remove();
			}
			
		//	studentList.remove("dog");
		}
		
		System.out.println(studentList);
		
		*/
		
		Set<String> seenIds = new HashSet<>();
		boolean hasDuplicate = studentList.stream()
		    .filter(a -> a.length() > 2)
		    .anyMatch(id -> !seenIds.add(id));
		
		
		System.out.println(seenIds);
		
		Map<String, List<String>> groupByIdType = studentList.stream()
			    .collect(Collectors.groupingBy(s -> s.length() % 2 == 0 ? "Even" : "Odd"));

		
		System.out.println(groupByIdType);
		
		
		List<String> listexaample = Arrays.asList("Jasmine","rose","Lilly","sunflower","lotus","yellow","green", "Lellow");
		
		Set<String> setinps = new HashSet<String>();
		
		// anymatch you can use it as boolean return or way2 as below
		// anymatch & allmatch code works differntly in below case
		// when boolen return expected, both methods works as expected
		
		
		// filter + anymatch
		// will add if any items matches the given conditions
		listexaample.stream().filter(a -> (a.length() % 2 == 0)).anyMatch(a -> !setinps.add(a));
		System.out.println("anymatch result: "+setinps );
		
		// filter + allmatch
		// will add only first item which atches the given conditions
		listexaample.stream().filter(a -> (a.length() % 2 == 0)).allMatch(a -> !setinps.add(a));
		
			// anyMatch(...): Exists? condition check. Returns boolean.

			//	allMatch(...): All? condition check. Returns boolean.

			// findAny(): Give me one element. Returns Optional<T>.
		boolean truefalse = listexaample.stream().anyMatch(a -> (a.length() % 2 == 0));
		boolean allmatchboolean = listexaample.stream().allMatch(a -> (a.length() % 2 == 0));
		System.out.println(truefalse+" "+setinps + " "+ allmatchboolean);
		
		// Below code
		// For sequential streams: usually returns the first element.

		// For parallel streams: can return any element (not guaranteed to be the first).
		
		List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

		// sequential
		Optional<String> anyName = names.stream().findAny();
		System.out.println(anyName.get()); // Alice

		// parallel
		Optional<String> parallelName = names.parallelStream().findAny();
		System.out.println(parallelName.get()); // could be Alice, Bob, or Charlie

		
		
	}
}
