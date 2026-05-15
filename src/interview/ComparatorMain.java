package interview;

import java.util.*;

public class ComparatorMain {
	public static void main(String[] args) {
		List<Student> studentso = Arrays.asList(new Student(3, "Alice"), new Student(1, "Charlie"), new Student(2, "Bob"));
		

		List<Student> students = List.of(new Student(3, "Alice"), new Student(1, "Charlie"), new Student(2, "Bob"));
		

		// Arrays.asList() - Fixed-size List
		
		List<String> namesu = Arrays.asList("Alice", "Bob", "Charlie");
		namesu.set(0, "Alex"); // ✅ Works
		namesu.add("David"); // ❌ Throws UnsupportedOperationException

		
		// List.of() - Immutable
		List<String> names = List.of("Alice", "Bob", "Charlie");
		names.add("David"); // ❌ Throws UnsupportedOperationException
		names.set(0, "Alex"); // ❌ Throws UnsupportedOperationException
		
		
		List<Student> sortedByName = new ArrayList<>(students);
		sortedByName.sort(Comparator.comparing(Student::getName));
		

		System.out.println("Sorted by name:");
		sortedByName.forEach(System.out::println);
		// normal way
		List<Student> list = new ArrayList<>();
		list.add(new Student(3, "Alice"));
		list.add(new Student(1, "Bob"));
		list.add(new Student(2, "Charlie"));
		// duplicates objects based on id
		list.add(new Student(2, "Charlie"));
		list.add(new Student(2, "rana"));

		
		List<Student> sortedNormalByName = new ArrayList<>(list);
		sortedNormalByName.sort(Comparator.comparing(Student::getName));
		
		System.out.println("Sorted by normal name:");
		sortedByName.forEach(System.out::println);
	}
}
