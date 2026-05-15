package recursive;

import java.util.*;

public class RecursiveAscendingNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        List<String> results = new ArrayList<>();
        generate("", 1, n, results);
        System.out.println(String.join(",", results));
    }

    private static void generate(String current, int startDigit, int length, List<String> results) {
        if (current.length() == length) {
            results.add(current);
            return;
        }

        for (int digit = startDigit; digit <= 9; digit++) {
            generate(current + digit, digit, length, results);
        }
    }
    
    // 11,12,13,14,15,16,17,18,19,
    // 22,23,24,25,26,27,28,29,
    // 33,34,35,36,37,38,39,
    // 44,45,46,47,48,49,
    // 55,56,57,58,59,
    // 66,67,68,69,
    // 77,78,79,
    // 88,89,
    // 99
}
