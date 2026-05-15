package interview;

import static interview.EmployeeComparators.*;
import java.util.ArrayList;
import java.util.List;

public class EnterpriseSortExample {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
            new Employee("Alice", "Smith", "HR", 70000),
            new Employee("Bob", "Smith", "IT", 90000),
            new Employee("Alice", "Jones", "IT", 85000),
            new Employee("Charlie", "Jones", "Finance", 88000)
        );

        List<Employee> sortedList = new ArrayList<>(employees);

        sortedList.sort(
            BY_LAST_NAME
                .thenComparing(BY_FIRST_NAME)
                .thenComparing(BY_SALARY_DESC)
        );

        sortedList.forEach(System.out::println);
    }
}
