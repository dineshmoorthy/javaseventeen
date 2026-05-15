package javaeight;

import java.util.*;

class Employee implements Comparable<Employee> {
    String name;
    int age;
    int empid;
    
    
    Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    Employee(int empid,String name){
        this.empid = empid;  
        this.name = name;
    }

    Employee(String name, int empid, int age){
        this.empid = empid;  
        this.name = name;
        this.age = age;
    }
    
    public String toString() {
        return name + " (" + age + ")";
    }
    
    /*
    public int compareTo(Employee other) {
        return Integer.compare(this.age, other.age);
    }
    
    */
    
    // Entha object compare panaporamo antha antha object than we do implements  Comparable<Employee> 
    
    @Override
    public int compareTo(Employee o) {

     if(this.age==o.age){
       return 0; 
     } 
     else if(this.age < o.age){
     return 1;
     }
     else{
       return -1;
     }
    }
}

public class ComparableDefault {
    public static void main(String[] args) {
        List<Employee> list = Arrays.asList(
            new Employee("Alice",  101,30),
            new Employee("Bob", 102, 25 ),
            new Employee("Charlie", 103, 35)
        );

        Collections.sort(list); // Uses compareTo()
        System.out.println(list); // Output: [Bob (25), Alice (30), Charlie (35)]
    }
}
