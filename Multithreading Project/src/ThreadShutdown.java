
class MyThread extends Thread
{
	public void run()
	{
	    System.out.println("Shutdown Hook Task Completed ");
	}
	
}

public class ThreadShutdown 
{

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		MyThread t = new MyThread();
		
		Runtime r = Runtime.getRuntime();
		r.addShutdownHook(t);
		
		System.out.println("Press any ctrl+c to exit");
		
		try
		{
			Thread.sleep(5000);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
