package javatwentyone;


public class ScopedValueExample {
    static final ScopedValue<String> USER = ScopedValue.newInstance();

    public static void main(String[] args) throws Exception {

    	// Bind USER to "Nakul" only for this code block
        ScopedValue.where(USER, "Nakul").run(() -> {
            System.out.println("Running as: " + USER.get());
            doSomething();
        });
        
     // 	After the scope ends, USER is unbound
     //   System.out.println("Is USER bound now? " + ScopedValue.isBound(USER)); // false
    }

    /*
     ScopedValue.where(variable, value).run(() -> { ... });
	This creates a temporary binding between the ScopedValue and the value for the duration of the block.
	After the block finishes, the binding automatically disappears.
     */
    static void doSomething() {
        System.out.println("Still in scope: " + USER.get());
    }
}

