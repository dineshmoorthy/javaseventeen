package interview;

class Parentu {
    void greet() {
        System.out.println("Hello from Parent");
    }
    
    public static int greet(int a) {
    	System.out.println("constructor with integer argument");
    	return a;
    }
}

class Childu extends Parentu {
    void greet() {
        System.out.println("Hello from Child");
    }
}

public class CanOverrideNonStaticMethod {
    public static void main(String[] args) {
        Parentu p = new Childu();
        p.greet(); // Prints: Hello from Child -- overridden
        
        Childu chd = (Childu) p;
        chd.greet();
        
    }
}