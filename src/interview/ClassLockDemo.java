package interview;

class Exsample {
	public static synchronized void displayStatic() {
		System.out.println(Thread.currentThread().getName() + " got the CLASS lock");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		System.out.println(Thread.currentThread().getName() + " releasing CLASS lock");
	}
}

public class ClassLockDemo {
	public static void main(String[] args) {
		Exsample obj1 = new Exsample();
		Exsample obj2 = new Exsample();

		new Thread(() -> obj1.displayStatic(), "Thread-A").start();
		new Thread(() -> obj2.displayStatic(), "Thread-B").start();

		// ✅ Even though two different objects are used (obj1, obj2),
		// only one thread runs at a time because they both share the same class-level
		// lock.

		/*
		 * Class Lock (Static Lock) 🔒 What it means:
		 * 
		 * Used when you synchronize a static method or a synchronized(ClassName.class)
		 * block.
		 * 
		 * It locks the Class object itself (one per class in JVM).
		 * 
		 * Only one thread can hold the class-level lock across all instances.
		 */
	}
}
