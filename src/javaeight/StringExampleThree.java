package javaeight;

public class StringExampleThree {

	// Java program to Demonstrate conversion from
	// String to StringBuffer and StringBuilder

	    // Main driver method
	    public static void main(String[] args) {
	      
	        // Creating object of StringBuffer class and
	        // passing our input string to it
	        StringBuffer sbr = new StringBuffer("Geek");

	        // Storing value StringBuffer object in String and
	        // henceforth converting StringBuffer object to
	        // StringBuilder class
	        String s = sbr.toString();
	        StringBuilder sbl = new StringBuilder(s);

	        System.out.println(sbl);
	    }
	}