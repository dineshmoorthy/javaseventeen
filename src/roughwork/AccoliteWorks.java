package roughwork;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;


public class AccoliteWorks {

	public static void main(String[] args) {

		String str = "LAtest Java is java and java is more powerful than older java";
		//secondLargest();
		// intStringViceversa();
		//	mapTry();
		//linkmapTry(str);
		iteratorTry(str);
		
	}

	private static void iteratorTry(String str) {
		// TODO Auto-generated method stub
		String[] strip = str.toLowerCase().split("\\s+");
		Map<String, Integer> inputs = new HashMap<>();
		
		for(String st : strip) {
			inputs.put(st, inputs.getOrDefault(st, 0)+1);
		}
		
		System.out.println("result: "+inputs);
		
		
		Iterator<Map.Entry<String,Integer>> iter = inputs.entrySet().iterator();
		while(iter.hasNext())
		{
			Map.Entry<String,Integer> result = iter.next();
			
			System.out.println("key: "+ result.getKey() +"  value: "+result.getValue());
		}
		
	}

	private static void linkmapTry(String str) {
		// TODO Auto-generated method stub
		Map<Character, Integer> iter = new LinkedHashMap<Character, Integer>();
		for(char ch : str.toLowerCase().toCharArray()) {
			iter.put(ch, iter.getOrDefault(ch, 0)+1);
		}
		System.out.println(iter);
		for(Map.Entry<Character, Integer> count : iter.entrySet()) {
			if(count.getValue() ==1) {
				char result = count.getKey();
				System.out.println(result);
			}
		}
	}

	private static void mapTry() {
		// TODO Auto-generated method stub
		
		String str = "LAtest Java is java and java is more powerful than older java";
		String [] inputs = str.toLowerCase().split("\\s+");
		System.out.println(Arrays.toString(inputs));
		
		Map<String, Integer> wordcount  = new HashMap<String, Integer>();
		for(String word : inputs) {
			wordcount.put(word, wordcount.getOrDefault(word, 0)+1);
		}
		System.out.println(wordcount);
	}

	private static void intStringViceversa() {
		// TODO Auto-generated method stub
		String s1 = "234";
		String s2 = "457.89";
		
		 //Use parseInt() when you just need a primitive int.

		//	Use valueOf() when you explicitly want an Integer object.
		int input1 = Integer.parseInt(s1);

		Integer wrapInt = Integer.parseInt(s1);
		// you can do this way but prefer wrapper way
		Integer wrap2 = Integer.valueOf(s1);
		
		System.out.println(input1 +" :value: "+wrapInt + " second : "+wrap2);
	}

	private static void secondLargest() {
		// TODO Auto-generated method stub
		int[] inputs = { 5, 4, 6, 7, 9, 2, 45, 56, 23, 34, 89, 90 };

		// find second largest number

		int size = inputs.length;

		int max = inputs[0];
		int secondmax = 0;
		for (int i = 0; i < size; i++) {

			if (inputs[i] > max) {
				secondmax = max;
				max = inputs[i];
			}
		}

		System.out.println("Second Max: " + secondmax);

	}
}
