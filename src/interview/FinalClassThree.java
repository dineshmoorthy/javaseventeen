package interview;

final public class FinalClassThree {
	private final int id;
	private final String name;

	FinalClassThree(int id, String name) {
	        this.id = id; // ✅ You can assign here
	        this.name = name;
	    }

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	// final class → cannot be subclassed.

	// final fields → cannot be reassigned after construction,
	// but you can still assign them inside the constructor.
}
