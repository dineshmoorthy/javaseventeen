package interview;

public class WrapPrimitive {

	public static void main(String[] args) {
		Integer a = new Integer(1);
		System.out.println(1 == a);
		
		Integer aa = new Integer(1);
		Integer bb = new Integer(1);
		
		System.out.println(aa == bb);
		// the value of those objects isn’t 1. Rather, it’s their memory addresses in the stack
	
		System.out.println("Hello!" == "Hello!");
		
		
		System.out.println(null == null);		
		
		
		System.out.println("Hello!" == null);
		
		// Difference Between == Operator and equals() Method in Java
		
		String s1 = "HELLO";
        String s2 = "HELLO";
        String s3 =  new String("HELLO");

        System.out.println(s1 == s2);
        System.out.println(s1 == s3); 
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3)); 
		
        
        Thread t = new Thread();
        Object o = new Object();
        String s = new String("GEEKS");

        System.out.println(t == o);
        System.out.println(o == s);
      
        // uncomment the below print 
        // statement to see the error.
       // System.out.println(t==s); 
        
        
     // Create two new Thread objects
        Thread t1 = new Thread();
        Thread t2 = new Thread();
        
      	// Assign t3 to reference same
      	// Thread object as t1
        Thread t3 = t1;

        // Create two String Objects with
      	// Same content
        String ss1 = new String("GEEKS");
        String ss2 = new String("GEEKS");

        System.out.println("threads....");
        System.out.println(t1 == t3);
        System.out.println(t1 == t2);
        System.out.println(ss1 == ss2);

        System.out.println(t1.equals(t2));
        System.out.println(ss1.equals(ss2));
        
        System.out.println(ss1.hashCode());
        System.out.println(ss2.hashCode());
	}
}
