package interview;

import java.util.ArrayList;
import java.util.List;

public class UncheckedExample {
    public static void main(String[] args) {
        int[] arr = new int[3];
        System.out.println(arr[5]); // Unchecked: ArrayIndexOutOfBoundsException
        
        
        // nullpointer exception
        String[] strArray = new String[2];
        System.out.println(strArray[0].length()); //Trying to call a method on a null object
        
        
        String[] strArrayu = {"Hello", "World"}; //Initializing strArray
        if (strArrayu[0] != null) { //Check for null
            System.out.println(strArrayu[0].length());
        }
        
        //  IndexOutOfBoundsException
        List<String> lst = new ArrayList<>(); 
        lst.add("item-1");
        lst.add("item-2");
        lst.add("item-3");
        var result = lst.get(lst.size()); 
    }
        
}
 