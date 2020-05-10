package synchronization;

class Table6
{
   /**
 * @param n
 */
synchronized static void printTableint(int n)
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
			   System.out.println(e);
		   }
	   }	   
	   
   }	
	
}

public class StaticSync 
{

	public static void main(String[] args) 
	{
		
		Thread t1 = new Thread()
				{		       
			         public void run()
			         {
			        	 Table6.printTableint(10);
			         }
				};
				
		Thread t2 = new Thread()
		           {		       
			          public void run()
			          {
			        	 Table6.printTableint(100);
			          }
		            };
		            
		 t1.start();
		 t2.start();
	}

}
