package com.java.se;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class WorkerThread extends Thread
{
	String msg;
	
	WorkerThread(String msg)
	{
		this.msg = msg;
	}
	
	public void run()
	{
		System.out.println("Thread : "+Thread.currentThread().getName()+" started");
		
		processMessage();
		
		System.out.println("Thread : "+Thread.currentThread().getName()+" completed");
	}
	
	private void processMessage()
	{
		System.out.println("Message --> "+msg+" Processing");
		
		try
		{
			Thread.sleep(100);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		System.out.println("Message --> "+msg+" Completed");
	}
	
	
}


public class ThreadPooling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExecutorService executor = Executors.newFixedThreadPool(5);
		
		for(int i = 11;i <= 15;i++)
		{
			executor.execute(new WorkerThread(" "+i));
		}
		
		executor.isShutdown();
		
		while(!executor.isTerminated()) {}
	}

}
