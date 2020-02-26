package collect;

import java.util.*;

class Book1
{  
	int id,quantity;
	String name,author;
	
	Book1(int id,String name,String author,int quantity)
	{
		this.id = id;
		this.name = name;
		this.author = author;
		this.quantity = quantity;
		
	}
	
}

public class LinkedListBook 
{

	public static void main(String[] args) 
	{
		Book1 b1 = new Book1(101,"Let us C","Yashwant",5);
		Book1 b2 = new Book1(201,"Java","Herbert",4);
		Book1 b3 = new Book1(401,"C++","Balaguruswamy",7);
		
		
		LinkedList<Book1> ll = new LinkedList<Book1>();
		
		ll.add(b1);
		ll.addFirst(b2);
		ll.addLast(b3);
		
		for(Book1 b : ll)
			System.out.println(b.id+" "+b.name+" "+b.author+" "+b.quantity);		

	}

}
