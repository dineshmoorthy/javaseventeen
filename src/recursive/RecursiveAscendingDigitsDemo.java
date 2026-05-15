package recursive;

public class RecursiveAscendingDigitsDemo {
    public static void main(String[] args) {
        generateAscending("", 1, 2);  // 2-digit numbers
    }

    static void generateAscending(String current, int start, int length) {
        if (current.length() == length) {
            System.out.println(current);
            return;
        }
        
        // assigning start to digit reference variable is a trick, if you assign zero 0 instead of start results will change
        for (int digit = start; digit <= 9; digit++) {
        	System.out.println("digit = " + digit);
        	System.out.println("start = " + start);
            generateAscending(current + digit, digit, length);
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
