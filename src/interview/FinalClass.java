package interview;
public final class FinalClass {
    public static final double PI = 3.14159;

    public static void printValue() {
        System.out.println("Constant value");
    }
}

// This will cause a compile-time error:
// class Extended extends FinalClass {}  // ❌ Not allowed

