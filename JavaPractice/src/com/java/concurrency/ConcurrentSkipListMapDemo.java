package com.java.concurrency;

import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentSkipListMap;

public class ConcurrentSkipListMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConcurrentMap<Integer,Integer> map = new ConcurrentSkipListMap<Integer,Integer>();
		
		for(int i = 1;i <= 5;i++)
			map.put(i,i);
		
		System.out.println(map);
		
	}

}
