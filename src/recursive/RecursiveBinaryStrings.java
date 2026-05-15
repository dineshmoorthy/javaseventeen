package recursive;

public class RecursiveBinaryStrings {
    static void generate(String prefix, int n) {
        if (n == 0) {
            System.out.println(prefix);
            return;
        }
        generate(prefix + "0", n - 1);
        generate(prefix + "1", n - 1);
    }

    public static void main(String[] args) {
        generate("", 3);
    }
}
