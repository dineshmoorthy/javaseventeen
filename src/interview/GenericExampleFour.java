package interview;

class TestE<T> {
    // An object of type T is declared
    T obj;
    TestE(T obj) { this.obj = obj; } // constructor
    public T getObject() { return this.obj; }
}

public class GenericExampleFour {
    public static void main(String[] args)
    {
    	
    	
        // instance of Integer type
        TestE<Integer> iObj = new TestE<Integer>(15);
        System.out.println(iObj.getObject());

        // instance of String type
        TestE<String> sObj
            = new TestE<String>("GeeksForGeeks");
        System.out.println(sObj.getObject());
        iObj = sObj; // This results an error
    }
    
    // Explanation: Even though iObj and sObj are of type Test, they are the references to different types because their type parameters differ. 
    // Generics add type safety through this and prevent errors.
    
}