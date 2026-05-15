package interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class RelianceEmployee {
	private String employeeName;
	int age;

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public RelianceEmployee(String employeeName, int age) {
		super();
		this.employeeName = employeeName;
		this.age = age;
	}

	@Override
	public String toString() {
		return "RelianceEmployee [employeeName=" + employeeName + ", age=" + age + "]";
	}

}

public class ListManipulation {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		List<RelianceEmployee> employeeList = Arrays.asList(new RelianceEmployee("anil", 45),
				new RelianceEmployee("ambani", 55), new RelianceEmployee("Mukesh", 65),
				new RelianceEmployee("Birla", 35), new RelianceEmployee("Tata", 15));

		List<List<List<String>>> inputlist = Arrays.asList(
				Arrays.asList(Arrays.asList("aaa", "bb"), Arrays.asList("ccc", "dd"), Arrays.asList("ee", "ff")));

		// remember below syntax
		
		// using map how to iterate list of list
		 inputlist.stream().map(s -> s.stream().map(f->
		 f.stream().map(String::toUpperCase).collect(Collectors.toList())).collect(Collectors.toList())).forEach(System.out::println);

		// same using flatmap

		// inputlist.stream().flatMap(List::stream).flatMap(List::stream).forEach(System.out::println);

		inputlist.stream().map(f -> f.stream().map(s -> s.stream()).collect(Collectors.toList()))
				.collect(Collectors.toList()).forEach(System.out::println);

		long totalWords = inputlist.stream().flatMap(List::stream).count();

		System.out.println("counts: " + totalWords);

		Map<Integer, List<String>> grouped = inputlist.stream().flatMap(List::stream).flatMap(List::stream)
				.collect(Collectors.groupingBy(String::length));

		System.out.println(grouped);
		System.out.println("map: " + grouped.toString());

		String joined = inputlist.stream()
				.flatMap(List::stream)
				.flatMap(List::stream)
				.collect(Collectors.joining(", "));

		System.out.println("Joined: " + joined); // aa, bb, cc, dd, ee, ff

		Stream<Object> uppercased = inputlist.stream()
				.map(s -> s.stream().map(f -> f.stream().map(String::toUpperCase).collect(Collectors.toList()))
						.collect(Collectors.toList()));

		System.out.println("upper: " + uppercased.collect(Collectors.toList())); // [[AA, BB], [CC, DD], [EE, FF]]

			
		
	}
}
