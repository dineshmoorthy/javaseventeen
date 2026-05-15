package interview;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Studend {
	String name;
	int marks;

	public Studend(String name, int marks) {
		this.name = name;
		this.marks = marks;
	}
/*
	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof Studend))
			return false;
		Studend s = (Studend) o;
		return this.marks == s.marks && name.equals(s.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, marks);
	}
*/
}

// Why? Because:

// You did NOT override equals() and hashCode()

// HashSet considers both objects as different (based on memory reference)

public class DuplicatesExample {

	public static void main(String[] args) {

		Set<Studend> set = new HashSet<>();
		set.add(new Studend("Alice", 90));
		set.add(new Studend("Alice", 90)); // Looks same, but new object

		System.out.println(set.size()); // Outputs: 2
		
		System.out.println(set);
	}

}
