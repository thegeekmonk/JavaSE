package collect;
import java.util.*;

public class HashSetEx 
{

	public static void main(String[] args) 
	{
		
		HashSet <String> hs = new HashSet <String>();
		
		hs.add("Akhilesh");
		hs.add("Akhil");
		hs.add("Rajesh");
		hs.add(" ");
		hs.add("Satya");
		hs.add("Akhil");
		
		Iterator <String> itr = hs.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());   //HashSet doesn't maintain Insertion Order
		}

	}

}
