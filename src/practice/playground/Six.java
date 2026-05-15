package practice.playground;

public class Six {
	public static void main(String[] args) {
		int input = 10;
		print(input);
		
	}

	
	private static void print(int input) {
		// TODO Auto-generated method stub
		System.out.print("0 1 ");
		fibonacciSeries(0, 1, 10);
	}


	private static void fibonacciSeries(int val1, int val2, int num) {
		// TODO Auto-generated method stub
		if(num == 0)
			return;
		int second = val1+val2;
		System.out.print(second+" ");
		fibonacciSeries(val2, second, --num);
	}
}
