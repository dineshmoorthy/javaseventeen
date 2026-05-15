package javaeight;

import java.util.*;

public class ComplexLambda {
    public static void main(String[] args) {
        List<Employ> employees = Arrays.asList(
            new Employ("John", 30, 5000),
            new Employ("Alice", 25, 7000),
            new Employ("Bob", 30, 4000)
        );

        // Sort by age, then salary (descending)
        employees.sort((e1, e2) -> {
            if (e1.age != e2.age) {
                return Integer.compare(e1.age, e2.age);
            } else {
                return Double.compare(e2.salary, e1.salary); // descending salary
            }
        });

        employees.forEach(System.out::println);
    }
}

class Employ {
    String name;
    int age;
    double salary;

    Employ(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String toString() {
        return name + " - Age: " + age + ", Salary: " + salary;
    }
}
