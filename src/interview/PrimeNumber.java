package interview;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
       methodOne();
       methodTwo();
    }
	

	private static void methodOne() {
		// TODO Auto-generated method stub
		 int num = 17;
	        boolean isPrime = true;
	        for (int i = 2; i <= Math.sqrt(num); i++) {
	            if (num % i == 0) {
	                isPrime = false;
	                break;
	            }
	        }
	        if (isPrime) {
	            System.out.println(num + " is a prime number.");
	        } else {
	            System.out.println(num + " is not a prime number.");
	        }
	}
	
	
	private static void methodTwo() {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		
		
	}
}