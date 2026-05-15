package interview;

import java.util.Scanner;

public class ReverseString {
	
	/*
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Convert to char array (optional but helpful)
        char[] chars = input.toCharArray();
        String reversed = "";

        // Loop from end to start
        for (int i = chars.length - 1; i >= 0; i--) {
            reversed += chars[i];  // appending characters manually
        }

        // Output
        System.out.println("Reversed string: " + reversed);

        scanner.close();
    }
    */
	
	
	public static void main(String[] args) {
		reverseStringTry();
	}

	private static void reverseStringTry() {
	
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		
		String reverse = "";
		char[] chang = input.toCharArray();
		for(int i= chang.length-1 ; i >= 0; i--) {
			reverse += chang[i];
		}
		
		System.out.println(reverse);
	}
}