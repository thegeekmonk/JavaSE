package com.java.datastructure;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;

public class BigDecimalSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub     
	ArrayList<BigDecimal> list = new ArrayList<BigDecimal>();	
	
	String str[] = {".12","1.12","0.11",".11"};
		
	for(String st : str)
	{
		list.add(new BigDecimal(st));
	}
	
	Collections.sort(list);
	
	System.out.println(list);
	}

}
