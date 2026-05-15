package interview;

import java.util.Comparator;

public class EmployeeComparators {
    public static final Comparator<Employee> BY_LAST_NAME =
        Comparator.comparing(Employee::getLastName);

    public static final Comparator<Employee> BY_FIRST_NAME =
        Comparator.comparing(Employee::getFirstName);

    public static final Comparator<Employee> BY_DEPARTMENT =
        Comparator.comparing(Employee::getDepartment);

    public static final Comparator<Employee> BY_SALARY_DESC =
        Comparator.comparingDouble(Employee::getSalary).reversed();
    
}
