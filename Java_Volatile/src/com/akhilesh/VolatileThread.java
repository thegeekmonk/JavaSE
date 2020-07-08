package com.akhilesh;

public class VolatileThread extends Thread
{  
	private final VolatileData data;
    
	public VolatileThread(VolatileData data)
	{
		this.data = data;
	}
	
	
	public void run()
	{
		System.out.println("[ "+Thread.currentThread().getId()+" ] : Old Value "+data.getCounter() );
		data.increaseCounter();
		
		System.out.println("[ "+Thread.currentThread().getId()+" ] : New Value "+data.getCounter() );
	}
}
