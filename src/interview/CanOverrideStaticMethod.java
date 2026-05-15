package interview;

class Parent {
	static void greet() {
		System.out.println("Hello from Parent");
	}
}

class Child extends Parent {
	static void greet() {
		System.out.println("Hello from Child");
	}
}

public class CanOverrideStaticMethod {
	public static void main(String[] args) {
		Parent p = new Child();
		p.greet(); // Prints: Hello from Parent ❌ NOT overridden

		A obj = new B();
		obj.test(); // Output: A ❌ (not B)

	}
}

class A {
	static void test() {
		System.out.println("A");
	}
}

class B extends A {
	static void test() {
		System.out.println("B");
	}
}

// question here is can you override static method in parent class

// you are allowed to override, but it will not override


// Can we override static methods?
// ❌ No, static methods cannot be overridden. They belong to the class, not the instance.
// They can be hidden (method hiding), but not overridden in the true sense.