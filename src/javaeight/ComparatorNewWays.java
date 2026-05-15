package javaeight;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

import accolite.Employee;
import accolite.Student;

//Detailed way of comparator
class EmployeenameComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getDepartment().compareTo(o2.getDepartment());
	}

}

public class ComparatorNewWays {

	// simple way of comparator
	public static final Comparator<StudentTwo> studentComparator = Comparator.comparing(StudentTwo::getStudentName);
	public static final Comparator<Employee> employeeComparator = Comparator.comparing(Employee::getDepartment);

	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(new Employee(103, "Charlie", "HR", 60000),
				new Employee(104, "David", "IT", 72000), new Employee(101, "Alice", "HR", 55000),
				new Employee(105, "Eve", "Finance", 50000), new Employee(102, "Marley", "Electricity", 75000),
				new Employee(106, "Sumitha", "Developement", 75000), new Employee(109, "Kabilan", "Scrum", 70),
				new Employee(110, "Michael", "IT", 5000), new Employee(107, "godfrey", "Management", 600),
				new Employee(108, "Natasha`", "Admin", 500), new Employee(108, "Josh`", "Management", 500),
				new Employee(108, "Neille`", "Developement", 450), new Employee(108, "Natasha`", "Admin", 7500));

		// rememeber below syntax
		// (s -> s.toUpperCase())
		// ((s1, s2) -> s1 + s2)

		/*
		 * (() -> { return "Hello from async task!"; )
		 * 
		 */

		// way 1
		employees.stream().sorted(Comparator.comparing(Employee::getDepartment).thenComparing(Employee::getSalary))
				.forEach(System.out::println);

		// way 2

		employees.sort(Comparator.comparing(Employee::getDepartment).thenComparing(Employee::getSalary));

		// way3 using lambda + compareto method

		employees.sort((a, b) -> a.getDepartment().compareTo(b.getDepartment()));

		// way 4 Using lambda + Comparator
		employees.stream().sorted(Comparator.comparing(e -> e.getDepartment()));

		/*
		 * for (Employee employee : employees) {
		 * 
		 * System.out.println(employee); }
		 */

		List<String> namelistu = Arrays.asList("Alice", "Bob", "Daniel", "Charlie", "Elizabeth", "Austin");

		namelistu.stream().sorted().forEach(System.out::println);
		;

		System.out.println("Department-------------------");
		employees.stream().sorted(
				Comparator.comparing(Employee::getDepartment).thenComparing(Comparator.comparing(Employee::getSalary)))
				.forEach(System.out::println);

		System.out.println("sorted EmployeeName-------------------");
		employees.stream().sorted(Comparator.comparing(Employee::getEmployeeName)
				.thenComparing(Comparator.comparing(Employee::getSalary))).forEach(System.out::println);

		employees.sort(Comparator.comparing(Employee::getDepartment).thenComparing(Employee::getSalary));

		System.out.println("sort Method reference EmployeeName-------------------"+employees);
		employees.stream().sorted(
				Comparator.comparing((Employee e) -> e.getDepartment()).thenComparing((Employee e) -> e.getSalary()))
				.forEach(e -> System.out.println(e));

		
		employees.sort(
				Comparator.comparing((Employee e) -> e.getDepartment()).thenComparing((Employee e) -> e.getSalary()));
		
		System.out.println("sort Lambda EmployeeName-------------------"+employees);
		
		// simple way of comparator
		employees.stream().sorted(employeeComparator).forEach(System.out::println);

		// detailed way of comparator
		employees.sort(new EmployeenameComparator());

		Collections.sort(employees, new EmployeenameComparator());

		Collections.sort(employees, new Comparator<Employee>() {

			@Override
			public int compare(Employee e1, Employee e2) {
				// TODO Auto-generated method stub
				// return
				// Double.valueOf(e1.getSalary()).compareTo(Double.valueOf(e2.getSalary()));

				// right way is below. It’s more efficient because it avoids unnecessary object
				// creation.
				return Double.compare(e1.getSalary(), e2.getSalary());

			}
		});

//		studentList.sort((a, b) -> a.getDepartment().compareTo(b.getDepartment()));

		/*
		 * for (Employee employee : employees) {
		 * 
		 * System.out.println(employee); }
		 */

		// This will not work as expected
		// The reason your two sort operations do not combine (i.e., salary sort
		// overriding the earlier department sort) is because each sort() call reorders
		// the entire list,
		// discarding any previous sort order.
		// This completely re-sorts the list by salary, ignoring the earlier department
		// order.

		// Pre-Java 8 equivalent

		Collections.sort(employees, new Comparator<Employee>() {
			@Override
			public int compare(Employee e1, Employee e2) {
				int deptCompare = e1.getDepartment().compareTo(e2.getDepartment());
				if (deptCompare != 0) {
					return deptCompare;
				}
				return Double.compare(e1.getSalary(), e2.getSalary());
			}
		});

		// three sorting

		List<Student> studentList = Arrays.asList(
				new Student(1, "Judy", "Computer Science", 1700.0, "Hyderabad", "94%", 10, "AI"),
				new Student(2, "Grace", "Electronics", 1250.0, "Pune", "79%", 8, "Embedded Systems"),
				new Student(3, "Frank", "Computer Science", 1550.0, "Bangalore", "82%", 9, "Machine Learning"),
				new Student(4, "David", "Computer Science", 1600.0, "Hyderabad", "91%", 10, "Python"),
				new Student(5, "Eva", "Civil", 1100.0, "Delhi", "74%", 7, "Structural Design"),
				new Student(6, "Charlie", "Mechanical", 1300.0, "Mumbai", "88%", 9, "AutoCAD"),
				new Student(7, "Bob", "Electronics", 1200.0, "Chennai", "78%", 8, "VLSI"),
				new Student(8, "Helen", "Mechanical", 1350.0, "Chennai", "86%", 9, "Thermodynamics"),
				new Student(9, "Ian", "Civil", 1150.0, "Kolkata", "73%", 7, "Construction"),
				new Student(10, "Alice", "Computer Science", 1500.0, "Bangalore", "85%", 9, "Java")

		);

		Collections.sort(studentList, new Comparator<Student>() {
			@Override
			public int compare(Student s1, Student s2) {
				// First sort by department
				int deptCompare = s1.getDepartment().compareTo(s2.getDepartment());
				if (deptCompare != 0) {
					return deptCompare;
				}

				// Then by marks
				int marksCompare = s1.getMarks().compareTo(s2.getMarks());
				if (marksCompare != 0) {
					return marksCompare;
				}

				// Then by student name
				return s1.getExpertise().compareTo(s2.getExpertise());
			}
		});

		for (Student student : studentList) {
			System.out.println(student);
		}
		/*
		 * This directly sorts the studentList in place (modifies the original list).
		 * 
		 * No stream involved.
		 * 
		 * Returns void.
		 */

		studentList.sort(Comparator.comparing(Student::getDepartment).thenComparing(Student::getMarks)
				.thenComparing(Student::getStudentName));

		// old way

		Collections.sort(studentList, new StudentMultiComparator());

		// other ways of using comparable

		List<StudentTwo> studentTwoList = Arrays.asList(
				new StudentTwo(1, "Judy", "Computer Science", 1700.0, "Hyderabad", "94%", 10, "AI"),
				new StudentTwo(2, "Grace", "Electronics", 1250.0, "Pune", "79%", 8, "Embedded Systems"),
				new StudentTwo(3, "Frank", "Computer Science", 1550.0, "Bangalore", "82%", 9, "Machine Learning"),
				new StudentTwo(4, "David", "Computer Science", 1600.0, "Hyderabad", "91%", 10, "Python"),
				new StudentTwo(5, "Eva", "Civil", 1100.0, "Delhi", "74%", 7, "Structural Design"),
				new StudentTwo(6, "Charlie", "Mechanical", 1300.0, "Mumbai", "88%", 9, "AutoCAD"),
				new StudentTwo(7, "Bob", "Electronics", 1200.0, "Chennai", "78%", 8, "VLSI"),
				new StudentTwo(8, "Helen", "Mechanical", 1350.0, "Chennai", "86%", 9, "Thermodynamics"),
				new StudentTwo(9, "Ian", "Civil", 1150.0, "Kolkata", "73%", 7, "Construction"),
				new StudentTwo(10, "Alice", "Computer Science", 1500.0, "Bangalore", "85%", 9, "Java")

		);

		Collections.sort(studentTwoList);

		// other styles
		studentList.sort(Comparator.comparingInt(Student::getStudentId));

		// separate the comparator
		List<String> nameso = Arrays.asList("Charlie", "Bob", "Alice");

		Comparator<String> byLength = (a, b) -> Integer.compare(a.length(), b.length());
		Collections.sort(nameso, byLength);

		System.out.println(nameso); // [Bob, Alice, Charlie]

		// single line
		// nameso.stream().sorted(...) – Creates a New Stream (Immutable)

		/*
		 * This does not modify the original nameso list.
		 * 
		 * Instead, it returns a new sorted stream.
		 * 
		 * You must collect the stream to a list to store or use the sorted result.
		 */

		nameso.stream().sorted(Comparator.comparing(String::length));
		nameso.stream().sorted(Comparator.comparing(s -> s));

		// Comparator byRanking =
		// (Player player1, Player player2) -> Integer.compare(player1.getRanking(),
		// player2.getRanking());

		/*
		 * Comparator<Player> byRanking = Comparator .comparing(Player::getRanking);
		 * Comparator<Player> byAge = Comparator .comparing(Player::getAge);
		 * 
		 */

		String[] str0; // declaration without size String[] str1 = new String[4]; //declaration with
						// size

		List<String> namelist = Arrays.asList("nakul", "Peter", "Elizabeth", "Richarson", "Malik", "Abdul", "Alice");

		/*
		 * 
		 * namelist.sort(String::compareTo);
		 * 
		 * System.out.println("way0: " +namelist);
		 * 
		 * 
		 * Collections.sort(namelist, String::compareTo); System.out.println(namelist);
		 * 
		 * // way 1 namelist.sort((a,b) -> a.compareTo(b));
		 * 
		 * System.out.println("way1: " +namelist);
		 * 
		 * // way 2 Collections.sort(namelist, (s1, s2) -> s1.compareTo(s2));
		 * 
		 * // way 3 Collections.sort(namelist, new Comparator<String>() {
		 * 
		 * @Override public int compare(String s1, String s2) { // TODO Auto-generated
		 * method stub return s1.compareTo(s2); }
		 * 
		 * });
		 * 
		 * System.out.println("way2: " +namelist);
		 * 
		 * 
		 * namelist.stream().sorted(Comparator.comparing(s ->
		 * s)).forEach(System.out::println);;
		 * 
		 * //System.out.println("Result: "+namelist); ///
		 */

		
		Stream<String> snamelist = Stream.of("Alice", "Bob", "Daniel", "Charlie","Elizabeth","Austin");
		
		snamelist.sorted().forEach(System.out::println);;
		
	}
}
