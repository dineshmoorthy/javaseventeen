package javaeight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class IterationExample {

	public static void main(String[] args) {
		
		
		String input= "JAva is just started july of Java one day Java will be top of language";
	
		String[] strinp = input.toLowerCase().split("\\s+");
		
		System.out.println("Array string Normal."
				+ " : "+strinp);
		System.out.println("Array string conversion : "+Arrays.toString(strinp));
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (String string : strinp) {
			map.put(string, map.getOrDefault(string, 0)+1);
		}
		
		System.out.println(map.toString());
		
		// use map Entry & foreach loop --> to iterate items
		// Use Map.Entry when: You need both key and value.
		for (Map.Entry<String, Integer> string : map.entrySet()) {
			if(string.getValue() > 1)
			{
				System.out.println("Values are : "+string.getKey());
			}
		}		
		
		Set<Entry<String, Integer>> inputs = map.entrySet();
		for (Entry<String, Integer> string :inputs) {
			if(string.getValue() > 1)
			{
				System.out.println("Second values are : "+string.getKey());
			}
		}	
		// use iterator and while loop hasnext method --> to remove item
		Iterator<Entry<String, Integer>> itera = map.entrySet().iterator();
		
		while(itera.hasNext()) {
			Entry<String, Integer> loopip = itera.next();
			System.out.println();
		}
		
		// Alternative Without Map.Entry (Less Efficient)
		for(String key :map.keySet()) {
			Integer  value = map.get(key);
			System.out.println("value: "+value);
		}
		
		
		List<String> strlist = Arrays.asList(strinp);
		List<String> result = strlist.stream().filter(s -> s.startsWith("j")).map(String::toUpperCase).collect(Collectors.toList());
		
		System.out.println("Result: "+result.toString());
		
		Set<String> unique = new HashSet<String>();
		for (String string : result) {
			unique.add(string);
		}
		
		System.out.println("unique: "+unique.toString());
		
		
		// above loginc in java 8
		
		Set<String> finalset = result.stream().collect(Collectors.toCollection(LinkedHashSet::new));
		System.out.println("finalset: "+finalset);
		
		result.stream().forEach(str -> System.out.println(str));
		
		
		Predicate<String> predstart = s -> s.startsWith("j");
		
		strlist.stream().filter(predstart).map(String::toUpperCase).forEach(str -> System.out.println("Iam: "+str));
		
		String strinputs  = "JAva is just started july of Jave one day Java will be top of language";
	
		String[] arryinputs = strinputs.toLowerCase().split("\\s+");
		
		List<String> liststring = Arrays.asList(arryinputs);
		
		Predicate<String> samplepredicate = f -> f.startsWith("j");
		List<String> stringouputs = liststring.stream().filter(samplepredicate).collect(Collectors.toList());
		
		System.out.println("result: "+stringouputs);


	}
}
