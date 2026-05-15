package accolite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Collector;
public class AccoliteInterview {

	public static void main(String[] args) {
		/*
		Employee emp1 = new Employee("Dinesh", 560, "Development",2000);
		Employee emp2  =new Employee("ravi", 235, "Development",9000);
		
		Employee emp11 = new Employee("vignesh", 65, "Sales",7000);
		Employee emp12  =new Employee("peter", 35, "Testing",8000);
		
		Employee emp21 = new Employee("aishwarya", 60, "Marketing",6000);
		Employee emp22  =new Employee("aradhana", 78, "Development",3000);
		
		Employee emp31 = new Employee("harshitha", 7890, "Sales",14000);
		Employee emp32  =new Employee("murali", 346, "Development",200);
		
		
		List<Employee> list = new ArrayList<Employee>();
		list.add(emp1);
		list.add(emp2);
		list.add(emp11);
		list.add(emp12);
		list.add(emp21);
		list.add(emp22);
		list.add(emp31);
		list.add(emp32);
		
		List<Employee> departlist = 
		list
		.stream()
		.filter(f -> f.getDeparment().equalsIgnoreCase("Sales"))
		.toList()
		;*/
		
		//Collections.sort(departlist);
		
		
		String str = "swiss";
		
		// first non repeating character
		
		char[] inputs=  str.toCharArray();
		
		
		Set<Character> result = new HashSet<Character>();
		List<Character> listresutl = new ArrayList<Character>();
		
		
		Map<Character, Integer> mapcount = new HashMap<Character, Integer>();
		
		boolean flag = false;
		for(int  i = 0; i < inputs.length ; i++) {
			char ch = inputs[i];
			if(result.contains(ch))
			{
				flag = true;
				listresutl.remove((Character) ch);
			}
			if(!result.contains(ch) && !flag) {
				result.add(ch);
				listresutl.add(ch);
				System.out.println("result : "+ch);
			}
			
		}
		System.out.println("s result : "+result);	
		System.out.println("First non repeating character: "+listresutl);
				
		
		
		
		
		//System.out.println(departlist);
		}
}
