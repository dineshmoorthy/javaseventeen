package interview;

public class HashCodeExampleFour {
    public static void main(String[] args) {
        String s1 = "Bank";
        String s2 = new String("Bank");

        System.out.println("s1.equals(s2): " + s1.equals(s2));
        System.out.println("s1.hashCode(): " + s1.hashCode());
        System.out.println("s2.hashCode(): " + s2.hashCode());
    }
}
