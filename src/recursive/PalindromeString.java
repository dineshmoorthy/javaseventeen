package recursive;

public class PalindromeString {

	static String input = "TENET";
	public static void main(String[] args) {
		palindromeCheck(input, 0, input.length());
	}

	private static void palindromeCheck(String input2, int index , int length) {
		// TODO Auto-generated method stub
		if(index == (input2.length()/2)){
			System.out.println("Given String is a palindrome: ");
			return ;
		}
		char start = input2.charAt(index);
		char end = input2.charAt(length-1);
		 
		if( start ==  end) {
			System.out.println(input2.charAt(index));
			palindromeCheck(input2, ++index, length-1);
			
		}else {
			System.out.println("Given String is not palindrome: ");
			return;
		}
		
	}
}
