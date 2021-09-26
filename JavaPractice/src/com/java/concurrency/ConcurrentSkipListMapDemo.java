package com.java.concurrency;

import java.util.Iterator;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentSkipListMap;

public class ConcurrentSkipListMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConcurrentMap<Integer,Integer> map = new ConcurrentSkipListMap<Integer,Integer>();
		
		for(int i = 1;i <= 5;i++)
			map.put(i,i);
		
		System.out.println(map);
		
		map.remove(2);
		
		System.out.println(map);
		
		System.out.println("3rd element : "+map.get(3));
		
		
		
		map.put(10,5000);
		
		
		Iterator<ConcurrentSkipListMap.Entry<Integer,Integer>> itr = map.entrySet().iterator();		
		while(itr.hasNext())
		{   
			ConcurrentSkipListMap.Entry<Integer,Integer> skp = itr.next();
			System.out.println("Key : "+skp.getKey()+" Value : "+skp.getValue());
		}
		
		
	}

}
