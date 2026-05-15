package interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
public class RemoveDuplicates {
    public static void main(String[] args) {
    //  methodone();
     // methodTwo();
    //	methodThree();
    //	methodFour();
    	methodFive();
    }




	private static void methodone() {
		// TODO Auto-generated method stub
		  int[] nums = {1, 2, 3, 1, 2, 4, 5};
	        Set<Integer> set = new LinkedHashSet<>();
	        for (int num : nums) {
	            set.add(num);
	        }
	        // remember below syntax
	        Integer[] result = set.toArray(new Integer[set.size()]);
	        System.out.println(Arrays.toString(result));
	}
	
	

	private static void methodTwo() {
		// TODO Auto-generated method stub
		
		int[] num = {1, 3, 4, 2, 4, 3, 4,1,5,6,7,4, 3,9, 15};
		
		Set<Integer> inputset = new HashSet<Integer>();
		
		for (int integer : num) {
			inputset.add(integer);
		}
		
		System.out.println(inputset);
		
	}
	
	

	private static void methodThree() {
		// TODO Auto-generated method stub
		

		int[] num = {1, 3, 4, 2, 4, 3, 4,1,5,6,7,4, 3,9, 15};
		
		
		List<Integer> result = new ArrayList<Integer>();
		
		int temp = num[0];
		result.add(temp);
		
		for(int i =0; i < result.size();i++) {
		//	for(int res : result)
			for(int j = 1; j< num.length;j++)
			{
				if(num[j] == temp || num[j] == result.get(i)) {
					
				}else {
					if(i<=result.size() && temp == num[j]){
						
					}else {
						result.add(num[j]);
						temp = num[j];
					}
				}
			}
			System.out.println(result);
		}
		
		
		
		
	}
	
	private static void methodFour() {
		// TODO Auto-generated method stub
		// failure
		int[] num = { 1, 3, 4, 2, 4, 3, 4, 1, 5, 6, 7, 4, 3, 9, 15 };

		List<Integer> result = new ArrayList<Integer>();

		int temp ;

			for (int j = 0; j < num.length; j++) {
				temp = num[j+1];
				if (num[j] != temp && result.size() == 0) {
					
					System.out.println("Adding to result array: "+ temp);
					result.add(num[j]);
					result.add(temp);
					temp = num[j+2];
				}
					for (int i = 0; i < result.size(); i++) {
						System.out.println("temp: "+temp);
						System.out.println("num j: "+ num[j]);
						System.out.println("result i: "+result.get(i));
 						if (num[j] != temp && result.get(i) != temp && i == result.size()-1) {
					
							System.out.println("Adding to result array: "+ temp);
							result.add(temp);
							break;
						} else {

							System.out.println("contain in actual array"+temp);
						}
			}

			System.out.println(result);
			}
		

	}
	
	private static void methodFive() {
		int[] num = { 1, 3, 4, 2, 4, 3, 4, 1, 5, 6, 7, 4, 3, 9, 15 };

		List<Integer> result = new ArrayList<Integer>();
		
		int temp  = num[0];
		result.add(temp);
		boolean check = false;
		for(int i = 0; i< num.length; i++) {
			temp = num[i];
			for(int j = 0; j <= i ; j++) {
				System.out.println("temp: "+temp);
				System.out.println("num j: "+ num[j]);
				System.out.println("result i: "+result);
				
				/*if(result.size() == 1) {
					temp = num[i + 1];
//				}*/
				
				
				if(num[j] != temp && j==i) {
					//check = true;
					resultadd(result, temp);
				}
				if( num[j] == temp  && j==i) {
					resultadd(result, temp);
					System.out.println("result i: "+result);
					
				}
				else if(num[j] == temp) {
					
					//check = true;
					break;
				}
					
			}
		}
		
		System.out.println(result);

	}




	private static void resultadd(List<Integer> result, int temp) {
		// TODO Auto-generated method stub
		for(int k = 0; k<= result.size(); k++)
		{
			if (k == result.size() && result.get(k-1) != temp) {
				result.add(temp);
				
			}
			
			if( k == result.size() && result.get(k-1) == temp ) {
				break;
			}
		}
	}
	
}