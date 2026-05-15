package javaeight;

public class StringConversionExampleTwo {

	// Java Program to Demonstrate Conversion from
	// String to StringBuffer and StringBuilder
	   
	    public static void main(String[] args) {
	      
	        // Creating objects of 
	        // StringBuffer class
	        StringBuffer sbr = new StringBuffer("Geeks");
	        StringBuilder sbl = new StringBuilder("Hello");

	        // Converting StringBuffer object to String
	        // using toString() method
	        String s1 = sbr.toString();

	        // Printing the above string
	        System.out.println(
	            "StringBuffer object to String: ");
	        System.out.println(s1);

	        // Converting StringBuilder object to String
	        String s2 = sbl.toString();

	        // Printing the above string
	        System.out.println(
	            "StringBuilder object to String: ");
	        System.out.println(s2);

	        // Changing StringBuffer object sbr
	        // but String object(s1) doesn't change
	        sbr.append("ForGeeks");

	        // Printing the above two strings on console
	        System.out.println(sbr);
	        System.out.println(s1);
	    }
	}