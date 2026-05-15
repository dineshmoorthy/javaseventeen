package recursive;

public class StringLength {

	static String input = "hellosir";
	public static void main(String[] args) {
		findlength(input, 0);
	}
	private static void findlength(String input2, int index) {
		// TODO Auto-generated method stub
		try {
			
			char c = input.charAt(index);
			findlength(input2, ++index);
					
		}catch(Exception ex){
			System.out.println("result: "+index);
			return;
		}
	}
}
