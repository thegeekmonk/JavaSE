package com.java.collection.map;

import java.util.HashMap;
import java.util.Map;

public class HashMap_102 
{

	public static void main(String[] args) 
	{
		Map<Integer,String> map = new HashMap<Integer,String>();
		
		map.put(101,"Mango");
		map.put(102,"Banana");
		map.put(105,"Kheera");
		map.put(107,"Pomegrenate");
		
		//using Stream API, Method Reference of Java 8
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println); //Ascending order
		
		
		

	}

}
