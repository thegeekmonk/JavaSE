package collect;

import java.util.*;

public class LinkedList2 
{
	public static void main(String[] args) 
	{
		LinkedList<String> ll = new LinkedList<String>();
		
		ll.add("Akhil");
		ll.add("Satya");
		ll.add("Modi");
		ll.add("Shah");
		ll.add("Yogi");
        ll.add("Baba");
        ll.add("Java");
        
        //System.out.println("Linked List : "+ll);       
        ll.remove(5);
        
        //System.out.println("After Removing element at Index 5 : "+ll);
        
        ll.remove("Yogi");
        //System.out.println("After Removing element Yogi : "+ll);
        
        LinkedList<String> ll1 = new LinkedList<String>();
        ll1.add("Hyd");
        ll1.add("Bang");
        
        ll.addAll(ll1);        
        //System.out.println("After Adding list 1 to list : "+ll);
        
        ll.removeAll(ll1);
        //System.out.println("After removing list 1 from list : "+ll);
        
        ll.removeFirst();
        ll.removeLast();        
        System.out.println("After removing first and Last element : "+ll);
        
        ll.add(2,"Satya");
        ll.add(4,"Satya");
        System.out.println("After addition : "+ll);
        
        ll.removeFirstOccurrence("Satya");
        System.out.println("After first occurance removal of Satya : "+ll);
        
        ll.removeLastOccurrence("Satya");
        System.out.println("After Last occurance removal of Satya : "+ll);
        
        ll.clear();
        System.out.println("After Clear : "+ll);
        
	}

}
