package interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.Collectors;
import java.util.stream.Stream;



class RelianceEmp implements Comparable<RelianceEmp>{
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

	public RelianceEmp(String employeeName, int age) {
		super();
		this.employeeName = employeeName;
		this.age = age;
	}

	@Override
	public String toString() {
		return "RelianceEmp [employeeName=" + employeeName + ", age=" + age + "]";
	}

	// way 1
	/*
	@Override
	public int compareTo(RelianceEmp o) {
		// TODO Auto-generated method stub
		int ageint = Integer.compare(this.age, o.age);
		if(ageint != 0) {
			return ageint;
		}
		return  this.getEmployeeName().compareTo(o.getEmployeeName());
	}

	*/
	
	// way 2
	@Override
	public int compareTo(RelianceEmp o) {
		// TODO Auto-generated method stub
		int ageint = Integer.compare(this.age, o.age);
		if(ageint == 0) {
			return  this.getEmployeeName().compareTo(o.getEmployeeName());
		}
		return ageint;
	}
	
	
	// way 3
	
	/*
	@Override
	public int compareTo(RelianceEmp o) {
	    return Comparator.comparingInt(RelianceEmp::getAge)
	                     .thenComparing(RelianceEmp::getEmployeeName)
	                     .compare(this, o);
	}
	*/

	
	@Override
	public int hashCode() {
		return Objects.hash(age, employeeName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		/*
		if (getClass() != obj.getClass())
			return false;
		*/	
		if (!(obj instanceof RelianceEmp))
            return false;
		RelianceEmp other = (RelianceEmp) obj;
		return age == other.age && Objects.equals(employeeName, other.employeeName);
	}

	
}

class EmployeenameComparator implements Comparator<RelianceEmp>
{

	@Override
	public int compare(RelianceEmp o1, RelianceEmp o2) {
		// TODO Auto-generated method stub
		return o1.getEmployeeName().compareTo(o2.getEmployeeName());
		
	}
	
}

public class ArraylistDuplicationExample {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		List<RelianceEmp> inputlist = new ArrayList<RelianceEmp>();
		
		inputlist.add(new RelianceEmp("banana", 1));
		inputlist.add(new RelianceEmp("frog", 5));
		inputlist.add(new RelianceEmp("dates", 3));
		inputlist.add(new RelianceEmp("apple", 0));
		inputlist.add(new RelianceEmp("citric", 2));
		inputlist.add(new RelianceEmp("delhi", 3));
		inputlist.add(new RelianceEmp("apple", 0));
		inputlist.add(new RelianceEmp("Egg", 4));
		inputlist.add(new RelianceEmp("apple", 7));
		
		/* List allows duplicates.
		 * You’ll only lose duplicates if you do things like:

		// way 1
		Convert the list into a Set (e.g., HashSet) → uses equals() and hashCode()

		// way 2
		Use .distinct() on a Stream → uses equals() and hashCode()

		// way 3
		Collect to a Map where keys must be unique
		 */
		
		
		Collections.sort(inputlist);
		
		inputlist.forEach(System.out::println);
		System.out.println("------------");
		inputlist.stream().distinct().forEach(System.out::println);
		System.out.println("------------");
		
		/*
		 * And you're wondering why Egg is the first item, when you're sorting by employee name alphabetically.
		
		   This happens because Java's String.compareTo() is case-sensitive, and uppercase letters come before lowercase letters in Unicode (and ASCII) order.
		 */
		
		List<RelianceEmp> resultlist =inputlist.stream().distinct().collect(Collectors.toList());
		Collections.sort(resultlist, new EmployeenameComparator());
		
		resultlist.forEach(System.out::println);
		
		// remember below syntax
		
		RelianceEmp[] reliancelist = new RelianceEmp[] {new RelianceEmp("egg", 4), new RelianceEmp("banana", 1),
				new RelianceEmp("frog", 5), new RelianceEmp("dates", 3),new RelianceEmp("apple", 0)
				};
		
	//	List<RelianceEmp> newlist = new ArrayList<>(reliancelist); // ❌ Compile error

		// ❌ Because ArrayList(Collection<? extends E>) requires a Collection, and reliancelist is an array, not a Collection.
		
	//	List<RelianceEmp> newlist = Arrays.stream(reliancelist).collect(Collectors.toCollection(ArrayList::new));
		
	//	List<RelianceEmp> newlist = Stream.of(reliancelist).collect(Collectors.toCollection(ArrayList:: new));
		
	//	List<RelianceEmp> newlist = Arrays.asList(reliancelist);
		
	//	List<RelianceEmp> newlist =  List.of(reliancelist);
		
		
		// old school way : manual loop
		
		List<RelianceEmp> newlist = new ArrayList<>();
		for (RelianceEmp emp : reliancelist) {
		    newlist.add(emp);
		}

		
		List<RelianceEmp> resultolist = newlist.stream().distinct().collect(Collectors.toList());
		Collections.sort(resultolist, new EmployeenameComparator());
		
		resultolist.forEach(System.out::println);
		
	}
}
