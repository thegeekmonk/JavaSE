package synchronization;

class Table2
{
	void printTable(int n)
	{
		
	 synchronized(Table2.class)
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
}

class MyThread3 extends Thread
{
	Table2 t;
	
	MyThread3(Table2 t)
	{
		this.t = t;
	}
	
	public void run()
	{
		t.printTable(5);
	}
}

class MyThread4 extends Thread
{
	Table2 t;
	
	MyThread4(Table2 t)
	{
		this.t = t;
	}
	
	public void run()
	{
		t.printTable(10);
	}
}


public class SyncBlock 
{

	public static void main(String[] args) 
	{
		Table2 obj = new Table2();    //one object 1 lock
		Table2 obj1 = new Table2();   //another object 2nd lock
		
		MyThread3 t1 = new MyThread3(obj);
		MyThread4 t2 = new MyThread4(obj1);
		
		t1.start();
		t2.start();

	}

}
