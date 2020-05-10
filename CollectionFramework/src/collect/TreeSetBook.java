package collect;

import java.util.*;

class Book5 implements Comparable<Book5>
{
	int id;
	String name;
	
	Book5(int id,String name)
	{
		this.id = id;
		this.name = name;
	}	
	
	public int compareTo(Book5 b)
	{
		if(id > b.id)
			return 1;
		else if(id < b.id)
			return -1;
		else
			return 0;
	}
}

public class TreeSetBook 
{
	public static void main(String[] args) 
	{   		
		Book5 b1 = new Book5(101,"Spring");
		Book5 b2 = new Book5(301,"Java");
		
		Set<Book5> set = new TreeSet<Book5>();
		
		set.add(b1);
		set.add(b2);
		
		for(Book5 b : set)
		{
			System.out.println(b.id+" "+b.name);
		}	

	}

}
