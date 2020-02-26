
class ThreadGroupDemo extends Thread
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
	}
		
}

public class MultiThreadGroup 
{
	public static void main(String[] args) 
	{		
		ThreadGroupDemo obj = new ThreadGroupDemo();		
		ThreadGroup tg = new ThreadGroup("Group");
		
		Thread t1 = new Thread(tg,obj,"One");
		t1.start();
		
		Thread t2 = new Thread(tg,obj,"two");
		t2.start();
		
		Thread t3 = new Thread(tg,obj,"three");
		t3.start();
		
		System.out.println("Thread Group Name : "+tg.getName());
		tg.list();

	}

}
