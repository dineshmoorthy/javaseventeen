package recursive;

public class RecursionExampleTwo {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    static int factorial(int n) {
        if (n == 1) 
        	return 1;   // base case
        System.out.println(n);
        int result = n * factorial(n - 1);
        return result;
    }
}
