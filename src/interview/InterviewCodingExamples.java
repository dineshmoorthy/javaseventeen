package interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class InterviewCodingExamples {


	public static void main(String[] args) {
		String ip  = "Java is great and Java is powerful";
		countWordFrequency(ip);
		int[] inputs = { 5, 4, 6, 7, 9,4, 2, 45, 7, 56, 23, 34, 89, 90 };
	//	printDuplicates(inputs);
	//	firstNonRepeatingChar(ip);
		
		String[] words = ip.toLowerCase().split("\\s+");
	//	groupAnagrams(words);
	//	oldwayIteration();
		
		//	computeifabsenttry();
	}
	private static void computeifabsenttry() {
		// TODO Auto-generated method stub
		String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};
		Map<String, List<String>> anagramMap = new HashMap<>();

		for (String word : words) {
		    char[] chars = word.toCharArray();
		    Arrays.sort(chars);
		    String key = new String(chars); // sorted word

		    // rememeber below syntax
		    anagramMap.computeIfAbsent(key, k -> new ArrayList<>()).add(word);
		}

		System.out.println(anagramMap.values());
		System.out.println(anagramMap);

	}
	private static void oldwayIteration() {
		// TODO Auto-generated method stub
		Map<String, Integer> map = new HashMap<>();
		map.put("A", 1); 
		map.put("B", 2);

		Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
		    Map.Entry<String, Integer> entry = iterator.next();
		    System.out.println(entry.getKey() + " -> " + entry.getValue());
		}

	}
	public static void countWordFrequency(String input) {
	    String[] words = input.toLowerCase().split("\\s+");
	    Map<String, Integer> wordCount = new HashMap<>();

	    for (String word : words) {
	        wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
	    }

	    System.out.println(wordCount);
	}

	public static char firstNonRepeatingChar(String input) {
	    Map<Character, Integer> countMap = new LinkedHashMap<>();
	    for (char c : input.toCharArray()) {
	        countMap.put(c, countMap.getOrDefault(c, 0) + 1);
	    }
	    System.out.println(countMap);
	    for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
	        if (entry.getValue() == 1) {
	        	char result = entry.getKey();
	    	    System.out.println(result);
	        	return result;
	        }
	    }
	    System.out.println("no unique character");

	    return '_'; // no unique character
	}

	
	public static void printDuplicates(int[] nums) {
	    Set<Integer> seen = new HashSet<>();
	    Set<Integer> duplicates = new HashSet<>();

	    for (int num : nums) {
	        if (!seen.add(num)) {
	            duplicates.add(num);
	        }
	    }

	    System.out.println("Duplicates: " + duplicates);
	}

	
	public static List<List<String>> groupAnagrams(String[] strs) {
	    Map<String, List<String>> anagramMap = new HashMap<>();
	    for (String s : strs) {
	        char[] chars = s.toCharArray();
	        Arrays.sort(chars);
	        String key = new String(chars);
	        anagramMap.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
	    }
	    System.out.println(anagramMap);
	    return new ArrayList<>(anagramMap.values());
	}

}
