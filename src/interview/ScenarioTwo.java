package interview;

import java.util.Arrays;
import java.util.stream.Collectors;


public class ScenarioTwo {

	public static void main(String[] args) {
		String[] strarray = {"di", "ne", "sh", "mo", "or","thy"};
		//System.out.println(Arrays.asList(strarray).stream().collect(Collectors.joining("")));
		// remember below syntax
		String result = String.join("", strarray);
		System.out.println(result);
		
		System.out.println(Arrays.stream(strarray).collect(Collectors.joining("")));
		
	}

	
}
