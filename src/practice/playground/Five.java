package practice.playground;

import java.util.ArrayList;
import java.util.List;

public class Five {
	
	public static void main(String[] args) {
		List<String> list = List.of("A", "B", "C", null);
	//	list.set(1, "Z");  // UnsupportedOperationException
	//	list.add("D");     // 
		System.out.println(list);
	}
}
