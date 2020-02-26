package collect;

import java.util.*;


class Book3
{  
	int id;
	String name;
	Book3(int id,String name)
	{
		this.id = id;
		this.name = name;
	}
}

public class HashSetBook 
{

	public static void main(String[] args) 
	{
		Book3 b1 = new Book3(101,"C");
		Book3 b2 = new Book3(201,"Spring");
		
		HashSet<Book3> hs = new HashSet<Book3>();
		
		hs.add(b1);
		hs.add(b2);
		
		for(Book3 b : hs)
			System.out.println(b.id+" "+b.name);

	}

}
