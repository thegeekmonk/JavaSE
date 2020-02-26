package synchronization;

class Table1
{
	synchronized void printTable(int n)
	{
		for(int i = 1;i <= 5;i++)
		{
			System.out.println(n*i);
			
			try 
			{
				Thread.sleep(100);
			}
			catch(Exception e)
			{
				System.out.println(n*i);
			}
		}
	}
}

public class AnnonymousClass 
{

	public static void main(String[] args) 
	{
		
		Table1 obj = new Table1();
		
		Thread t1 = new Thread()
				{
			          public void run()
			          {
			        	  obj.printTable(5);
			          }
				};
				
		Thread t2 = new Thread()
				{
			        public void run()
			        {
			        	obj.printTable(100);
			        }
				};
				
		t1.start();
		t2.start();

	}

}
