package recursive;

public class ReverseString {
    static void reverse(String s) {
        if (s.isEmpty()) 
        	return;
        reverse(s.substring(1));
        System.out.print(s.charAt(0));
    }

    public static void main(String[] args) {
        reverse("hello"); // olleh
    }
}
