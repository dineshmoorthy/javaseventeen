package javaeight;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

import recursive.FunctionalInterfaceExample;

public class OwnFunctionInterfaceExample {

	public static void main(String[] args) {

		// simple way
		MyFunctionalInterface func = () -> System.out.println("Hello!");
		func.doSomething();

		// way 2
		FunctionalInterfaceExample exmp = (m) -> System.out.println("what is ohmygod" + m);
		exmp.fate(": game of life");

		// way 3

		FunctionalInterfaceExample exmp3 = (msg) -> {
			if (msg.length() > 10) {
				System.out.println("Long message: " + msg);
			} else {
				System.out.println("Short message: " + msg);
			}
		};

		exmp3.fate("Hello");
		exmp3.fate("This is a really long message");

		// Lambda
		FunctionalInterfaceExample exmp4 = (msg) -> System.out.println(msg.toUpperCase());

		// Using it directly
		exmp4.fate("hello functional world");

		// Passing it to another method
		processMessage("java 8 rocks", exmp4);

		// Using method reference
		processMessage("using println directly", System.out::println);

		System.out.print("---------------");

		MyFunctionalInterfaceProcessor processor5 = (stf) -> stf.getSalary() * 100;

		List<Staff> staffList = Arrays.asList(new Staff(1, "Alice", "HR", 56), new Staff(2, "Bob", "Finance", 45),
				new Staff(3, "Charlie", "Engineering", 30), new Staff(4, "David", "HR", 23),

				new Staff(6, "Alice", "Finance", 12), new Staff(5, "Eva", "Finance", 8));
		// We can inject logic dynamically (bonus, tax, age, etc.) without changing the
		// method.

		// way 1 : functional interface method implementation
		staffList.stream().map(processor5::fate).filter(ex -> ex > 1000).forEach(System.out::println);

		// another way
		// rememeber below syntax
		MyFunctionalInterfaceProcessor ageExtractor = Staff::getSalary;

		System.out.println("From method way2-----------------");
		staffList.stream().map(staf -> processSalary(staf, ageExtractor)).filter(ex -> ex > 1000)
				.forEach(System.out::println);

		System.out.println("simple function and predicate way-----------------");

		// simple function and predicate way
		Function<Integer, Integer> funcu = x -> x * 100;
		Predicate<Integer> predu = ex -> Integer.valueOf(ex) > 1000;

		// rememeber below syntax
		staffList.stream().map(Staff::getSalary).map(funcu).filter(predu).forEach(System.out::println);

		// above code syntax is same as below runnable interface
		Runnable run = () -> System.out.println("From runnable");

		run.run();

	}

	static void processMessage(String input, FunctionalInterfaceExample handler) {
		System.out.print("Processed: ");
		handler.fate(input);
	}
	// Advanced usage

// Pass functional interfaces to methods

// Compose them

// Use method references (System.out::println)

// Reuse them in pipelines
	static int processSalary(Staff st, MyFunctionalInterfaceProcessor ageExtractor) {

		return ageExtractor.fate(st) * 100;
	}
}
