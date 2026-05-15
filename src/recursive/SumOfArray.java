package recursive;

public class SumOfArray {

	static int[] input = {10,20,30,40, 50, 60};
	
	public static void main(String[] args) {
		sumofArray(input, 0, 0);
	}
	
	private static void sumofArray(int[] inputsum, int index, int result) {
		// TODO Auto-generated method stub
		if (index == (inputsum.length))
		{
			System.out.println("result: "+result);
			return;
		}	
		result = result + inputsum[index];
		sumofArray(inputsum, ++index, result);
	}
}
