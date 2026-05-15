package interview;

import java.io.*;

/**
 * Example demonstrating checked and unchecked exceptions in Java.
 */
public class ExceptionDemo {

    // Checked Exception Example
    public static void readFile(String path) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            System.out.println("File content: " + reader.readLine());
        }
    }

    // Unchecked Exception Example
    public static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }
        
    
    public static void main(String[] args) {
        // Checked Exception Handling
        try {
            readFile("example.txt");
        } catch (IOException e) {
            System.err.println("Caught IOException: " + e.getMessage());
        }

        // Unchecked Exception Handling
        try {
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.err.println("Caught ArithmeticException: " + e.getMessage());
        }
        
        arithmeticmethod();
    }
    
    public static void arithmeticmethod() {
    	try {
    	    int result = divide(10, 0);
    	    System.out.println("Result: " + result);
    	} catch (ArithmeticException e) {
    	    System.err.println("Caught second ArithmeticException: " + e.getMessage());
    	}

    }
}
