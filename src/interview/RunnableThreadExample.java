package interview;
public class RunnableThreadExample implements Runnable{  
	   public void run(){  
	       System.out.println("Thread runs...");  
	   }  
	   public static void main(String args[]){  
	       Thread ib = new Thread(new RunnableThreadExample()); 
	       ib.start();  
	   }  
	}