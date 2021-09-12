package com.java.HashMap;

import java.util.HashMap;

public class PairDifferenceArrayUsingHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {1,2,3,4,5,6,7,8,9};
		int n = 2;
		int size = arr.length;
		
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		for(int i = 0;i < size;i++)
		{
			map.put(arr[i], i);
		}
		
		for(int i = 0;i < size;i++)
		{
			int anotherPair = arr[i]+n;
			if(map.get(anotherPair) != null)
			{
				System.out.print("("+arr[i]+", "+anotherPair);
				System.out.println(")");
			}
		}
				
	}
}
