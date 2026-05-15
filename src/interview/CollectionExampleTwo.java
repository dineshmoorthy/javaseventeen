package interview;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class CollectionExampleTwo {

	public static void main(String[] args) {
		
		/*
		 * 1. CopyOnWriteArrayList — thread-safe list

Best when reads are frequent and writes are rare

Every write creates a new internal copy of the list
		 */
		
		
		CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();

        list.add("A");
        list.add("B");

        // Safe iteration even when modifying
        for (String item : list) {
            System.out.println(item);
            list.add("C");   // No ConcurrentModificationException
        }

        System.out.println("Final list: " + list);
		
		/*2. CopyOnWriteArraySet — thread-safe set

Internally backed by CopyOnWriteArrayList

No duplicates

Best for iteration-heavy, write-light use
		 * 
		 */
		CopyOnWriteArraySet<String> set = new CopyOnWriteArraySet<>();

        set.add("A");
        set.add("B");
        set.add("A"); // duplicate ignored

        for (String item : set) {
            System.out.println(item);
            set.add("C");  // Safe while iterating
        }

        System.out.println("Final set: " + set);
        
        
		
		/*
		 * 3. ConcurrentHashMap — thread-safe HashMap

Allows safe concurrent read/write

No locking of entire map—segments are locked

		 */
		ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();

        map.put("A", 1);
        map.put("B", 2);

        map.compute("A", (k, v) -> v + 10); // atomic update

        System.out.println(map);
        
		
		/*
		 * 4. ConcurrentSkipListMap — thread-safe sorted map

Like TreeMap but thread-safe

Maintains sorted ordering
		 */
		ConcurrentSkipListMap<Integer, String> map2 = new ConcurrentSkipListMap<>();

        map2.put(30, "C");
        map2.put(10, "A");
        map2.put(20, "B");

        System.out.println("Sorted map: " + map2);
        System.out.println("First key: " + map2.firstKey());
        
        
		
		/*
		 * 5. ConcurrentSkipListSet — thread-safe sorted set

Like TreeSet but thread-safe

Stores elements in ascending sorted order
		 */
		ConcurrentSkipListSet<Integer> set2 = new ConcurrentSkipListSet<>();

        set2.add(30);
        set2.add(10);
        set2.add(20);

        for (Integer value : set2) {
            System.out.println(value);  // printed in sorted order
        }
	}
}

/*
 | Collection                | Ordered?         | Thread-safe? | Best Use                 |
| ------------------------- | ---------------- | ------------ | ------------------------ |
| **CopyOnWriteArrayList**  | No               | Yes          | Many reads, few writes   |
| **CopyOnWriteArraySet**   | No               | Yes          | Set version of the above |
| **ConcurrentHashMap**     | No               | Yes          | Fast concurrent map      |
| **ConcurrentSkipListMap** | **Yes (sorted)** | Yes          | Sorted concurrent map    |
| **ConcurrentSkipListSet** | **Yes (sorted)** | Yes          | Sorted concurrent set    |

  
*/