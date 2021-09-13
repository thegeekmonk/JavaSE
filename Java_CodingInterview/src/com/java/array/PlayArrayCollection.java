package com.java.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlayArrayCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = new ArrayList<Integer>();
		
		list.add(89);
		list.add(11);
		list.add(34);
		list.add(23);
		
		System.out.println(list);
		
		Integer a[] = new Integer[5];
		Integer arr[] = list.toArray(a);
		
		System.out.println(arr);
		
		List<Integer> li = Arrays.asList(arr);
		//System.out.println(li);
		
		Arrays.asList(arr).stream().forEach(System.out::println);
		
	}

}
