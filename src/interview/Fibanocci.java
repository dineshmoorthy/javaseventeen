package interview;

import java.util.stream.Stream;

public class Fibanocci {
	
	public static void main(String[] args) {
		
		int n = 10;
		
		// fibonnaci(n);
		// fibonacciTwo(n);
		 fibonacciStream();
		
	}

	private static void fibonnaci(int n) {
		// TODO Auto-generated method stub

		int a = 0, b = 1;

		for(int i = 0; i< n ;i++) {
			System.out.println(a+" ");

			a = b-a;
			b = a+b;
			
		}
	}
	
	// 0+1 
	// 0 1 1 2 3
	
	
	private static void fibonacciTwo(int n) {
		
		int next =0, a = 0, b=1; 
		
		for(int i =0; i<n ;i++) {
			System.out.println(a+" ");
			next = a+b;
			a = b;					
			b= next;
		}
	}
	
	
	
	
	// stream way
	
	private static void fibonacciStream() {
	// remember map syntax here
		Stream.iterate(new int[] {0,1}, f -> new int[] {f[1],f[0]+f[1]}).limit(10)
		.map(f -> f[0]).forEach(f -> System.out.println(f+" "));
		

	}

}
