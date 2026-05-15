package javaeight;

import java.util.*;

class NewEmployee {
    String name;
    int age;

    NewEmployee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String toString() {
        return name + " (" + age + ")";
    }
}

public class ComparableLambda {
    public static void main(String[] args) {
        List<NewEmployee> list = Arrays.asList(
        	new NewEmployee("Arnold", 35),
            new NewEmployee("Alice", 30),
            new NewEmployee("Bob", 25),
            new NewEmployee("Charlie", 35)
        );
        
        // Using comparator + lambda
        list.sort(Comparator.comparing(e -> e.age)); 

        System.out.println(list); // Output: [Bob (25), Alice (30), Charlie (35)]
        
        // Using comparator + Method reference
        list.sort(Comparator.comparingInt(NewEmployee::getAge)); 

        System.out.println(list);
     // way3 using lambda + compare or compareTo method

        list.sort((a, b) -> Integer.compare(a.getAge(),b.getAge()));
        
        System.out.println(list);
        
        
        Collections.sort(list, new Comparator<NewEmployee>() {

			@Override
			public int compare(NewEmployee o1, NewEmployee o2) {
				// TODO Auto-generated method stub
				return Integer.compare(o1.getAge(),o2.getAge());
			}
        	
		});
        
        System.out.println(list);
    }
}
