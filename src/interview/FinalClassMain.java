package interview;

final class FinalClassTwo {
	public void exampleMethod() {
		System.out.println("This is a method within the final class.");
	}
}

class AdditionalClass extends FinalClassTwo {
	public void exampleMethod() {
		System.out.println("The method is now also available in the additional class.");
	}
}

public class FinalClassMain {
	public static void main(String[] args) {
		AdditionalClass ourAdditionalClass = new AdditionalClass();
		ourAdditionalClass.exampleMethod();
	}
}