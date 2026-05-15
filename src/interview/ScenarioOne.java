package interview;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

class Teacher implements Comparable<Teacher>{
	
	private int id;
	
	private String name;
	
	private int salary;

	
	public Teacher(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public Teacher(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	
	@Override
	public int hashCode() {
		return Objects.hash(id);
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
		return id == other.id;
	}

	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Teacher o) {
		// TODO Auto-generated method stub
		return Integer.compare(this.id, o.id);
	}
	
	
}

public class ScenarioOne {

	public static void main(String[] args) {
		
		List<Teacher> teacherlist = new ArrayList<Teacher>();
		teacherlist.add(new Teacher(4,"poochi", 900));
		teacherlist.add(new Teacher(3, "ponrani", 200));
		teacherlist.add(new Teacher(1, "suthubanu", 300));
		teacherlist.add(new Teacher(5, "maths", 700));
		teacherlist.add(new Teacher(2, "katachi", 600));
		teacherlist.add(new Teacher(6, "natukatta", 500));
		teacherlist.add(new Teacher(1, "sridevi", 500));
		
		// below distinct is not working as expected eventhough we had overridden equals and hashcode method
		
		teacherlist.stream().distinct();
		Set<Teacher> set = teacherlist.stream().collect(Collectors.toSet());
		for(Teacher tec : teacherlist) {
			System.out.println(tec);
		}
		
		
		for(Teacher tec : set) {
			System.out.println(": "+tec);
		}
		
		teacherlist.stream().distinct().forEach(System.out::println);;
		
				
		CopyOnWriteArrayList<Teacher> copylist = new CopyOnWriteArrayList<Teacher>(teacherlist);
		
		
		// below foreach is iterating with a snapshot or copy. therefore 
		for(Teacher tch: copylist) {
			if("sridevi".equalsIgnoreCase(tch.getName()))
				copylist.remove(tch);
		}
		
		copylist.forEach(System.out::println);
		
		copylist.removeIf(f -> "sridevi".equalsIgnoreCase(f.getName()));
		
		copylist.forEach(System.out::println);
		
		
		
	}

	
}
