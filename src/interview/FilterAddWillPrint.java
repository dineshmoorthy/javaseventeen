package interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterAddWillPrint {

	public static void main(String[] args) {
		

		List<Integer> stringlist = new ArrayList<>(Arrays.asList(1, 3, 4, 6, 7, 5, 8, 9, 10, 11));

		List<Integer> wow = stringlist.stream()
		                              .filter(f -> f % 2 == 0)
		                              .collect(Collectors.toList());

		stringlist.add(12); // ✅ Works now!

		for (int x : wow) {
		    System.out.println(": " + x);
		}
	
		
	
	}

}
