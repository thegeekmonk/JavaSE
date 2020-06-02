package com.java.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap_101 
{

	public static void main(String[] args) 
	{
		Map<Integer,String> map = new HashMap<Integer,String>(); //generic code
		
		map.put(101,"Akhilesh");
		map.put(201,"Rahul");
		map.put(301,"Aditya");
		map.put(103,"Kushal");
		
		Set<Map.Entry<Integer,String>> set = map.entrySet(); //Getting entry set of map in-order to get collection view
		                                                     //since map is not a collection 
		
		for(Map.Entry<Integer,String> entry : set)          //using for each loop
		   System.out.println(entry.getKey()+" --> "+entry.getValue()); //using method of Map.Entry interface

	}

}
