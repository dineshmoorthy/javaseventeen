package interview;


public class ThreadInterfaceExample implements Runnable{  
	   public void run(){  
	       System.out.println("Thread runs...");  
	   }  
	   
	   	/*
	   static void test() {
		   System.out.println("static method running?");
	   }
	   	 */   
	   public static void main(String args[]){  
	       ThreadInterfaceExample ib = new ThreadInterfaceExample();  
	       ib.run();  
	   }  
}