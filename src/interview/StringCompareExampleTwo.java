package interview;

public class StringCompareExampleTwo {
// main method  
	public static void main(String[] args) {

		String str = null;

// null is invoking the compareTo method. Hence, the NullPointerException  
// will be raised  
		int no = str.compareTo("Geeks");

		System.out.println(no);
		
		
		
		/*
		    // Initializing Strings
        String str1 = "geeksforgeeks";
        String str2 = "geeksforgeeks";
        String str3 = "astha";

        // Checking if geeksforgeeks string
        // equates to geeksforgeeks string
        System.out.print(
            "Difference of geeksforgeeks(str) and geeksforgeeks(str) : ");
        System.out.println(str1.compareTo(str2));

        // Checking if geeksforgeeks string
        // equates to astha string
        System.out.print(
            "Difference of astha(str) and geeksforgeeks(str) : ");
        System.out.println(str1.compareTo(str3));
        
		 */
	}
}