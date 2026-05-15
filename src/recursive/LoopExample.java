package recursive;

public class LoopExample {
    public static void main(String[] args) {
        showLoop(1);  // we start with start = 1
    }

    static void showLoop(int start) {
        System.out.println("Start value is: " + start);
        for (int digit = start; digit <= 9; digit++) {
            System.out.println("digit = " + digit);
        }
        System.out.println("Loop finished for start = " + start);
    }
}
