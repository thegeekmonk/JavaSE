package collect;

import java.util.*;

public class ListIteratorEx 
{

	public static void main(String[] args) 
	{
		
		List<String> l = new ArrayList<String>();
		
		l.add("Akhil");
		l.add("Amit");
		l.add("Satya");
		l.add("Rohith");
		l.add("Aditya");
		
		ListIterator<String> lr = l.listIterator();
		
		/*while(lr.hasNext())
			System.out.println("Index : "+lr.nextIndex()+" "+lr.next());
		
		
		System.out.println("Traversing Reverse Order :-\n");
		while(lr.hasPrevious())
			System.out.println("Index : "+lr.previousIndex()+" "+lr.previous());
		
		
		System.out.println("After Change :-\n");
		
		*/
		
		String str = lr.next();
		System.out.println("Returned :  "+str);
		
		
		lr.remove();
		System.out.println("After Change :-\n");
		while(lr.hasPrevious())
			System.out.println("Index : "+lr.previousIndex()+" "+lr.previous());
				
		
	}

}
