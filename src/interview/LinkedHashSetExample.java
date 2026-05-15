package interview;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;



public class LinkedHashSetExample {
	// Java program to demonstrate difference between
	// HashSet, LinkedHashSet and TreeSet according 
	// to insertion order and insertion time

	    // Function show insertion order of
	    // LinkedHashSet, TreeSet and HashSet

	    private static void insertionOrder()
	    {
	        LinkedHashSet<String> geekLinkSet  = new LinkedHashSet<>();
	        TreeSet<String> geekTreeSet = new TreeSet<>();
	        HashSet<String> geekHashSet = new HashSet<String>();

	        // Add three object in
	        // LinkedHashSet and TreeSet
	        for (String str : Arrays.asList("Geek2", "Geek1",
	                                        "Geek3", "Geek1")) {

	            geekLinkSet.add(str);
	            geekTreeSet.add(str);
	            geekHashSet.add(str);
	        }

	        // should be sorted order HashSet
	        // stores element in sorted order
	        System.out.println("Insertion Order"
	                           + " of objects in HashSet :"
	                           + geekHashSet);

	        // insertion order or elements LinkedHashSet
	        // stores elements as insertion
	        System.out.println("Insertion Order of "
	                           + "objects in LinkedHashSet :"
	                           + geekLinkSet);

	        // should be sorted order TreeSet
	        // stores element in sorted order
	        System.out.println("Insertion Order of"
	                           + " objects in TreeSet :"
	                           + geekTreeSet);
	    }

	    // Function calculate insertion time of
	    // 1000 objects of LinkedHashSet,
	    // TreeSet and HashSet

	    private static void insertionTime()
	    {
	        // HashSet performance Test
	        // inserting 1000 elements
	        HashSet<Integer> numbersHS = new HashSet<>();
	        long startTime = System.nanoTime();
	        for (int i = 0; i < 1000; i++) {
	            numbersHS.add(i);
	        }
	        long endTime = System.nanoTime();
	        System.out.println("Total time to insert"
	                           + " 1000 elements in"
	                           + " HashSet in nanoseconds: "
	                           + (endTime - startTime));

	        // LinkedHashSet performance Test
	        // inserting 1000 elements
	        LinkedHashSet<Integer> numbersLLS
	            = new LinkedHashSet<>();

	        startTime = System.nanoTime();
	        for (int i = 0; i < 1000; i++) {
	            numbersLLS.add(i);
	        }
	        endTime = System.nanoTime();
	        System.out.println("Total time to insert"
	                           + " 1000 elements in"
	                           + " LinkedHashSet nanoseconds: "
	                           + (endTime - startTime));

	        // TreeSet performance Test inserting 1000 objects
	        TreeSet<Integer> numbersTS = new TreeSet<>();

	        startTime = System.nanoTime();
	        for (int i = 0; i < 1000; i++) {
	            numbersTS.add(i);
	        }
	        endTime = System.nanoTime();
	        System.out.println("Total time to insert"
	                           + " 1000 elements in"
	                           + " TreeSet in nanoseconds: "
	                           + (endTime - startTime));
	    }

	    // Function calculate deletion time
	    // of 1000 objects LinkedHashSet,
	    // TreeSet and HashSet
	    // Deletion time always vary
	    private static void deletion()
	    {
	        // HashSet performance Test inserting
	        // and deletion 1000 elements
	        HashSet<Integer> deletionHS = new HashSet<>();

	        for (int i = 0; i < 1000; i++) {
	            deletionHS.add(i);
	        }

	        long startingTime = System.nanoTime();
	        for (int i = 0; i < 1000; i++) {
	            deletionHS.remove(i);
	        }

	        long endedTime = System.nanoTime();
	        System.out.println(
	            "Total time to Deletion "
	            + "1000 elements in HashSet in nanoseconds: "
	            + Math.abs(startingTime - endedTime));

	        // LinkedHashSet  performance Test inserting
	        // and deletion 1000 elements
	        LinkedHashSet<Integer> deletionLLS
	            = new LinkedHashSet<>();

	        for (int i = 0; i < 1000; i++) {
	            deletionLLS.add(i);
	        }
	        startingTime = System.nanoTime();
	        for (int i = 0; i < 1000; i++) {
	            deletionLLS.remove(i);
	        }

	        endedTime = System.nanoTime();
	        System.out.println(
	            "Total time to Deletion 1000"
	            + " elements in LinkedHashSet in nanoseconds: "
	            + Math.abs(startingTime - endedTime));

	        // TreeSet performance Test inserting
	        // and deletion 1000 elements
	        TreeSet<Integer> deletionTS = new TreeSet<>();

	        for (int i = 0; i < 1000; i++) {
	            deletionTS.add(i);
	        }

	        startingTime = System.nanoTime();
	        for (int i = 0; i < 1000; i++) {
	            deletionTS.remove(i);
	        }

	        endedTime = System.nanoTime();
	        System.out.println(
	            "Total time to Deletion 1000"
	            + " elements in TreeSet in nanoseconds: "
	            + Math.abs(startingTime - endedTime));
	    }

	    public static void main(String args[])
	    {

	        insertionOrder();
	        insertionTime();
	        deletion();
	    }
	}

/*
 * 
 * Similarities Between HashSet, LinkedHashSet, and TreeSet:

Duplicates: HashSet, LinkedHashSet and TreeSet are implements Set interface, so they are not allowed to store duplicates objects.
 
Thread-safe: If we want to use HashSet, LinkedHashSet, and TreeSet in a multi-threading environment then first we make it externally synchronized because both LinkedHashSet and TreeSet are not thread-safe. 
 
All three are Cloneable and Serializable.
When to use HashSet, TreeSet, and LinkedHashSet in Java: 

HashSet: If you don’t want to maintain insertion order but want to store unique objects. 
LinkedHashSet: If you want to maintain the insertion order of elements then you can use LinkedHashSet. 
TreeSet: If you want to sort the elements according to some Comparator then use TreeSet.
So as you see the output of the above program according to that and according to your requirements, you can choose anyone from HashSet, TreeSet, and LinkedHashSet.
 */
