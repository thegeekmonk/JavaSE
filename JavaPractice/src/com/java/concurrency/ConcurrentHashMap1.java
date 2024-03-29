package com.java.concurrency;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class ConcurrentHashMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ConcurrentMap<Integer,String> map = new ConcurrentHashMap<Integer,String>();	
	map.put(101,"Java");
	map.put(102,"Hibernate");
	map.put(103,"Spring");
	map.put(104,"Web Services");
	
	map.putIfAbsent(105, "Data Structure");
	
	//map.put(105,"Data Structure");
	map.put(106,"Algorithm");
	map.put(107,"System Design");	
	System.out.println(map);	
		
	map.replace(104,"Web Services", "REST API");			
	System.out.println("After Replace : "+map);
	
	map.put(110, "Hello");	
	System.out.println("After Adding item : "+map);
	
	map.remove(110);
	System.out.println("After Removing Item "+map);
	
	
	Iterator<ConcurrentHashMap.Entry<Integer,String>> itr = map.entrySet().iterator();
	
	while(itr.hasNext())
	{
		ConcurrentHashMap.Entry<Integer,String> entry = itr.next();
		System.out.print("Key : "+entry.getKey());
		System.out.println(" Value : "+entry.getValue());
	}		
	
 }

}
