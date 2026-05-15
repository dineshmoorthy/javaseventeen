package javaseventeen;

import java.util.HexFormat;
import java.util.List;
import java.util.Random;
import java.util.random.RandomGenerator;

public class JavaSevenTeen {

	public static void main(String[] args) {
		
		// Java 8 style:
		String obj = new String("Hello");
		if (obj instanceof String) {
		    String s = (String) obj;
		    System.out.println(s.length());
		}
		
		
		// Java 17
		
		if (obj instanceof String s) {
		    System.out.println(s.length());
		}


		// New methods in Integer, Long:
		// below methods are converting numbers to hexa string
		// way 1 : wrapper class of numbers has tohexString method
		// way 2: hexaformat.formathex()
		int value = 255;
		String hex = Integer.toHexString(value);     // ff
		System.out.println(hex.toUpperCase());       // FF

		
		// Java 17
		HexFormat hexFormat = HexFormat.of();
		byte[] data = {10, 20, 30, 40};
		String hexString = hexFormat.formatHex(data);
		System.out.println(hexString); // 0a141e28

		// (2) Pattern Matching for instanceof
			Object  objt = "Hello Java 17";
			var tryobj = "Hello var welcome";
		if (obj instanceof String s) {  // pattern matching
		    System.out.println("pattern matching:"+s.toUpperCase()); // no need to cast
		}


//		👉 Cleaner than pre-Java 16, where you had to do an explicit cast after instanceof.
		
		
		// 3. Switch Expressions (Previewed earlier, stable in 17)
		String day = "MONDAY";

		String type = switch (day) {
		    case "SATURDAY", "SUNDAY" -> "Weekend";
		    case "MONDAY" -> "Start of Week";
		    default -> "Weekday";
		};

		System.out.println(type);
		
		
		
		String ss = switch (day) {
		 	case "SATURDAY", "SUNDAY" -> "Weekend";
		    case "MONDAY"  -> {
		        System.out.println("It's Monday");
		        yield "monday value"; // yield returns value from block
		    }
		    default -> "Weekday";
		};

		System.out.println(ss);

		// old switch
		
		String days = "di";
		String sss;

		switch (day) {
		    case "di":
		    case "ne":
		        sss = "sh";
		        break;
		    case "mo":
		        sss = "";
		        break;
		    default:
		        sss = "hello";
		        break;
		}

		System.out.println(sss);

		
		
		String result = switch ("A") {
		case "A" -> "Apple";
		case "B" -> "Banana";
		default -> "Unknown";
		};

		System.out.println(result);  // Apple

		String grade = "B";

		String message = switch (grade) {
		    case "A" -> "Excellent";
		    case "B" -> {
		        System.out.println("Processing grade B...");
		        // you can have many statements here
		        yield "Good"; // <-- this is what will be returned from switch
		    }
		    case "C" -> "Average";
		    default -> "Invalid";
		};

		System.out.println("yield scenario: "+message);

	

		//  4. Records (Data Classes)
		record Person(String name, int age) {}

		Person p = new Person("Bob", 30);
		System.out.println("record class name : "+ p.name()); // Bob
		System.out.println("record class: "+p);        // Person[name=Bob, age=30]


		
	//	👉 Records automatically give you constructor, getters, toString, equals, and hashCode.
	
		//  5. Enhanced Pseudo-Random Number Generators
		RandomGenerator random = RandomGenerator.of("L64X128MixRandom");
		System.out.println(random.nextInt(100)); // random number 0–99
		
		// old way
		Random rand = new Random();
		int ra = rand.nextInt();
		// old way 2
		int rd=  (int) (Math.random() * 101);
		

		
	//	6. Helpful NullPointerExceptions

	//	In Java 17, NullPointerException tells you which variable was null:

		String s = null;
		System.out.println(s.toLowerCase());


	//	Output in Java 17+:

	//	Exception in thread "main" java.lang.NullPointerException: 
	//	Cannot invoke "String.toLowerCase()" because "s" is null
		
		
	}
		//	Java 17 switch can now return a value directly.

		//	It supports arrow syntax, multiple labels, and yield for complex cases.

		//	It’s safer, cleaner, and eliminates fall-through bugs.
	
	// Pattern Matching in switch:
	// remember below syntax
	String test(Object obj) {
	    return switch (obj) {
	        case Integer i -> "It's an Integer: " + i;
	        case String s -> "It's a String: " + s;
	        default -> "Unknown type";
	    };
	}
	
	//Text Blocks (""" from Java 15)
	String json = """
		    {
		        "name": "Java",
		        "version": 17
		    }
		    """;
		//System.out.println(json);
	
	// 1. Sealed Classes

	// Restrict which classes can extend/implement a type.

	sealed interface Shape permits Circle, Rectangle {}

	final class Circle implements Shape {}
	final class Rectangle implements Shape {}

	
	//🔹 yield (inside switch expressions)
	//🔹 sealed (for controlled inheritance)
	
	sealed class Animal permits Dog, Cat {}

	final class Dog extends Animal {}
	non-sealed class Cat extends Animal {}

/*	
	| Modifier     | Meaning                                                   |
	| ------------ | --------------------------------------------------------- |
	| `sealed`     | restricts inheritance — only permitted subclasses allowed |
	| `non-sealed` | removes restriction — can be extended freely              |
	| `final`      | completely closed — no subclassing                        |
	
	
	
	| Feature      | Purpose                             | Example                                               |
| ------------ | ----------------------------------- | ----------------------------------------------------- |
| `yield`      | return value from switch case block | `yield "Good";`                                       |
| `sealed`     | restrict inheritance                | `sealed interface Shape permits Circle, Rectangle {}` |
| `non-sealed` | allow open inheritance              | `non-sealed class Cat extends Animal {}`              |
| `final`      | stop inheritance entirely           | `final class Dog extends Animal {}`                   |

| Keyword  | Used in                        | Meaning                         |
| -------- | ------------------------------ | ------------------------------- |
| `return` | inside a **method**            | return value from the method    |
| `yield`  | inside a **switch case block** | return value from that **case** |


*/
}
