package interview;

import java.util.*;
public class StackExample {

    // Main Method
    public static void main(String args[])
    {
        Stack<String> stack = new Stack<String>();
        stack.push("Geeks");
        stack.push("For");
        stack.push("Geeks");
        stack.push("Geeks");

        // Iterator for the stack
        Iterator<String> itr = stack.iterator();

        // Printing the stack
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }

        System.out.println();

        stack.pop();

        // Iterator for the stack
        itr = stack.iterator();

        // Printing the stack
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        
        
     //   push() → conceptually “put on top”

     //   add() → conceptually “append to end”
        // Adds the element on top of the stack
        // Adds the element to the end of the list

        
        // Stack inherits from Vector, not from Deque, so it doesn’t have addFirst() or addLast() methods.
        // Those belong to Deque (like ArrayDeque or LinkedList).
        
    	Stack<String> stck = new Stack<>();
		stck.addLast("hy");
		stck.push("ne");
		stck.addFirst("di");
		stck.set(2, "sh");
		stck.add(" mo");
		stck.add("ort");
		stck.pop();
		for(String ss : stck) {
			System.out.println(ss);
		}
    }
}