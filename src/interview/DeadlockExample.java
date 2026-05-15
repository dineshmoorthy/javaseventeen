package interview;

public class DeadlockExample {
	private static final Object lock1 = new Object();
	private static final Object lock2 = new Object();

	public static void main(String[] args) {
		// Thread 1 tries lock1 then lock2
		// remember below syntax
		Thread t1 = new Thread(() -> {
			synchronized (lock1) {
				System.out.println("Thread 1: Holding lock1...");

				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
				}

				System.out.println("Thread 1: Waiting for lock2...");
				
				// remember synchronized block is inside another synchronized block
				synchronized (lock2) {
					System.out.println("Thread 1: Acquired lock2!");
				}
			}
		});

		// Thread 2 tries lock2 then lock1
		Thread t2 = new Thread(() -> {
			synchronized (lock2) {
				System.out.println("Thread 2: Holding lock2...");

				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
				}

				System.out.println("Thread 2: Waiting for lock1...");
				synchronized (lock1) {
					System.out.println("Thread 2: Acquired lock1!");
				}
			}
		});

		t1.start();
		t2.start();
	}
}
