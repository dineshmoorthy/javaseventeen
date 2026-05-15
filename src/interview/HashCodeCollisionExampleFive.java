package interview;

// Example 3 — Different strings → Same hashCode (Collision)
public class HashCodeCollisionExampleFive {
    public static void main(String[] args) {
        String a = "FB";
        String b = "Ea";

        System.out.println("a.hashCode(): " + a.hashCode());
        System.out.println("b.hashCode(): " + b.hashCode());
        System.out.println("a.equals(b): " + a.equals(b));
    }
    
    // 🎯 This is a classic Java hash collision example — both "FB" and "Ea" yield same hashCode = 2236,
    // but are not equal → HashMap handles this using chaining/treeification.
}
