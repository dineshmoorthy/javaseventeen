package interview;

import java.util.ArrayList;

public class GenericsExampleFive {

	public static void main(String[] args) {
		 // Creatinga an ArrayList without any type specified
        ArrayList al = new ArrayList();

        al.add("Sweta");
        al.add("Gudly");
        al.add(10); // Compiler allows this

        String s1 = (String)al.get(0);
        String s2 = (String)al.get(1);

        // Causes Runtime Exception
        String s3 = (String)al.get(2);
        
        
        // how generics solve this problem 
        
        ArrayList <String> al2 = new ArrayList<String> ();

        al2.add("Sweta");
        al2.add("Gudly");

        // Now Compiler doesn't allow this
        al2.add(10); 

        String s12 = (String)al2.get(0);
        String s22 = (String)al2.get(1);
        String s32 = (String)al2.get(2);
	}
}
