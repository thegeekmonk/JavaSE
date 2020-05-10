package collect;

import java.util.*;

class Book
{
	int id,quantity;
	String name,author;
	
	Book(int id,String name,String author,int quantity)
	{
		this.id = id;
		this.name = name;
		this.author = author;
		this.quantity = quantity;
	}
}


public class ArrayListBook 
{

	public static void main(String[] args) 
	{   
		Book b1 = new Book(101,"Let us C","Yashwant Kanetkar",7);
		Book b2 = new Book(301,"C++","Balaguruswamy",2);
		Book b3 = new Book(501,"Java","Herbert",1);
		
		ArrayList <Book> ab = new ArrayList<Book>();
		
		ab.add(b1);
		ab.add(b2);
		ab.add(b3);
		
		
		//System.out.println(ab[0].b1.id);
		
		for(Book b : ab)
			System.out.println(b.id+" "+b.name+" "+b.author+" "+b.quantity);
		
		Book b = ab.get(2);	
		System.out.println("At Index 2 : "+b.id+" "+b.name+" "+b.author+" "+b.quantity);
		
		Book b5 = new Book(701,"Spring","Craig Walls",1);
		
		System.out.println("\nAfter changing value at Index 1 : ");
		ab.set(1,b5);
		
		//Book b6 = ab.get(1);
		

		for(Book b9 : ab)
			System.out.println(b9.id+" "+b9.name+" "+b9.author+" "+b9.quantity);
		
		System.out.println(ab.isEmpty());
		
	}

}
