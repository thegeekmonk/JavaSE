package com.java.se.regex;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class IntegerListStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = new ArrayList<>();
		list.add(3);
		
		list.add(5);
		list.add(2);
		list.add(7);
		
		
	List<Double> intg = list.stream().filter(p->p%2 != 0).map(i->Math.pow(i, 2)).collect(Collectors.toList());
	
	int sum = 0;
	for(Double d : intg)
	{
		sum += d;
	}
		
	
	 System.out.println(sum);
	}

}
