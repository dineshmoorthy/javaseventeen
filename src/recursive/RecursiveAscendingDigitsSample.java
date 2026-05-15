package recursive;

public class RecursiveAscendingDigitsSample {
    public static void main(String[] args) {
        generateAscending("", 1);  // 2-digit numbers
    }

    static void generateAscending(String current, int start) {
        for (int digit = start; digit <= 9; digit++) {
            System.out.println(current + digit);
        }
    }
}
