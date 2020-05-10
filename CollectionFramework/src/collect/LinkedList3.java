package collect;

import java.util.*;

public class LinkedList3 
{
	public static void main(String[] args) 
	{
		LinkedList<String> ll = new LinkedList<String>();
		
		ll.add("Akhil");
		ll.add("Satya");
		ll.add("Aditya");
		ll.add("Harsh");
		
		System.out.println(ll);
		
		//System.out.println("Traversing in reverse Order");
		
		Iterator<String> itr = ll.descendingIterator();
		
		System.out.println("Traversing in reverse Order");
		while(itr.hasNext())
		{
             System.out.println(itr.next());			
		}

	}

}
