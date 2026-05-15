package javaeight;

import java.util.concurrent.*;

public class AsyncExample {
    public static void main(String[] args) throws Exception {
    	// CompletableFuture --> supplyAsync, thenApply, thenCombine
    	// supplyAsync ( start) , thenApply ( middle), thenCombine ( end)
    	// in all three code syntax are different
    	
    	
    	CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
            return "Hello from async task!";
        });

        // Chain transformation
        CompletableFuture<String> transformed = future.thenApply(s -> s.toUpperCase());

        // Combine with another task
        CompletableFuture<String> combined = transformed.thenCombine(
            CompletableFuture.supplyAsync(() -> " + Another Task"),
            (s1, s2) -> s1 + s2
        );

        System.out.println(combined.get());
        
        
    	
    	
    	Runnable stri = () -> {
    		System.out.print("Hello");
    	};
    	
    	
    	stri.run();
    	
    	
    	
    	CompletableFuture<String> compfuture  =CompletableFuture.supplyAsync( () ->  {
            return "Hello from Din";
        });
    	
    	CompletableFuture<String> firstcf  = compfuture.thenApplyAsync(s ->  s+"esh!");
    	CompletableFuture<String> secondcf = firstcf.thenApplyAsync(s -> s.toUpperCase());
    	
    	CompletableFuture<String> thirdcf = secondcf.thenCombine(
    			CompletableFuture.supplyAsync(() -> " Dakshinamoorthy"), 
    			(s1, s2) -> s1+s2
    	);
    	
    	System.out.println(thirdcf.get());
    	
    }
}
