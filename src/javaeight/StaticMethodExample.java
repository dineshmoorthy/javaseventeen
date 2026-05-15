package javaeight;

import java.util.Arrays;
import java.util.List;


class Printer {
    void print(String msg) {
        System.out.println(msg.toUpperCase());
    }
}

class Animal {
    String name;
    Animal(String name) { this.name = name; }
    public String toString() { return "Animal: " + name; }
 
}


public class StaticMethodExample {
    public static int doubleIt(int n) {
        return n * 2;
    }

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3);
        
        // Using static method reference
        nums.stream()
            .map(StaticMethodExample::doubleIt) // instead of n -> Calculator.doubleIt(n)
            .forEach(System.out::println);

        Printer printer = new Printer();
        List<String> words = Arrays.asList("dog", "cat", "pig");

        // Using instance method reference
        words.forEach(printer::print); // instead of s -> printer.print(s)


        List<String> names = Arrays.asList("Dog", "Cat", "Horse");

        // Using constructor reference
        List<Animal> animals = names.stream()
                                    .map(Animal::new) // instead of name -> new Animal(name)
                                    .toList();

        animals.forEach(System.out::println);

    }
}
