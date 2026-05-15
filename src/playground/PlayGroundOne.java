package playground;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;

public class PlayGroundOne {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		//HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		Hashtable<String, Integer> map = new Hashtable();
		
		//LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
		
		map.put("one", 100);
		map.put("two", 200);
		map.put("three", 300);
		map.put("four", 400);
		map.put("five", 500);
		map.put("six", 600);
		
		/*
		for(Map.Entry<String, Integer> hh: map.entrySet()) {
			
			System.out.println("Key: "+hh.getKey()+" Value: "+hh.getValue());
			if(hh.getKey().equalsIgnoreCase("three")) {
				System.out.println("gilmangae more!!!");
			}
		}
		
		if(map.containsKey("twenty")) {
			System.out.println("Wow got it");
		}else {
			System.out.println("Na na na!!");
		}
		
		
		for(String str :map.keySet()) {
			if(str.equalsIgnoreCase("two")) {
				
				System.out.println("Itengaran....."+map.get(str));
			}
		}

		
		Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
		
		while(iterator.hasNext()) {
			Entry<String, Integer> key = iterator.next();
			if(key.getKey().equalsIgnoreCase("three")) {
				System.out.println("From dumelu..."+key.getValue());
			}
		}
		 */
		
		
		Enumeration<String> enumeration = map.keys();
		while(enumeration.hasMoreElements()) {
			String key = enumeration.nextElement();
			if(key.equalsIgnoreCase("five")) {
				System.out.println("got it .....");
			}else {
				
				System.out.println(map.get(key));
			}
		}
		
		
		
		List<String> list = new ArrayList<>();
		list = new CopyOnWriteArrayList<String>();
		list.add("onu");
		list.add("twou");
		list.add("threeu");
		list.add("fouru");
		list.add("fiveu");
		list.add("sixu");
		
		Iterator<String> iter = list.iterator();
		
		while(iter.hasNext()) {
			String key = iter.next();
			if(key.equalsIgnoreCase("threeu")) {
				System.out.println("yes it is there!!");
				list.remove(key);
			}
		}
		
		list.stream().forEach(System.out::println);
		
		
 	}
}
