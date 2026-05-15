package interview;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class CollectionExample {

	public static void main(String[] args) {
		
		  // Creating an ArrayList of Integer type
        ArrayList<Integer> arrli
            = new ArrayList<Integer>();

        // Appending the new elements
        // at the end of the list
        // using add () method via for loops
        for (int i = 1; i <= 5; i++)
            arrli.add(i);

        // Printing the ArrayList
        System.out.println(arrli);

        // Removing an element at index 3 
        // from the ArrayList
        // using remove() method 
        arrli.remove(3);

        // Printing the ArrayList after
        // removing the element
        System.out.println("removed: "+arrli);
        
        
        
        List<String> stringlist = new ArrayList<String>();
        
        stringlist.add("Apple");
        stringlist.add("Banana");
        stringlist.add("Grapes");
        stringlist.add("Pomegranate");
        stringlist.add(2, null);
        stringlist.add(stringlist.size(), null);
        
        System.out.println("output: "+ stringlist);
        
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();

        map.put("First", 10);
        map.put("Second", 20);
        map.put("Third", 30);
        map.put("Fourth", 40);

        Iterator<String> iterator = map.keySet().iterator();

        while (iterator.hasNext()) {
            String key = iterator.next();
            map.put("Fifth", 50);
        }
        
        

        Iterator<String> iterator2 = map.keySet().iterator();

        while (iterator2.hasNext()) {
            String key = iterator2.next();
            if (key.equals("Second")) {
            	map.remove(key);
            }
        }
        
        System.out.println("Iterator: "+ map);
        
        
        Iterator<String> iterator3 = stringlist.iterator();

        while (iterator3.hasNext()) {
            String key = iterator3.next();
            if ("Grapes".equals(key)) {
            	stringlist.remove(key);
            }
        }
        
        System.out.println("Arraylist: "+ stringlist);
        
        
    }
}
