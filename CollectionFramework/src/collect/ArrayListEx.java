package collect;

import java.util.*;

public class ArrayListEx 
{

	public static void main(String[] args) 
	{
		
		ArrayList <String> al = new ArrayList <String>();
		String e;
		
		al.add("Akhilesh");
		al.add("Akhil");
		al.add(2,"Rajesh");
		al.add("Rupesh");
		al.add(3,"Satya");
		//al.add(5);
		
		e = al.get(0);

		System.out.println(al);		
		System.out.println("0th Index Element :  "+e);
		
		
		System.out.println("\n");
		
		
		//Traversing using List Interface		
		System.out.println("Traversing using List Interface :-");
		
		ListIterator <String> ltr = al.listIterator(al.size());
		
		while(ltr.hasPrevious())
		{
			//String str = ltr.previous();
			
			System.out.println(ltr.previous());
		}		  
		  
		System.out.println("\n");  
		
		//Traversing using For-each-loop		
		System.out.println("Traversing using For-Each Loop :-");	
		for(String str : al)
		 System.out.println(str);
		
		System.out.println("\n");
		
		//Traversing using For Loop		
		System.out.println("Traversing using For Loop :-");
		for(int i = 0;i < al.size();i++)
		 System.out.println(al.get(i));
		
		System.out.println("\n");
		
		//Traversing using forEach Method
		System.out.println("Traversing Using forEach() Method :-");
		al.forEach(a->
		            {
					System.out.println(a);
					}
				);
		
		System.out.println("\n");
		
		//Traversing using forEachRemaining() Method
		System.out.println("Traversing Using forEachRemaining() Method :-");
		Iterator <String> itr = al.iterator();
		
		itr.forEachRemaining(a->
		                       {
		                    	 System.out.println(a);   
		                       }
		                       );
		
		
	}

}
