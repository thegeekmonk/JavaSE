package synchronization;

class Customer
{
   int amount = 10000;
   
   synchronized void withdraw(int amount)
   {
	   System.out.println("Withdrawing money");
	   
	   if(this.amount < amount)
	   {
		   System.out.println("Insufficient Amount waiting for deposit ");
		   
	    try
	    {
		   wait();
	    }
	    catch(Exception e)
	    {
		  System.out.println(e);
	    }
	  
	    this.amount -= amount;
	  
	    System.out.println("After Withdrawl Balance : "+this.amount);
     }
   }	   
   
   synchronized void deposit(int amount)
   {   
	   System.out.println("Depositing Money");
	   
	   this.amount += amount;
	   
	   System.out.println("Amount deposited");
	   
	   notify();
	   
	   System.out.println("After Deposit Balance : "+this.amount);
   }
	
}

public class InterThread 
{

	public static void main(String[] args) 
	{
		final Customer c = new Customer();
		
		new Thread()
		{
			public void run()
			{
				c.withdraw(15000);
			}
		}.start();
		
		new Thread()
		{
			public void run()
			{
				c.deposit(10000);
			}
		}.start();

	}

}
