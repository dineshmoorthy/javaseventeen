package interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Person {
	String firstName;
	String lastName;
	int age;

	public Person(String fn, String ln, int age) {
		this.firstName = fn;
		this.lastName = ln;
		this.age = age;
	}

	public String toString() {
		return lastName + ", " + firstName + " (" + age + ")";
	}
}

public class JavaEightExamples {

	public static void main(String[] args) {
		// arraysMethod();
		// streamExample();

		methodExample();
	}

	private static void streamExample() {
		// TODO Auto-generated method stub
		List<String> myList = Stream.of("a", "b").map(String::toUpperCase).collect(Collectors.toList());
		// assertEquals(asList("A", "B"), myList);
	}

	private static void arraysMethod() {
		// TODO Auto-generated method stub
		List<List<String>> list = Arrays.asList(Arrays.asList("a"), Arrays.asList("b"));
		System.out.println(list);
	}

	public Optional<String> findUsernameById(int id) {
		if (id == 1)
			return Optional.of("John");
		else
			return Optional.empty();
	}

	public void greetUser(int id) {
		// remember below syntax
		findUsernameById(id).ifPresentOrElse(name -> System.out.println("Hello, " + name),
				() -> System.out.println("User not found"));
	}

	public static void methodExample() {
		List<Person> people = List.of(new Person("Alice", "Smith", 30), new Person("Bob", "Smith", 25),
				new Person("Alice", "Jones", 22));

		List<Person> sorted = new ArrayList<>(people);
		
		// remember below syntax
		sorted.sort(Comparator.comparing((Person p) -> p.lastName).thenComparing(p -> p.firstName)
				.thenComparingInt(p -> p.age));

		sorted.forEach(System.out::println);

	}

	public static void functionalExample() {
		List<Integer> numbers = Arrays.asList(1, 2, 4, 9, 8, 7, 3);
		System.out.println("Sorted using static method reference");
		// Use static method compare
		numbers = numbers.stream().sorted(Integer::compare).toList();
		System.out.println(numbers);

		numbers = Arrays.asList(1, 2, 4, 9, 8, 7, 3);
		System.out.println("Sorted using instance method reference");
		// Use instance method compareTo
		numbers = numbers.stream().sorted(Integer::compareTo).toList();

		System.out.println(numbers);
	}

	public static void  streamExampleThree(){
		 List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");

	      // get stream from list using stream() method
	      // then apply filter
	      // lastly count the result of filter
	      long count = strings.stream().filter(string -> string.isEmpty()).count();
	      System.out.println("Empty Strings: " + count);
	}
	
	public static void  opitonalExampleTwo(){
		 // remember below syntaxs
		
		 // case 1: Optional is having null as underlying value
	      Optional<Integer> valueOptional = Optional.ofNullable(null);

	      System.out.println(valueOptional);
	      
	      // case 2:  Optional is having not null as underlying value
	      Optional<Integer> valueOptional1 = Optional.ofNullable(Integer.valueOf(10));

	      // orElse will return -1 being default value
	      Integer value = valueOptional.orElse(Integer.valueOf(-1));

	      System.out.println(value);

	      //  orElse will return the underlying value
	      Integer value1 = valueOptional1.orElse(Integer.valueOf(-1));

	      System.out.println(value1);
	}
	
	public static void  executableExample(){
		int number = 20;
		Thread newThread = new Thread(() -> {
		    System.out.println("Factorial of " + number + " is: " + Factorial.returnObjectmethod(number));
		});
		newThread.start();
		ExecutorService threadpool = Executors.newCachedThreadPool();
		Future<Integer> futureTask = threadpool.submit(() -> Factorial.returnResult());

		while (!futureTask.isDone()) {
		    System.out.println("FutureTask is not finished yet..."); 
		} 
		
	//	long result = futureTask.get(); 

		threadpool.shutdown();
	}
	/*
	CompletableFuture<Long> completableFuture = CompletableFuture.supplyAsync(() -> Factorial.returnObjectmethod(number));
	while (!completableFuture.isDone()) {
	    System.out.println("CompletableFuture is not finished yet...");
	}
	long result = completableFuture.get();*/
}
