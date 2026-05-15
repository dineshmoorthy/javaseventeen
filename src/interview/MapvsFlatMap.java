package interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapvsFlatMap {
	public static void main(String[] args) {
		List<List<String>> stringlist = Arrays.asList(Arrays.asList("window","doors", "steps", "curtains"), Arrays.asList("pug","labrador", "dober", "pommerian"));
	
		List<List<String>> result = stringlist.stream().map(f -> f.stream().collect(Collectors.toList())).collect(Collectors.toList());
		
		//using map
		result.forEach(System.out::println);
		
		// using flatmap
	    List<String> flatmapresult = stringlist.stream()
	            .flatMap(innerList -> innerList.stream())        // flatten List<List<String>> → Stream<String>
	            .map(String::toUpperCase)                        // convert each string to uppercase
	            .collect(Collectors.toList());                   // collect into a List<String>

	        System.out.println(flatmapresult);
	        
	        
		/*
	
		*/
	        List<List<List<String>>> stringlistu = Arrays.asList(Arrays.asList(Arrays.asList("window","doors", "steps", "curtains"), Arrays.asList("pug","labrador", "dober", "pommerian")));
	    	
			stringlistu
				.stream()
					.map(f -> f.stream()
						.map(s -> s.stream()
							.collect(Collectors.toList()))
								.collect(Collectors.toList()))
									.collect(Collectors.toList())
										.stream()
											.map(inner -> {
												List<String> merged = new ArrayList<String>();
												inner.forEach(merged::addAll);
												return merged;
											}).collect(Collectors.toList()).forEach(System.out::println);
		

		//System.out.println("Result: "+ );
		
	}
}
