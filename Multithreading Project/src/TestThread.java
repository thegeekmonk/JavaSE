
public class TestThread extends Thread
{ 
	public void run()
	{  
		   for(int i = 1;i <= 5;i++)
		   {
			   try 
			   {
			      Thread.sleep(500);
		       }		
		       catch(InterruptedException e)
		       {
			      System.out.println(e);
		       }
		
		      System.out.println(this.getName()+" : "+i);
	       }
	}
		
	public static void main(String[] args) 
	{		
		TestThread t1 = new TestThread();
		TestThread t2 = new TestThread();
		
		t1.setName("t1");
		t2.setName("t2");
		
		t1.start();
		t2.start();
	}

}
