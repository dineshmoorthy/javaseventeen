package interview;

import java.util.List;

public class ScenarioFour {

	public static void main(String[] args) {

		List<String> inputlist = List.of("dog", "cat", "donkey", "dinosauraus", "elephant", "pig", "horse", "fox",
				"goat", "hen", "ox");

		// actual task
		for (int i = 0; i < inputlist.size(); i++) {
			String str = inputlist.get(i);
			if("pig".equalsIgnoreCase(str)) {
				inputlist.replaceAll(s -> s.equalsIgnoreCase("pig") ? "yalie" : s);
			}
			
		}
		
		/*
		 * This works fine because:
		 * 
		 * You’re not modifying the original inputlist.
		 * 
		 * map(...).toList() just reads from it, produces a new unmodifiable list, and
		 * then you ignore that new list.
		 */
	
		
		// inputlist.stream().map(x -> x.equalsIgnoreCase("pig") ? "yalie" : x).toList();

		
		/*
		 * because replaceAll() internally tries to call set(index, newValue) — a
		 * mutating operation. But the list returned by List.of() does not support
		 * mutation of any kind.
		 * 
		 * Hence, the exception.
		 */

		
		// inputlist.replaceAll(a -> a.equalsIgnoreCase("pig") ? "yalie" : a);

		System.out.println(inputlist);

	}
}
