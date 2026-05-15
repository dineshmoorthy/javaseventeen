package interview;

import java.util.Objects;

class People {
	String name;

	People(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof People))
			return false;
		People other = (People) obj;
		return Objects.equals(this.name, other.name);
	}

}

public class ScenarioThree {

	// diff b/w == vs equals
	public static void main(String[] args) {

		People p1 = new People("Dinesh");
		People p2 = new People("Dinesh");

		System.out.println(p1 == p2); // ❌ false (different objects)
		System.out.println(p1.equals(p2)); // ❌ false (same as == since equals not overridden)
		
		Integer x = 100;
		Integer y = 100;
		System.out.println(x == y);       // ✅ true (cached integers between -128 and 127)
		System.out.println(x.equals(y));  // ✅ true

		Integer m = 200;
		Integer n = 200;
		System.out.println(m == n);       // ❌ false (outside caching range)
		System.out.println(m.equals(n));  // ✅ true

		
		/*
		 
		 == checks reference equality, .equals() checks value equality.

For primitives → use ==.

For objects → use .equals() to compare values (content).

String, Integer, and most core classes override .equals() properly.

Custom classes should override .equals() (and hashCode()) for logical equality.

		 */
	}
}
