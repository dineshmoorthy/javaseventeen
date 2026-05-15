package javaeight;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorserivceExample {
    public static void main(String[] args) throws Exception {
       Callable<String> task = () -> {
            Thread.sleep(1000);
            return "Task Result";
        };

        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<String> future = executor.submit(task);

        System.out.println("Waiting...");
        String result = future.get(); // blocks until done
        System.out.println("Result: " + result);

        executor.shutdown();
     
        
    }

	
}
