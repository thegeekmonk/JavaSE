package collect;
import java.util.*;

public class TreeSet1 
{
	public static void main(String[] args) 
	{
		TreeSet<String> ts = new TreeSet<String>();
		
		ts.add("Akhil");
		ts.add("Aditya");
		ts.add("Rohith");
		ts.add("Satya");
				
		System.out.println(ts);		
		System.out.println("\n");
        
		String str = ts.first();		
		System.out.println("First Element : "+str);
		System.out.println("Last Element : "+ts.last());
		
		Iterator<String> itr = ts.descendingIterator();
		
		while(itr.hasNext())
			System.out.println(itr.next());
							
		String f = ts.pollFirst();
		String l = ts.pollLast();
		
		System.out.println(ts);
	}

}
