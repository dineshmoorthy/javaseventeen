package interview;


import java.util.*;

/**
 * Enterprise-level example demonstrating advanced generics concepts in Java
 */
public class GenericEnterpriseDemoTwo {

    // Q1 & Q5: Generic Interface and Method
    public interface Consumer<T> {
        void consume(T parameter);
    }

    public static class IntegerConsumer implements Consumer<Integer> {
        @Override
        public void consume(Integer parameter) {
            System.out.println("[INFO] Consuming Integer: " + parameter);
        }
    }

    // Q6: Generic Utility with Type Inference
    public static class GenericUtil {
        public static <T> T echo(T value) {
            return value;
        }
    }

    // Q7 & Q8: Bounded Type Example
    public static abstract class Animal {
        abstract void makeNoise();
    }

    public static class Cat extends Animal implements Comparable<Cat> {
        private final String name;

        public Cat(String name) {
            this.name = name;
        }

        @Override
        void makeNoise() {
            System.out.println("Meow from " + name);
        }

        @Override
        public int compareTo(Cat other) {
            return this.name.compareTo(other.name);
        }
    }

    public static class Dog extends Animal {
        private final String name;

        public Dog(String name) {
            this.name = name;
        }

        @Override
        void makeNoise() {
            System.out.println("Woof from " + name);
        }
    }

    public static abstract class AnimalCage<T extends Animal & Comparable<T>> {
        protected List<T> animals = new ArrayList<>();

        public void addAnimal(T animal) {
            animals.add(animal);
        }

        public void makeAllNoises() {
            Collections.sort(animals);
            animals.forEach(Animal::makeNoise);
        }
    }

    public static class CatCage extends AnimalCage<Cat> {}

    // Q10: Upper Bounded Wildcard
    public static class AnimalFarm {
        private final List<Animal> animals = new ArrayList<>();

        public void addAnimals(Collection<? extends Animal> newAnimals) {
            animals.addAll(newAnimals);
        }

        public void makeAllNoises() {
            animals.forEach(Animal::makeNoise);
        }
    }

    // Q12: Lower Bounded Wildcard
    public static void addAnimalsToList(List<? super Animal> list) {
        list.add(new Cat("Shadow"));
        list.add(new Dog("Rover"));
    }

    // Q13: PECS Rule
    public static void demonstratePECS(List<? extends Animal> producers, List<? super Animal> consumers) {
        producers.forEach(Animal::makeNoise);
        consumers.add(new Dog("Barkley"));
    }

    public static void main(String[] args) {
        // Generic Interface and Method
        Consumer<Integer> intConsumer = new IntegerConsumer();
        intConsumer.consume(100);

        String echoed = GenericUtil.echo("Enterprise Level");
        System.out.println("[INFO] Echoed value: " + echoed);

        // Bounded Types
        CatCage cage = new CatCage();
        cage.addAnimal(new Cat("Tiger"));
        cage.addAnimal(new Cat("Luna"));
        cage.makeAllNoises();

        // Wildcards
        List<Cat> catList = Arrays.asList(new Cat("Kitty"), new Cat("Fluffy"));
        AnimalFarm farm = new AnimalFarm();
        farm.addAnimals(catList);
        farm.makeAllNoises();

        List<Object> superList = new ArrayList<>();
        addAnimalsToList(superList);

        // PECS
        demonstratePECS(catList, superList);
    }
}
