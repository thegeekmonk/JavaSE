package synchronization;

class Interrupt1 extends Thread
{
    public void run()
    {
    	for(int i = 1;i <= 2;i++)
    	{
    		/*try 
    		{
				Thread.sleep(1000);
			} 
    		catch (InterruptedException e) 
    		{
				System.out.println(e);
			}*/
    		
    		//System.out.println("Task");
    		
    		if(Thread.interrupted())
    		{
    			System.out.println("Interrupted Thread"+this.getName());
    		}
    		else
    		    System.out.println("Normal Thread"+this.getName());
    	}    	
    	
    }
}

public class ThreadInterrupt1 
{
	public static void main(String[] args) 
	{		
		Interrupt1 i1 = new Interrupt1();
		Interrupt1 i2 = new Interrupt1();
		
		i1.start();
		
		/*try 
		{
			i1.join();
		} 
		catch(InterruptedException e) 
		{
			System.out.println(e);
		}
		*/
		
		i2.start();
	    i2.interrupt();
	
	}

}
