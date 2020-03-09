package practice.java8;

import java.util.*;

public class StringJoinerTest 
{

	public static void main(String[] args) 
	{
		StringJoiner join1 = new StringJoiner(",");
		
		join1.add("Corona");
		join1.add("covid-19");
		
		System.out.println(join1);
		
		System.out.println("Length :  "+join1.length());
		
		
		StringJoiner join2 = new StringJoiner(":","[","]");
		
		join2.add("china");
		join2.add("wuhan");
        
		System.out.println(join2);
		
		StringJoiner merg =  join1.merge(join2);
		
		System.out.println(merg);
		
		System.out.println("Hello ");
	}

}
