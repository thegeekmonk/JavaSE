package collect;

import java.util.*;

public class LinkedList1 
{

	public static void main(String[] args) 
	{
		LinkedList<String> ll = new LinkedList<String>();		
		ll.add("Akhil");
		ll.add("Satya");
		ll.add("Rupesh");
		
		System.out.println("LinkedList : "+ll);
		
		LinkedList<String> ll1 = new LinkedList<String>();		
		ll1.add("Java");
		ll1.add("Spring");
		
		ll.addAll(ll1);
		
		System.out.println("After adding linkedlist 1 to list : "+ll);
		
		LinkedList<String> ll2 = new LinkedList<String>();
		ll2.add("DS");
		ll2.add("Algorithm");
		
		ll1.addAll(2,ll2);
		System.out.println("After adding linkedlist 2 to list 1 : "+ll1);
		
		ll2.addFirst("C ");
		ll2.addLast("C++");
		
		System.out.println("After adding elements in linkedlist 2 : "+ll2);		

	}

}
