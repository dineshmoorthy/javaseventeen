package linkedlist;

import java.util.LinkedList;

class Student {
    String name;
    int age;
    Student(String n, int a) { name = n; age = a; }
    public String toString() { return name + " (" + age + ")"; }
}

public class LinkedListObjectExample {
    public static void main(String[] args) {
        LinkedList<Student> students = new LinkedList<>();
        students.add(new Student("Alice", 20));
        students.add(new Student("Bob", 22));
        students.addFirst(new Student("Charlie", 21));

        students.forEach(System.out::println);
    }
}
