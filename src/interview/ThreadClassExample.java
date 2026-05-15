package interview;


public class ThreadClassExample extends Thread{  
	   public void run(){  
	       System.out.println("Thread runs...");  
	   }  
	   
	   static void test() {
		   System.out.println("static method running?");
	   }
	   public static void main(String args[]){  
	       ThreadClassExample ib = new ThreadClassExample();  
	       ib.start();  
	       ib.run();
	   }  
}