package collect;
import java.util.*;

public class LinkedHashSetEx 
{
	public static void main(String[] args) 
	{		
		LinkedHashSet <String> set = new LinkedHashSet <String>();
		
		set.add("Akhilesh");
		set.add("Akhil");
		set.add("");
		set.add("Rajesh");
		set.add("Satya");
		set.add("Akhil");
		
		
		Iterator <String> itr = set.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());     //Maintains Insertion Order
		}		

	}

}
