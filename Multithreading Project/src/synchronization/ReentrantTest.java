package synchronization;

class Reentrant
{	
	public synchronized void m()
	{   
		n();
		System.out.println("Method 'M'");
	}
	
	
	public synchronized void n()
	{
		System.out.println("Method 'N'");
	}

}

public class ReentrantTest 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Reentrant re = new Reentrant();
        
		Thread th = new Thread()
				{
			        public void run()
			        {
			        	re.m();
			        }
			 
				};
		th.start();		
		
	}

}
