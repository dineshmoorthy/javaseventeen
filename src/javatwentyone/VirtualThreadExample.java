package javatwentyone;

import java.util.concurrent.*;

public class VirtualThreadExample {
    public static void main(String[] args) throws Exception {
        try (ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor()) {
            for (int i = 1; i <= 5; i++) {
                int id = i;
                executor.submit(() -> {
                    System.out.println("Running task " + id + " on " + Thread.currentThread());
                    Thread.sleep(1000);
                    return id;
                });
            }
        } // automatically waits for tasks to finish
    }
}
