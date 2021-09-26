package com.java.concurrency;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapThreadSafe extends Thread{

	static ConcurrentHashMap<Integer,String> map = new ConcurrentHashMap<Integer,String>();
	
	public void run()
	{   
		map.put(1, "D");
		try 
		{
			Thread.sleep(500);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}		
	}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		map.put(2, "A");
		map.put(3, "B");
		map.put(4, "C");
		map.put(5, "E");
		
		ConcurrentHashMapThreadSafe th = new ConcurrentHashMapThreadSafe();
		th.start();
		
		System.out.println(map);
		
		Iterator<ConcurrentHashMap.Entry<Integer,String>> itr = map.entrySet().iterator();
		
		while(itr.hasNext())
		{
			ConcurrentHashMap.Entry<Integer,String> entry = itr.next();
			System.out.println("Key : "+entry.getKey()+" Value : "+entry.getValue());
			
			try
			{
				Thread.sleep(500);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}			
		}
		
		System.out.println(map);
	}

}
