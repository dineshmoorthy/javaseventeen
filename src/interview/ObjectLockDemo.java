package interview;

class Example {
    public synchronized void display() {
        System.out.println(Thread.currentThread().getName() + " got the lock on object: " + this);
        try { Thread.sleep(1000); } catch (InterruptedException e) {}
        System.out.println(Thread.currentThread().getName() + " releasing lock: " + this);
    }
}

public class ObjectLockDemo {
    public static void main(String[] args) {
        Example obj1 = new Example();
        Example obj2 = new Example();

        // Two threads working on two different objects
        new Thread(() -> obj1.display(), "Thread-A").start();
        new Thread(() -> obj2.display(), "Thread-B").start();
        
        // Both threads run simultaneously because each instance (obj1 and obj2) has its own object lock.
    }
}
