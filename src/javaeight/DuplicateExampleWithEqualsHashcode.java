package javaeight;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

class Teacher {
    String name;
    public Teacher(String name) { this.name = name; }
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Teacher other = (Teacher) obj;
		return Objects.equals(name, other.name);
	}
	@Override
	public String toString() {
		return "Teacher [name=" + name + "]";
	}
    
}

public class DuplicateExampleWithEqualsHashcode{
	public static void main(String[] args) {
		Teacher s1 = new Teacher("John");
		Teacher s2 = new Teacher("John"); // same content, different object

		Set<Teacher> set = new HashSet<>();
		set.add(s1);
		set.add(s2);

		System.out.println(set.size()+" : " +set); // 👉 2 (without equals/hashCode)

		
	}
}