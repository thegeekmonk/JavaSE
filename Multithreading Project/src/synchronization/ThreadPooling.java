package synchronization;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class WorkerThread implements Runnable
{

	private String msg;	
	WorkerThread(String s)
	{
		this.msg = s;
	}
	
	public void run()
	{
		System.out.println(Thread.currentThread().getName()+"  Start : "+msg);
		processMessage();
		System.out.println(Thread.currentThread().getName()+"  End : "+msg);
	}
	
	private void processMessage()
	{
		try
		{
			Thread.sleep(500);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
}


public class ThreadPooling 
{

	public static void main(String[] args) 
	{
		ExecutorService executor =  Executors.newFixedThreadPool(5); //Thread pool of 5 thread
		
		for(int i = 0;i < 10;i++)
		{
			Runnable worker = new WorkerThread("  "+i);			
			executor.execute(worker);
		}
		
		executor.shutdown();
		
		while(!executor.isTerminated()){}
		
		System.out.println("Finishes All Thread");

	}
}
