package capgemini;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

class Animal {
	
}

class Employee extends Animal{
	
	private String name;
	private int age;
	
}
public class CodeTest {
	

	public static void main(String[] args) {
		List<Integer> listinupts = Arrays.asList(23,56,45, 78,90,34, 25, 3, 5,1,7, 11);
		
		//listinupts.stream().filter(s -> s > 10).sorted((a,b) -> a.compareTo(b)).forEach( s -> System.out.println(s));
	
		Predicate<String> s = si -> si.startsWith("s");
		Supplier<String> ss = () ->  "hello";
		//System.out.println("Supplier: "+ss);
	
		
		Predicate<Integer> predicate1 = (a) -> a > 20;
		Function<Integer, String> function1 = (a) -> a > 20 ? "satisfy" : "Not-satisfy";
		
		
		listinupts.stream().filter(predicate1).sorted((a, b) -> a.compareTo(b)).forEach(se -> System.out.println(se));
			
	}
}
