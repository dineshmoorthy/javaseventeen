package interview;

import java.util.List;

public class ArrayDeclarationExample {

	public static void main(String[] args) {

		// way 1
		int[] array = new int[10];
		printArray(array);

		// way 2
		int[] data = { 10, 20, 30, 40, 50, 60, 71, 80, 90, 91 };
		printArray(data);

		// way 3
		int[] data2;
		data2 = new int[] { 100, 200, 300, 400, 500, 600, 700, 8000, 900, 910 };
		printArray(data2);

		// 2
		
		int[] data3;
		// uncomment below line to see the error
		// data3 = {101,201, 301, 401, 501, 601, 701, 801 };
		// printArray(data3);

		Integer[] intarray = { 1, 2 };
		printArray(data);
		String[] stringarray = new String[5];

		Integer[] intarray2 = new Integer[] {4,5,6,7,8,9};
		//printArray(intarray2);
	}

	private static void printArray(int[] array) { // TODO Auto-generated method stub
		for (int i : array) {
			System.out.println("value : " + i);
		}
	}
}
