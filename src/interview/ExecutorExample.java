package interview;

import java.util.Optional;
import java.util.concurrent.*;

public class ExecutorExample {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        Callable<String> task = () -> {
            Thread.sleep(1000);
            return "Data from background task";
        };

        Future<String> future = executor.submit(task);

        System.out.println("Waiting for result...");
        String result = future.get(); // blocking
        System.out.println("Result: " + result);

        executor.shutdown();
    }
  
    
}
