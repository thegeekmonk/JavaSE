package com.java.concurrency;

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
		
	map.replace(104,"Web Services ", "REST API");	
		
	System.out.println(map);
	}

}
