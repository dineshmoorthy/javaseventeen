package recursive;

public class Seven {

	public static void main(String[] args) {
		String ss = "dinesh dakshinamoorthy";
		reverseString(ss, ss.length());
	}

	private static void reverseString(String ss, int length) {
		// TODO Auto-generated method stub
		if(length == 0)
			return;
		int i = length-1;
		System.out.print(ss.charAt(i));
		reverseString(ss, i);
		
	}

	
}
