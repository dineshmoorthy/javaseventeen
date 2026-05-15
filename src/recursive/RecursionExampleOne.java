package recursive;

public class RecursionExampleOne {
    public static void main(String[] args) {
        countDown(5);
    }

    static void countDown(int n) {
        if (n == 0) {
            System.out.println("Done!");
            return;
        }
        System.out.println(n);
        countDown(n - 1);  // recursive call
    }
}
