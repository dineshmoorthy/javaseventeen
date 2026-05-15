package interview;

import java.util.*;

//Q1: Generic Interface
interface Consumer<T> {
 void consume(T parameter);
}

//Q1 continued: Concrete implementation for Integer
class IntegerConsumer implements Consumer<Integer> {
 public void consume(Integer parameter) {
     System.out.println("Consumed Integer: " + parameter);
 }
}

//Q5, Q6: Generic Method with Type Inference
class GenericUtils {
 public static <T> T returnType(T argument) {
     return argument;
 }
}

//Q7, Q8: Bounded and Multiple Bounded Types
abstract class WildAnimal {
 abstract void makeNoise();
}



class Cat extends WildAnimal implements Comparable<Cat> {
 String name;

 Cat(String name) {
     this.name = name;
 }

 @Override
 void makeNoise() {
     System.out.println("Meow from " + name);
 }

 @Override
 public int compareTo(Cat o) {
     return this.name.compareTo(o.name);
 }
}

abstract class Cage<T extends WildAnimal & Comparable<T>> {
 abstract void addWildAnimal(T WildAnimal);
}

//Q9, Q10, Q11, Q12, Q13: Wildcards and PECS
class Farm {
 private List<WildAnimal> WildAnimals = new ArrayList<>();

 public void addWildAnimals(Collection<? extends WildAnimal> newWildAnimals) {
     WildAnimals.addAll(newWildAnimals);
 }

 public void makeNoises() {
     WildAnimals.forEach(WildAnimal::makeNoise);
 }
}

class WildAnimalAdder {
 public static void addDogs(List<? super WildAnimal> list) {
     list.add(new StreetDog("Tommy"));
 }
}

class StreetDog extends WildAnimal {
 String name;

 StreetDog(String name) {
     this.name = name;
 }

 @Override
 void makeNoise() {
     System.out.println("Woof from " + name);
 }
}

//Demonstrating everything
public class GenericConceptsDemo {
 public static void main(String[] args) {
     // Q2: Generics with List
     List<String> stringList = new ArrayList<>();
     stringList.add("Hello Generics");
     String s = stringList.get(0); // No cast needed

     // Q3: Type Erasure - no way to get type T at runtime
     Consumer<Integer> consumer = new IntegerConsumer();
     consumer.consume(100);

     // Q4: Omitting Generic Types
     List rawList = new ArrayList(); // Compiles, but unsafe
     rawList.add(1);
     rawList.add("string"); // No compile error, runtime risk
     System.out.println("rawlist: "+rawList);
     
     
     
     // Q5, Q6: Generic method with type inference
     Integer intValue = GenericUtils.returnType(123);
     String strValue = GenericUtils.returnType("ABC");

     // Q7, Q8: Bounded Types and Multiple Bounds
     Cat cat1 = new Cat("Whiskers");
     cat1.makeNoise();

     // Q10: Upper bounded wildcard
     Farm farm = new Farm();
     List<Cat> cats = Arrays.asList(new Cat("Kitty"), new Cat("Fluffy"));
     farm.addWildAnimals(cats);
     farm.makeNoises();

     // Q12: Lower bounded wildcard
     List<Object> objects = new ArrayList<>();
     WildAnimalAdder.addDogs(objects);

     // Q13: PECS Rule
     makeLotsOfNoise(cats);
     addCats(objects);
 }

 // Q13: PECS Rule Example
 public static void makeLotsOfNoise(List<? extends WildAnimal> WildAnimals) {
     WildAnimals.forEach(WildAnimal::makeNoise);
 }

 public static void addCats(List<? super WildAnimal> WildAnimals) {
     WildAnimals.add(new Cat("Mittens"));
 }
}
