package interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MaxNumberExample {
public static void main(String[] args) {
	
	BinaryOperator<Integer> biop = (a, b) -> a > b ? a :b;
	
	List<Integer> intlist = Arrays.asList(45, 30, 68, 2, 3, 5, 7, 6, 4, 8, 12, 98,75,43, 21);
	
	
	//intlist.stream().sorted((a,b) -> a.compareTo(b)).forEach(System.out::println);;
	
	
	int max = 0;
	
	for(int inp : intlist) {
		if(inp > max) {
			max = inp;
		}
	}

	System.out.println("Max value: "+max);
/*
	Comparator<Integer> compar = (a,b)-> a.compare(a, b);
	intlist.sort(compar);
	
	intlist.forEach(System.out::println);
	
	*/
	
	//intlist.stream().sorted((a,b) -> a.compare(a, b)).forEach(System.out::println);
	
	intlist.stream().sorted(Integer::compare).forEach(System.out::println);
	
	Function<Integer,Integer> funint = Function.identity(); 
	intlist.stream().sorted(Comparator.comparing(funint)).forEach(System.out::println);
	
}
}
