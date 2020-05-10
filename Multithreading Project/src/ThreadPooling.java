import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class WorkerThread implements Runnable
{
	private String msg;
	
	public WorkerThread(String msg)
	{
		this.msg = msg;
	}
	
	public void run()
	{
			System.out.println(Thread.currentThread().getName()+"  Start Message : "+msg);
			processmsg();
			System.out.println(Thread.currentThread().getName()+"  End()");			
	}		
		
		private void processmsg()
		{
			try 
			{
				Thread.sleep(1000);
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
		
		ExecutorService executer = Executors.newFixedThreadPool(5);
		
		for(int i  = 0;i < 10;i++)               //creating 10 task to be handled by ThreadPool of 5
		{
			Runnable rd = new WorkerThread("  "+i);  //Creating a Worker Thread 
			executer.execute(rd);                //calling execute method of ExecuteService to execute task for WorkerThread i
		}
		
		executer.shutdown();
		
		while(!executer.isTerminated()){}
		
		System.out.println("All Thread Finishied");

	}


}
