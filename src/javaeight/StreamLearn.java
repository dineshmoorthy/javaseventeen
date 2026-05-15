package javaeight;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamLearn {

	public static void main(String[] args) {
		
		
		List<Integer> listOfNumbers = Arrays.asList(1, 2, 3, 4);
		
		// Sequential Streams
		listOfNumbers.stream().forEach(number ->
		    System.out.println(number + "Sequential Streams: " + Thread.currentThread().getName())
		);
		
		// Parallel Streams
		// A parallel stream allows us to use multi-core processing by executing the stream operation parallel across multiple CPU cores. The data is split into multiple sub-streams, and the intended operation is performed in parallel, and finally, the results are aggregated back to form the final output. 
		
		listOfNumbers.parallelStream().forEach(number ->
		    System.out.println(number + "Parallel Streams: " + Thread.currentThread().getName())
		);
		
		// parallelStream and parallel , they internally operates different way
		// https://www.baeldung.com/java-parallelstream-vs-stream-parallel
		
		listOfNumbers.stream().parallel().forEach(number ->
	    System.out.println(number + "stream.parallel: " + Thread.currentThread().getName())
		);
		
		List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
		Stream<String> nameStream = names.stream();
		
		
		String[] colors = {"Red", "Green", "Blue"};
		Stream<String> colorStream = Arrays.stream(colors);
		
		Stream<Integer> numbers = Stream.of(1, 2, 3, 4, 5);
		
		
		List<String> list = Arrays.asList("A", "B", "C");
		list.set(0, "Z");        // ✅ Allowed
		// list.add("D");        // ❌ Throws UnsupportedOperationException
		/*🔸 Key Points:
		Modifiable elements: You can change existing elements (set()).

		Not resizable: You cannot add() or remove() elements.

		Good for interoperating with arrays.
		
		*/
		
		
		
		
		Stream<String> stream = Stream.of("A", "B", "C");
		List<String> listu = stream.collect(Collectors.toList()); // Convert to List
	/*
		🔸 Key Points:
		Creates a stream, not a list.

		You must .collect() or .forEach() to consume it.

		Useful for pipelines or lazy evaluation.
		
		Creates a Stream, not a List.

		It’s part of the Stream API (used for functional operations).

		*/
		
		
		
		List<String> listm = List.of("A", "B", "C");
		// listm.set(0, "Z");    // ❌ UnsupportedOperationException
		// listm.add("D");       // ❌ UnsupportedOperationException

		/*🔹 What it does:
		Creates an immutable List.

		Returns an unmodifiable list with given elements.

		🔸 Key Points:
		Immutable: Cannot add, remove, or modify elements.

		Safer for fixed constant lists.
		
		*/
	}

}
