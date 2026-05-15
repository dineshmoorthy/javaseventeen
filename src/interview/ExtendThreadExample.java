package interview;

class MyThread extends Thread {
    public void run() {
        System.out.println("Running via Thread subclass: " + Thread.currentThread().getName());
    }
}

public class ExtendThreadExample {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start(); // start new thread
    }
}

