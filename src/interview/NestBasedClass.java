package interview;

public class NestBasedClass {
    class Inner {
        private String innerSecret = "Inner Secret";
    }

    public void showInnerSecret() {
        Inner inner = new Inner();
        // ✅ Allowed in Java 11+ due to nest-based access
        System.out.println(inner.innerSecret);
    }
}
