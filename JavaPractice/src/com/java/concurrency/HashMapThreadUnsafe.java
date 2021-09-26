package com.java.concurrency;

import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapThreadUnsafe extends Thread {

	static HashMap<Integer,String> map = new HashMap<Integer,String>();
	
	public void run()
	{
		try {
			Thread.sleep(500);
			map.put(101,"D");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		map.put(102, "A");
		map.put(103, "B");
		map.put(104, "C");
		
		HashMapThreadUnsafe hm = new HashMapThreadUnsafe();
		hm.start();
		
		System.out.println(map);
		
		Iterator<ConcurrentHashMap.Entry<Integer,String>> itr = map.entrySet().iterator();
		
		while(itr.hasNext())
		{
			ConcurrentHashMap.Entry<Integer,String> entry = itr.next();
			System.out.println("Key : "+entry.getKey()+" Value : "+entry.getValue());
			try {
			Thread.sleep(500);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		
		
		
//		for(Object o : map.entrySet())
//		{
//			System.out.println(o);
//			try {
//			Thread.sleep(500);
//			}
//			catch(Exception e)
//			{
//				System.out.println(e);
//			}
//		}
//		
		
		System.out.println(map);
		
	}

}
