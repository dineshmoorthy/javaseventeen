package roughwork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class cc {

	public static void main(String[] args) {
/*
		List<String> input = Arrays.asList("apple", "banana", "apple", "orange");

		 List<String> inps = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");

		 List<String> checked = new ArrayList<>();

		 for (String string : inps) {
			if(!checked.contains(string))
			{
				checked.add(string);
			}else {
				
				System.out.println("Duplicate: "+string);
			}
		}
		
		 System.out.println("Final: "+checked);
	
		for (String string : input) {
			checked.add(string);
		}

		Iterator<String> iter = checked.iterator();
		while(iter.hasNext()) {
			String item = iter.next();
			if(item.equalsIgnoreCase("apple")) {
				//checked.remove("apple");
				iter.remove();
			}
		}
		
		System.out.println("Removed: "+checked);
		
		
		
		LinkedHashMap<Integer, String>  linklist = new LinkedHashMap<Integer, String>();
		linklist.put(1, "Apple");
		linklist.put(2, "Banana");
		linklist.put(3, "Cycle");
		linklist.put(4, "Elephant");
		
		

		if(linklist.containsKey(4)) {
			
			System.out.println("Iteration: "+linklist.pollFirstEntry());
			
			System.out.println("Final: "+linklist);
		}
		*/


		 List<String> inps = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple", "orange");

		 List<String> checked = new ArrayList<>();
		 
		 Map<String, Integer> duplicatecount = new HashMap<String, Integer>();
		 
		 
		/* for(String ss : inps) {
			 if(!checked.contains(ss))
			 {
				checked.add(ss); 
			 }else {
				 duplicatecount.put(ss, duplicatecount.getOrDefault(ss, 0)+1);
			 }
		 }*/
		 
		 System.out.println("list: "+checked);
		 System.out.println("Map: "+duplicatecount);
		 Map<String, List<String>> grouped = 
				 inps.stream().collect(Collectors.groupingBy(s -> s));
				System.out.println("Grouped: "+grouped);
		 
		 Map<String, Long> dupmap = inps.stream().collect(Collectors.groupingBy(s -> s, Collectors.counting()));
		 System.out.println("DupMap: "+dupmap);
		 
		 // Then it would group by the length of each string, not the string itself.
		 Map<Integer, Long> dupsecond = inps.stream().collect(Collectors.groupingBy(String::length, Collectors.counting()));
		 System.out.println("dupsecond: "+dupsecond);
		
		 
		 inps.stream().distinct().collect(Collectors.toList()).forEach(x -> System.out.println(x));;
		 
		 Map<String, List<String>> result = inps.stream().collect(Collectors.groupingBy(s -> s, Collectors.toList()));
		 System.out.println("Dupgroup: "+result);
	}
}
