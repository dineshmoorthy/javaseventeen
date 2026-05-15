package accolite;

import java.util.*;
import java.util.stream.*;

public class AccoliteTest {
	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(new Employee(103, "Charlie", "HR", 60000),
				new Employee(104, "David", "IT", 72000), new Employee(101, "Alice", "HR", 55000),
				 new Employee(105, "Eve", "Finance", 50000), new Employee(102, "Marley", "Electricity", 75000), new Employee(106, "Sumitha", "Developement", 75000)
				 , new Employee(109, "Kabilan", "Scrum", 70), new Employee(110, "Michael", "IT", 5000), new Employee(107, "godfrey", "Management", 600)
				 , new Employee(108, "Dinesh`", "Software", 5000)
				 , new Employee(108, "Natasha`", "Admin", 500)
				 , new Employee(108, "Josh`", "Management", 500)
				 , new Employee(108, "Neille`", "Developer", 500)
				 , new Employee(108, "Natasha`", "Software", 500));

		System.out.println("Sorted employee list (by department, then salary):\n");

		
		// Chained comparison
		employees.stream().sorted(Comparator.comparing(Employee::getDepartment).thenComparing(Employee::getSalary))
				.forEach(System.out::println);
		
		// way 2
		
		System.out.println("Sorted employee list way 2 (by department, then salary):\n");
		
		// Custom logic: Write your own logic inline
		// .sorted((a,b) -> a.getSalary() - b.getSalary())
		employees.stream().sorted(Comparator.comparing(Employee::getDepartment).thenComparing((a,b) -> Double.compare(a.getSalary(),b.getSalary()))).forEach(System.out::println);
		
		employees.stream().sorted((a,b) -> a.compareTo(b)).forEach(System.out::println);
		
		employees.stream().sorted(Comparator.comparing(Employee::getDepartment).thenComparing(Comparator.comparing(Employee::getSalary)));
	}
}
