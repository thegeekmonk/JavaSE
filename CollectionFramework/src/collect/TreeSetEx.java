package collect;
import java.util.*;

public class TreeSetEx
{
    
	public static void main(String[] args) 
	{
		TreeSet <String> set = new TreeSet <String>();
		
		set.add("Akhil");
		set.add("Raj");
		set.add("Anuj");
		set.add("Akhil");
		
		Iterator <String> itr = set.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
