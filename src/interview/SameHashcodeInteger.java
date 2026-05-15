package interview;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class GovEmployee {
    int id;
    String name;

    public GovEmployee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof GovEmployee e))
			return false;
		return id == e.id && Objects.equals(name, e.name);
	}

    @Override
    public int hashCode() {
        return 100; // ❌ bad idea
       // return Objects.hash(id, name); 
       // return new Random().nextInt(1000); 
    }
}


public class SameHashcodeInteger {

	public static void main(String[] args) {
		// test below details changing hashcode return statement
		
		GovEmployee e1 = new GovEmployee(1, "Alice");
		GovEmployee e2 = new GovEmployee(1, "Alice");

		System.out.println(e1.equals(e2));  // true
		System.out.println(e1.hashCode() == e2.hashCode());  // true ✅

		
		
		Set<GovEmployee> employees = new HashSet<>();
		employees.add(new GovEmployee(1, "John"));
		employees.add(new GovEmployee(2, "Jane"));
		employees.add(new GovEmployee(3, "Bob"));
		
		
		employees.add(e1);
		System.out.println(employees.contains(e2)); // false ❌

		
		
		
		

	}
}
