package com.akhilesh;

public class VolatileMain 
{
    static final int threadCount = 2;
    
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub

		VolatileData data = new VolatileData();
		
		Thread thr[] = new Thread[threadCount];
		
		for(int i = 0;i < threadCount;++i)
		  thr[i] = new VolatileThread(data);
		
		thr[0].start();
		thr[1].start();
		
		thr[0].join();		
		
		thr[1].join();
	}

}
