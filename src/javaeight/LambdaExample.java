package javaeight;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

@FunctionalInterface
interface Calculator {
    int operation(int a, int b);
}

public class LambdaExample {
    public static void main(String[] args) {
    	
    	// Simple Lambda Examples
        Runnable r = () -> System.out.println("Hello from Lambda!");
        r.run();
        
        Calculator add = (a, b) -> a + b;
        Calculator multiply = (a, b) -> a * b;

     //   System.out.println(add.operation(10, 20));      // 30
     //   System.out.println(multiply.operation(10, 20)); // 200
        
        
        Supplier<String> supplier = () -> "Hello from Supplier!";
      //  System.out.println(supplier.get()); // Output: Hello from Supplier!
        
        Supplier<Integer> randomSupplier = () -> new Random().nextInt(100);
   //     System.out.println("Random Number: " + randomSupplier.get());
        
   //     Consumer<String> printer = message -> System.out.println("Message: " + message);
   //     printer.accept("Hello Consumer!");
        
        
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        Consumer<String> printName = name -> System.out.println("Hi " + name);
        names.forEach(printName);
        
        
        Predicate<String> isEmpty = str -> str.isEmpty();
        System.out.println(isEmpty.test(""));     // true
        System.out.println(isEmpty.test("Java")); // false
        
        
        
        Predicate<String> startsWithA = s -> s.startsWith("a");
        Predicate<String> lengthGreaterThan3 = s -> s.length() > 3;
        Predicate<String> combined = startsWithA.and(lengthGreaterThan3);
        System.out.println(combined.test("apple")); // true
        System.out.println(combined.test("an"));    // false
        
        
        UnaryOperator<String> toUpper = str -> str.toUpperCase();
        System.out.println(toUpper.apply("java")); // Output: JAVA
        
        UnaryOperator<Double> addTax = price -> price + price * 0.15;
        System.out.println(addTax.apply(100.0)); // Output: 115.0
        
        
        BinaryOperator<Integer> maxOperator = Integer::max;
        System.out.println(maxOperator.apply(10, 20)); // Output: 20

        
        BinaryOperator<String> joiner = (a, b) -> a + "-" + b;
        System.out.println(joiner.apply("Hello", "World")); // Output: Hello-World
        
        
        List<Integer> numbers = Arrays.asList(5, 10, 15, 20);
        BinaryOperator<Integer> sum = Integer::sum;
        Integer total = numbers.stream().reduce(0, sum);
        System.out.println("Total: " + total); // Output: Total: 50
        
        
        
        List<String> nameso = Arrays.asList("Alex", "Bob", "Christopher", "Daniel");

        BinaryOperator<String> longest = (s1, s2) ->
            s1.length() >= s2.length() ? s1 : s2;

        String result = nameso.stream().reduce("", longest);
        System.out.println("Longest Name: " + result); // Output: Christopher
        
        
        LocalDate today = LocalDate.now();
        LocalDate nextWeek = today.plusWeeks(1);

        Function<String, Integer> strLength = s -> s.length();
        System.out.println(strLength.apply("Hello")); // 5
        
        // conversion
        Function<Double, Double> fahrenheitToCelsius = f -> (f - 32) * 5 / 9;
        System.out.println(fahrenheitToCelsius.apply(98.6)); // Output: 37.0
        
        
        // Binaryooperator using reduce
        List<Integer> nums = Arrays.asList(4, 17, 9, 22, 6);

        BinaryOperator<Integer> maxOp = BinaryOperator.maxBy(Comparator.naturalOrder());

        Integer max = nums.stream().reduce(maxOp).get();

        System.out.println("Max: " + max); // Output: 22
  
    }
}
