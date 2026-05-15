package interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class VarBasicExample {
    public static void main(String[] args) {
        // Before Java 10
        String name = "Alice";
        int age = 30;
     //   var can only be used for local variables (inside methods, loops, try-with-resources).

    //    Type is inferred from the right-hand side.

     //   You cannot use var without initialization (e.g., var x; ❌).
        // With var (Java 10+)
        var city = "London";   // inferred as String
        var count = 10;        // inferred as int
        var price = 25.5;      // inferred as double

        System.out.println(name + " from " + city + " is " + age + " years old, price: " + price);
        
     // Intermediate Example   
        // Without var
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");

        // With var
        var numbers = List.of(10, 20, 30, 40); // inferred as List<Integer>
        var set = new HashSet<>(Arrays.asList("A", "B", "C")); // inferred as HashSet<String>

        // Iteration with var
        for (var num : numbers) {
            System.out.println("Number: " + num);
        }

        // Using var in map
        var map = new HashMap<Integer, String>();
        map.put(1, "One");
        map.put(2, "Two");

        for (var entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
       // Advanced Example with Streams + Lambdas
        
        
        var employees = List.of(
                new Employeee(101, "Alice", "HR", 50000),
                new Employeee(102, "Bob", "IT", 70000),
                new Employeee(103, "Charlie", "Finance", 60000)
            );

            // Using var in streams
            var highEarners = employees.stream()
                .filter(e -> e.getSalary() > 60000)
                .collect(Collectors.toList());

            // Using var in lambda parameters (Java 11+)
            highEarners.forEach((var e) -> System.out.println(e.getName() + " earns " + e.getSalary()));
      
            
            /*
             * List	var list = new ArrayList<String>();
Set	var set = new HashSet<Integer>();
Map	var map = new HashMap<Integer, String>();
Iterating	for (var item : list) { ... }
Streams	var result = list.stream().filter(...).collect(Collectors.toList());
Lambda params (Java 11+)	list.forEach((var s) -> System.out.println(s));
             */
    }
}
class Employeee {
    private int id;
    private String name;
    private String department;
    private int salary;

    public Employeee(int id, String name, String department, int salary) {
        this.id = id; this.name = name; this.department = department; this.salary = salary;
    }
    public String getName() { return name; }
    public int getSalary() { return salary; }
}