package interview;

public class MaxNum {

	public static void main(String[] args) {
	//methodOne();
	methodTwo();
	}


	private static void methodOne() {
		// TODO Auto-generated method stub
	int[] num = {1, 7,9,23,54,809, 7625,2, 87,3,5,27};
		
		int max = 0;
		for(int i : num) {
			if(i > max)
				max = i;
		}
		
		System.out.println(max);
	}
	
	

	private static void methodTwo() {
		// TODO Auto-generated method stub
		int[] num = {1, 7,9,23,54,809, 7625,2, 87,3,5,27};
		
		int max = num[0];
		
		for(int i = 1; i < num.length; i++) {
			if(num[i] > max)
				max = num[i];
		}
		
		System.out.println(max);
	}
}
