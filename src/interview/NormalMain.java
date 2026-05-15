package interview;

import java.util.*;

public class NormalMain {
    public static void main(String[] args) {
        List<NormalStudent> list = new ArrayList<>();
        list.add(new NormalStudent(3, "Alice"));
        list.add(new NormalStudent(1, "Bob"));
        list.add(new NormalStudent(2, "Charlie"));

     // duplicates objects based on id
        list.add(new NormalStudent(2, "Charlie"));
        list.add(new NormalStudent(2, "rana"));
        Collections.sort(list); // Uses compareTo

        for (NormalStudent s : list) {
            System.out.println(s);
        }
    }
}
