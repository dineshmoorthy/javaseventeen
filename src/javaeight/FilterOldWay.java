package javaeight;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FilterOldWay {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "banana", "avocado", "blueberry");
        List<String> result = new ArrayList<>();

        for (String fruit : fruits) {
            if (fruit.startsWith("a")) {
                result.add(fruit);
            }
        }

        System.out.println(result); // Output: [apple, avocado]
        
        
        // FilterWithLambda 
        List<String> fruitsllist = Arrays.asList("apple", "banana", "avocado", "blueberry");

        List<String> resultwhat = fruitsllist.stream()
                                    .filter(fruit -> fruit.startsWith("a"))
                                    .collect(Collectors.toList());

        System.out.println(resultwhat); // Output: [apple, avocado]
        
        // FilterWithPredicate 
        
        Predicate<String> startsWithA = s -> s.startsWith("a");

        List<String> resultpredicate = fruits.stream()
                                    .filter(startsWithA)
                                    .collect(Collectors.toList());

        System.out.println(resultpredicate); // Output: [apple, avocado]
        
        
        // FilterWithPredicateMethod 
        List<String> fruitswithpredicate = Arrays.asList("apple", "banana", "avocado", "blueberry");

        List<String> resultwithpredicate = filter(fruits, s -> s.startsWith("a"));

        System.out.println(resultwithpredicate); // Output: [apple, avocado]
        
        // remove

        fruitswithpredicate.removeIf(fruit -> !fruit.startsWith("a"));

        System.out.println(fruitswithpredicate); // Output: [apple, avocado]
    }

    public static List<String> filter(List<String> list, Predicate<String> condition) {
        return list.stream()
                   .filter(condition)
                   .collect(Collectors.toList());
    }
}
