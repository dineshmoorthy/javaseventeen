package interview;

public class BinarySearchExample {
    //Recursive method for binary search
	
	/*
	 Recursion is the programming technique where a method calls itself and ends when a base case is reached. 
	 A base case is a conditional statement that breaks the loop by executing a return statement rather than invoking the same function once more
	 */
	
    private static boolean binarySearch(int[] arr, int low, int high, int key){
       
        //Calculating Mid.
        int mid = (low + high)/2;
       
        //Base Case.
        if(low > high)
            return false;
       
        //Checking if the key is found in the middle.
        if(arr[mid] == key)
            return true;
       
        //Searching on the left half if a key exists there.  
        if(key < arr[mid])
            return binarySearch(arr, low, mid-1, key);
       
        //Searching on the other half otherwise.
        return binarySearch(arr, mid+1, high, key);
    }
public static void main(String[] args) {
   
   int[] arr = {2, 5, 9, 13, 17, 21, 30};
   if(binarySearch(arr, 0, (arr.length-1), 30))
       System.out.println(" Element Found. ");
   else
       System.out.println(" Element not Found.");
}
}