package com.java.se;

public class LambdaThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Runnable r1 = new Runnable()
				{
			         public void run()
			         {
			        	 System.out.println("Thread without lambda is running");
			         }
				};				
	    Thread t1 = new Thread(r1);
	    t1.start();
		
		Runnable r2 = ()->{System.out.println("Thread with lambda is running");};
		Thread t2 = new Thread(r2);
		t2.start();		
	}
}
