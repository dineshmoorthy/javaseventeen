package interview;

public class ThrowThrowsExample {
	public static int testExceptionDivide(int a, int b) throws ArithmeticException {
		if (a == 0 || b == 0)
			throw new ArithmeticException();
		return a / b;
	}

	public static void main(String args[]) {
		try {
			testExceptionDivide(10, 0);
			System.out.println("how is it");
		} catch (ArithmeticException e) {
			// Handle the exception
			System.out.println(e);
		}
	}
}