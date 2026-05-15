package interview;

public class SingletonExample {
	
	// Eager Initialization Singleton#
	
    private static final SingletonExample instance = new SingletonExample();

    private SingletonExample() {
        // private constructor
    }

    public static SingletonExample getInstance() {
        return instance;
    }
}
