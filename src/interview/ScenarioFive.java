package interview;

import java.util.Arrays;
import java.util.List;

public class ScenarioFive {

	public static void main(String[] args) {

		List<String> inputlist = Arrays.asList("dog", "cat", "donkey", "dinosauraus", "elephant", "pig", "horse", "fox",
				"goat", "hen", "ox");

		inputlist.stream().map(x -> x.equalsIgnoreCase("pig") ? "yalie" : x).toList();

		/*
		 * The .toList() collector (introduced in Java 16) returns an unmodifiable list
		 * — not a mutable one.
		 * 
		 * The stream processing itself doesn’t mutate inputlist.
		 * 
		 * It creates a new list that cannot be changed.
		 */
		
		// replaceAll() internally just calls set(index, newValue) on each element.
		inputlist.replaceAll(a -> a.equalsIgnoreCase("pig") ? "yalie" : a);

		System.out.println(inputlist);

	}
}
