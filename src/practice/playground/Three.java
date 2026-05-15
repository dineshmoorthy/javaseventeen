package practice.playground;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class Three{
	
	
	public static void main(String[] args) {
		List<List<List<String>>> bucketlist = Arrays.asList(Arrays.asList(Arrays.asList("ccc", "bbb"), Arrays.asList("aa", "dd", "ee"), Arrays.asList("gg", "hh", "iii")));
		
		
		Map<Integer, List<String>> result = bucketlist.stream().flatMap(List::stream).flatMap(List::stream).collect(Collectors.groupingBy(String::length));
		
		System.out.println(result);

		Iterator<Entry<Integer, List<String>>> iterator = result.entrySet().iterator();
		
		while (iterator.hasNext()) {
			Entry<Integer, List<String>> ss = iterator.next();
			System.out.println("key: "+ss.getKey() + "   ::  "+ss.getValue());
			
		}
		
		/*
		
		
		Map<Integer, List<String>> result = bucketlist.stream().flatMap(List::stream).flatMap(List::stream).collect(Collectors.groupingBy(String::length));
		
		System.out.println(result+"------------");
		
		bucketlist.stream().map(f -> f.stream().map(s -> s.stream()).collect(Collectors.toList()))
		.collect(Collectors.toList()).forEach(System.out::println);
		
		
		List<List<List<String>>> liststring = Arrays.asList(Arrays.asList(Arrays.asList("aa", "cc"), Arrays.asList("ee","bbb", "ddd",  "ggg"), Arrays.asList("hh", "rrr", "kk")));
		
		Map<Integer, List<String>> mapoutput = liststring.stream().flatMap(List::stream).flatMap(List::stream)
											.collect(Collectors.groupingBy(String::length));
		
		
		System.out.println("Result: "+ mapoutput);
		
		
		Iterator<Entry<Integer, List<String>>> iterator = mapoutput.entrySet().iterator();
		while(iterator.hasNext()) {
			Entry<Integer, List<String>> entry = iterator.next();
			
			System.out.println("While: "+entry.getKey() + " Value: "+entry.getValue());
		}
		Map<String, Integer> mapdo = new HashMap<String, Integer>();
		Map<String,List<String>> maplist = new HashMap<String, List<String>>();		
		String[] strarray = { "bus", "ubs", "tea", "tan", "ant","ate", "eat", "sub", "nat"};
		for(String word: strarray) {
			char[] chararray = word.toCharArray();
			Arrays.sort(chararray);
			String sso = new String(chararray);
			//maplist.computeIfAbsent(sso, k -> new ArrayList()).add(word);
			mapdo.put(sso, mapdo.getOrDefault(sso, 0)+1);
			System.out.println("char: "+ Arrays.toString(chararray));
			
		}
		
		System.out.println("Mapstring: "+ maplist);
		System.out.println("Mapdo: "+ mapdo);
		
		Integer[] i = new Integer[] {10, 20,30,40,50,60};
		int[] ii =  {10, 20,30,40,50,60};
		
		int[] inputs = { 5, 4, 6, 7, 90, 4, 2, 45, 7, 56, 23, 34, 89, 90 };
		
		int[] intinputs = {1,2 ,3,4,5, 6, 7, 8, 9, 10, 11, 12,15,14,11, 16};
		printDuplicates(inputs);
		printFizzBizz(intinputs); // if divided by 3 print fizz, if divided by 5 print bizz, if both fizzbizz
		
		
		Iterator<Integer> iter = mapoutput.keySet().iterator();
		
		while(iter.hasNext()) {
			Integer key = iter.next();
			
			System.out.println(":: "+ mapoutput.get(key));
			
		}
		
		
	}
	private static void printFizzBizz(int i) {
		System.out.println("overloading1");
	}

	private static void printFizzBizz(int[] intinputs) {
		// TODO Auto-generated method stub
		for(int a : intinputs) {
			if((a % 3 == 0) && (a % 5 == 0)) {
				System.out.println(a+" : FizzBizz");
			}else if((a % 5 == 0)) {
				System.out.println(a+" : Bizz");
			}else if ((a % 3 == 0)) {
				System.out.println(a+" : Fizz");
			}else {
				System.out.println(a+" : ?");
			}
		}
	}

	private static void printDuplicates(int[] inputs) {
		// TODO Auto-generated method stub
		Set<Integer> set = new HashSet<>();
		List<Integer> dup = new ArrayList<Integer>();
		for(int ss: inputs) {
			if(!set.add(ss)) {
				dup.add(ss);
			}
		}
		
		System.out.println("Without Duplicate: "+ set);
		System.out.println("Duplicates: "+ dup);
		*/
	}
}