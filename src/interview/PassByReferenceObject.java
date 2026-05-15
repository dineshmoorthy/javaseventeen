package interview;

class Doggie{
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Doggie(String name) {
		super();
		this.name = name;
	}
	
}
public class PassByReferenceObject {
	public static void main(String[] args) {
	    Doggie aDog = new Doggie("Max");
	    Doggie oldDog = aDog;

	    // we pass the object to foo
	    foo(aDog);
	    // aDog variable is still pointing to the "Max" dog when foo(...) returns
	    System.out.println("1: "+aDog.getName());
	    System.out.println("Equals: "+(aDog == oldDog)); // true
	    
	    int a = 10;
	    
	    primitiveinput(a);
	    System.out.println("Primitive: "+ a);
	}

	private static void primitiveinput(int a) {
		// TODO Auto-generated method stub
		a = 20;
		System.out.println("PrimitiveInside: "+ a);
	}

	public static void foo(Doggie d) {
	  
		System.out.println("from Foo:: "+d.getName().equals("Max"));// true
		// comment below line to see the difference
		d.setName("doggie");
	    // change d inside of foo() to point to a new Dog instance construct red with name member variable set to "Fifi"
	   // d = new Doggie("Fifi");
	    System.out.println("from fifi: "+d.getName()); // true
	    
	    
	}
}
