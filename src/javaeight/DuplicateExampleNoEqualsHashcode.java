package javaeight;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Student {
    String name;
    public Student(String name) { this.name = name; }
    
}

public class DuplicateExampleNoEqualsHashcode{
	public static void main(String[] args) {
		Student s1 = new Student("John");
		Student s2 = new Student("John"); // same content, different object

		Set<Student> set = new HashSet<>();
		set.add(s1);
		set.add(s2);

		System.out.println(set.size()+" : "); // 👉 2 (without equals/hashCode)

		
	}
}