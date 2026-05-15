package javaeight;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class DeclarationExamples {

	public static void main(String[] args) {
		
		String s1 = "apple", s2 = "banana";
		System.out.println(s1.compareTo(s2)); // negative (apple < banana lexicographically)

		
		int in1 = 10, in2 = 20;
		System.out.println(Integer.compare(in1, in2));
		
		Integer i1 = 10, i2 = 20;
		System.out.println(i1.compareTo(i2)); // negative (10 < 20)
		
		
		/*
			Use Double.compare (or Integer.compare, etc.)	when comparing primitive values.
			compareTo()	when comparing objects 

		 */
		
		List<String> list1 = Arrays.asList("one", "two", "three", "four");
		List<String> list2 = List.of("one", "two", "three", "four");
		
		Stream<String> list3 = Stream.of("one", "two", "three", "four");
		
	}
}
