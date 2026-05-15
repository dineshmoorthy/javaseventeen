package interview;
public class SingletonExampleTwo {
    private static volatile SingletonExampleTwo instance;

    private SingletonExampleTwo() {}

    public static SingletonExampleTwo getInstance() {
        if (instance == null) {
            synchronized (SingletonExampleTwo.class) {
                if (instance == null)
                    instance = new SingletonExampleTwo();
            }
        }
        return instance;
    }
    
    
}
