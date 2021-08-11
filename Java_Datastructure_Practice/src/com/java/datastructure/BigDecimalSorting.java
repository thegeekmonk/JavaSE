package com.java.datastructure;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class DecimalComparator implements Comparator<BigDecimal>
{   
	BigDecimal bg;
	
	DecimalComparator()
	{
		//this.bg = bg;
	}
//	public int compare(BigDecimal bg1,BigDecimal bg2)
//	{
//		if(bg1 == bg2)
//		{
//			
//		}
//		
//		return bg1.compareTo(bg2);
//	}
	@Override
	public int compare(BigDecimal bg1, BigDecimal bg2) {
		// TODO Auto-generated method stub		
		
		if(bg1 == bg2)
		{
			return 0;
		}		
		return bg1.compareTo(bg2);
	}
}

public class BigDecimalSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub     
	ArrayList<BigDecimal> list = new ArrayList<BigDecimal>();	
	
	String str[] = {".12","1.12","0.11",".11"};
		
	for(String st : str)
	{
		list.add(new BigDecimal(st));
	}
	
	Collections.sort(list,new DecimalComparator());
	
	System.out.println(list);
	}

}
