package interview;

import java.util.*;

public class SyncVsNonSync {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();   // Non-synchronized
        Map<Integer, String> hashtable = new Hashtable<>(); // Synchronized

        // Multiple threads modifying HashMap (unsafe)
        Runnable task1 = () -> {
            for (int i = 0; i < 5; i++) {
                hashMap.put(i, "Thread1-" + i);
            }
        };

        // Multiple threads modifying Hashtable (safe)
        Runnable task2 = () -> {
            for (int i = 0; i < 5; i++) {
                hashtable.put(i, "Thread2-" + i);
            }
        };

        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task1);
        Thread t3 = new Thread(task2);
        Thread t4 = new Thread(task2);

        t1.start(); t2.start(); t3.start(); t4.start();
        
        /*
         4. Modern Best Practice

Instead of using old Hashtable or Vector, modern Java uses:

ConcurrentHashMap (better performance than Hashtable).

CopyOnWriteArrayList (thread-safe alternative to ArrayList).

Collections.synchronizedList(new ArrayList<>()) for wrapping.
         */
    }
}
