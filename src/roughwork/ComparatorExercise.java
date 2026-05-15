package roughwork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;



class Person{
	private String personName;
	private String country;
	private int salary;
	private double creditrate;
	
	
}
public class ComparatorExercise {

	public static void main(String[] args) {
		
		
		List<String> inputlist = new ArrayList<String>(Arrays.asList("dog","cat", "donkey","horse","goat","lion","camel"));
		
		/*
		//inputlist.sort((a,b) -> a.compareTo(b));
		
		Collections.sort(inputlist, (s1, s2) -> s1.compareTo(s2));
		
		
		System.out.println("Result: "+inputlist);
		
		
		Predicate<String> predicatetry = animal -> animal.startsWith("c");
		
		Predicate<String> secondpredicate  = a -> a != null;
		
		Predicate<String> thirdpredicate = predicatetry.and(secondpredicate);
				
		List<String> result = inputlist.stream().filter(predicatetry).map(String::toString).collect(Collectors.toList());
		
		System.out.println("How:: "+result);
		
		boolean value = inputlist.stream().anyMatch(predicatetry);
		
		*/
		
		
		int sum = Arrays.asList(1, 2, 3, 4, 5).stream().reduce(0, (a,b) -> a+b);

		System.out.println(sum); // Output: 15
		
		Optional<String> opt = Optional.ofNullable(inputlist.toString());
		opt.ifPresent(System.out::println);
		inputlist.removeIf(s -> s.startsWith("d"));
		
		
		Supplier<String> sup = () -> "Hello";
		
		System.out.println(sup.get());
		
		Consumer<String> con= message -> System.out.println("what is");
		// con.
		
		

		
	}
}
