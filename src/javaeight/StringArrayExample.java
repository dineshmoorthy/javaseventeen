package javaeight;

//Java program to demonstrate the
//conversion of String array to String

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StringArrayExample {
 public static void main(String[] args) {
     String[] arr
         = { "She",  "is", "a", "good", "girl" };
     // converting to string
     String s = Arrays.toString(arr);
     System.out.println(s);
     
     // Create a StringBuilder to build the resulting string
     StringBuilder sb = new StringBuilder();
     
     // Append the first element of the array to the StringBuilder
     sb.append(arr[0]);

     // Loop through the remaining elements in the array
     for (int i = 1; i < arr.length; i++) {
       
         // Append each element with a space in between
         sb.append(" " + arr[i]);
     }

     // Convert the StringBuilder content into a String
     String so = sb.toString();

     System.out.println(so);
     
     
     String[] inputs = {"I","am","a","bad","boy"};
     
     // when array of string is printed using direct tostring method vs arrays.tostring method  
     String directtostring = inputs.toString();
     System.out.println("directtostring: "+directtostring);
     
     String arraytostring = Arrays.toString(inputs);
     System.out.println("arraytostring: "+arraytostring);
     
     StringBuilder sb2  = new StringBuilder();
     
     for(String ss: inputs) {
    	 sb2.append(ss+" ");
     }
     
     System.out.println("Finally: "+sb2.toString());
    
     // Java 8 way
     
     List<String> listinputs = Arrays.asList("I", "am", "a", "bad", "boy");
    
     System.out.println("Listinput: "+listinputs);
     
     String rest = listinputs.stream().collect(Collectors.joining(" "));
     
     System.out.println("Result: "+rest);
     
     String oo = Arrays.asList(arr).stream().collect(Collectors.joining(" "));
     
   // same with map
     
     // Create a Map<Integer, String> with auto-increment keys
  
     Map<Integer, String> map = IntStream.range(0, inputs.length)
    	        .boxed()
    	        .collect(Collectors.toMap(index -> index + 1,   // keys start from 1
    	                                  index -> inputs[index])); // value from array

    	System.out.println("Map: " + map);

    	

    	

     // If you still want to join values like earlier
     String result = map.values().stream()
                        .collect(Collectors.joining(" "));
     System.out.println("Joined: " + result);
     
 }
}