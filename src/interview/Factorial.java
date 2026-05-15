package interview;

public class Factorial {
    public static void main(String[] args) {
     methodOne();
   //  methodTwo();
    }

	private static void methodOne() {
		// TODO Auto-generated method stub
		   int num = 7;
	        int fact = 1;
	        for (int i = 1; i <= num; i++) {
	            fact *= i;
	        }
	        System.out.println("Factorial of " + num + " is " + fact);
	}
    
    // 5!= 5*4*3*2*1
	/*
	 * 3! = 3 × 2 × 1 = 6 
	 * 
	 * 4! = 4 × 3 × 2 × 1 = 24 
	 * 
	 * 5! = 5 × 4 × 3 × 2 × 1 = 120
	 */
	

	private static void methodTwo() {
		// TODO Auto-generated method stub
		
		int fact = 4;
		
		int one = 1;
		for( int i=1; i<= fact ;i++) {
			one *= i;
		}
		
		System.out.println(one);
		
		
	}
	
	static int returnResult() {
		// TODO Auto-generated method stub
		   int num = 4;
	        int fact = 1;
	        for (int i = 1; i <= num; i++) {
	            fact *= i;
	        }
	        System.out.println("Factorial of " + num + " is " + fact);
	        return fact;
	}

	public static Object returnObjectmethod(int number) {
		// TODO Auto-generated method stub
		return null;
	}

}