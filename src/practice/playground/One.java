package practice.playground;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import accolite.Employee;

public class One {

	private static final Object object1 = new Object();
	private static final Object object2 = new Object();

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		List<String> stringlist = Arrays.asList( "bad", "boy", "i", "am", "a");
		 

		List<List<Employee>> employees = Arrays.asList(Arrays.asList(new Employee(103, "Charlie", "HR", 60000),
				new Employee(104, "David", "IT", 72000), new Employee(101, "Alice", "HR", 55000),
				new Employee(105, "Eve", "Finance", 50000), new Employee(102, "Marley", "Electricity", 75000),
				new Employee(106, "Sumitha", "Developement", 75000), new Employee(109, "Kabilan", "Scrum", 70),
				new Employee(110, "Michael", "IT", 5000), new Employee(107, "godfrey", "Management", 600),
				new Employee(108, "Dinesh`", "Software", 5000), new Employee(108, "Natasha`", "Admin", 500),
				new Employee(108, "Josh`", "Management", 500), new Employee(108, "Neille`", "Developer", 500),
				new Employee(108, "Natasha`", "Software", 500)));

		/*
		 * Set<String> resultSet = new HashSet<>();
		 * employees.stream().flatMap(List::stream).filter(s -> s.getSalary() > 1000)
		 * .anyMatch(f -> !resultSet.add(f.getEmployeeName()));
		 * 
		 * 
		 * 
		 * Set<String> resultSet = new HashSet<>(); employees.stream().flatMap(list ->
		 * list.stream()).filter(s -> s.getSalary() > 1000) .anyMatch(Predicate.not(f ->
		 * resultSet.add(f.getEmployeeName())));
		 * 
		 * for (String ss : resultSet) { System.out.println("result: " + ss); }
		 * 
		 */

		/*
		 * List<Employee> newinputs = Arrays.asList(new Employee(103, "Charlie", "HR",
		 * 60000), new Employee(104, "David", "IT", 72000), new Employee(101, "Alice",
		 * "HR", 55000), new Employee(105, "Eve", "Finance", 50000));
		 * 
		 * justPrint(newinputs, "actuallist"); newinputs.set(1, new Employee(106,
		 * "Adam", "Finance", 50000)); newinputs.set(2, new Employee(107, "Apple",
		 * "Finance", 50000));
		 * 
		 * justPrint(newinputs, "newlist");
		 * 
		 * 
		 * // second max number print
		 * 
		 * FunctionalInterfaceExample exmp = (m) ->
		 * System.out.println("what is ohmygod"+m);
		 * 
		 * exmp.fate(": game of life");
		 * 
		 * Stream<String> snamelist = Stream.of("Alice", "Bob", "Daniel",
		 * "Charlie","Elizabeth","Austin");
		 * 
		 * snamelist.sorted().forEach(System.out::println);;
		 * 
		 * 
		 * String str = "Java is a java of alice who is working with bob";
		 * 
		 * String[] strarray = str.toLowerCase().split("\\s+");
		 * 
		 * 
		 * justPrintString(strarray);
		 * 
		 * List<String> some = Arrays.asList(strarray); String finalresult =
		 * some.stream().collect(Collectors.joining(", "));
		 * 
		 * System.out.println("final Result: "+finalresult);
		 * 
		 * 
		 * 
		 * System.out.println("Listinput: "+listinputs);
		 * 
		 * String rest = listinputs.stream().collect(Collectors.joining(", "));
		 * 
		 * System.out.println("Result: "+rest);
		 

		// Reverse a String	

		Scanner scan = new Scanner(System.in);
		String inputs = scan.nextLine();
		
		char[] ch = inputs.toCharArray();
		StringBuilder sb = new StringBuilder();
		
		
		for (int i = ch.length-1; i>= 0; i--) {
			sb.append(ch[i]);
		}
		
		System.out.println("Reverse: "+sb);
		*/
		
		stringlist.sort((a,b) -> a.compareTo(b));
		
		
		List<String> namelistu = Arrays.asList("Alice", "Bob", "Daniel", "Charlie", "Elizabeth", "Austin", "Bob");

		Map<String, Long> map = stringlist.stream().sorted().collect(Collectors.groupingBy(s -> s, Collectors.counting()));
		
		
		System.out.println("** "+map);
	
		Map<Integer, List<String>> map2 = namelistu.stream().sorted().collect(Collectors.groupingBy(String::length));
		
		System.out.println(map2);
		
		Map<Integer, Long> map3 = namelistu.stream().sorted().collect(Collectors.groupingBy(String::length,Collectors.counting()));
		
		System.out.println(map3);
		
		Long varLong = 999999999999L;
		
		String what = Long.toString(varLong);
		
		System.out.println(what);
		
		
		
		ExecutorService exe = Executors.newCachedThreadPool();
		
		Callable<String> call = () -> {
			return "Hello";
		};
		
		
		Future<String> fut = exe.submit(call);
		
		String result = null;
		try {
			result = fut.get();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Output:"+result);
		
		Supplier<String> sup  = new sup();
		
		Function<String, String> funct = s -> (s.length() / 2 == 0) ? "Even" : "odd";

		CompletableFuture<String> comfut = CompletableFuture.supplyAsync(sup);
		
		CompletableFuture<String> ret = comfut.thenApply(funct);
		
		System.out.println("Result: "+ret.get());
		
	}

	public static void justPrintString(String[] listname) {
		for (String strarray : listname)
			System.out.println("Result: " + strarray);

	}

	public static void justPrint(List<Employee> just, String listname) {
		for (Employee ss : just) {
			System.out.println(listname + " : " + ss);
		}
	}
}

class sup implements Supplier<String>{

	@Override
	public String get() {
		// TODO Auto-generated method stub
		return "China";
	}
	
}