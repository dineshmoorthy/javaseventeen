package interview;

import java.util.List;

public class ForLoopExample {

	public static void main(String[] args) {

		List<String> list = List.of("Java", "Python", "Go");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

	}

}
