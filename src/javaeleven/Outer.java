package javaeleven;

public class Outer {
    private String secret = "Outer Secret";

    class Inner {
        void show() {
            // ✅ Inner can access Outer’s private member
            System.out.println(secret);
        }
    }

    void reveal() {
        Inner inner = new Inner();
        inner.show();
    }

    public static void main(String[] args) {
        new Outer().reveal();
        
    }
}
