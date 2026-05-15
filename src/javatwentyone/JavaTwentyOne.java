package javatwentyone;

import java.util.ArrayList;
import java.util.SequencedCollection;

// 1. Record Patterns (Finalized) 
record Person(String name, int age) {
}

record Address(String city, String country) {}
//record Person(String name, int age, Address address) {}


public class JavaTwentyOne {

	
	// remember below syntax
	// 2. Pattern Matching for switch (Finalized)
	static String format(Object obj) {
		return switch (obj) {
		case Integer i -> "Integer: " + i;
		// Guarded pattern (with when)
		// Adds an extra condition (a guard) to a case
		case String s when s.length() > 5 -> "Long String: " + s;
		case String s -> "Short String: " + s;
		// Before Java 17, a switch on a null value caused NullPointerException.
		// Now, you can handle it explicitly:
		case null -> "Null value";
		default -> "Unknown type";
		};
	}

	public static void main(String[] args) {
		
		
		System.out.println("REsult"+format("din"));
		/*
		
		// old way
		
		Object obj = new Person("Alice", 30);

		if (obj instanceof Person) {
		    Person p = (Person) obj;
		    System.out.println("Name: " + p.name());
		    System.out.println("Age: " + p.age());
		}

		
		// new way
		Object obj2 = new Person("Alice", 30);

		if (obj2 instanceof Person(String name, int age)) {
			System.out.println(name + " is " + age + " years old.");
		}
		 	*/
		
		
		/*
		 Object obj = new Person("Bob", 40, new Address("London", "UK"));

		if (obj instanceof Person(String name, int age, Address(String city, String country))) {
    		System.out.println(name + " lives in " + city + ", " + country);
		}

		 */
		
		// 3. Sequenced Collections
		 
		SequencedCollection<String> seq = new ArrayList<>();
		seq.addFirst("first");
		seq.addLast("last");

		System.out.println(seq.getFirst()); // first
		System.out.println(seq.getLast()); // last

		//  4. Virtual Threads (Final) 
		Runnable task = () -> {
		    System.out.println("Running on: " + Thread.currentThread());
		};

		Thread.startVirtualThread(task);

		// 5. Scoped Value
		// Preview feature - only works with --enable-preview
		ScopedValue<String> USER = ScopedValue.newInstance();

		ScopedValue.where(USER, "Alice").run(() -> {
		    System.out.println("Hello " + USER.get());
		});

		String name = "Alice";
		int age = 30;

		String message = STR."Name: \{name}, Age: \{age}";
		System.out.println(message); // Name: Alice, Age: 30
		
		// javac --enable-preview --release 21 MyApp.java
		//		java --enable-preview MyApp

/*
 | Feature                   | Purpose                           | Replaces / Improves    | Key Benefit                         |
| ------------------------- | --------------------------------- | ---------------------- | ----------------------------------- |
| **Sequenced Collections** | Unified order-aware collections   | Ad-hoc order handling  | First/Last access, consistent order |
| **Scoped Values**         | Immutable, safe per-thread values | ThreadLocal            | Context passing across threads      |
| **Virtual Threads**       | Lightweight concurrency           | Traditional OS threads | Millions of concurrent tasks        |

 */
		
		
	}

}
