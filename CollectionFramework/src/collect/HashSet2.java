package collect;

import java.util.*;

public class HashSet2 
{

	public static void main(String[] args) 
	{
		HashSet<String> hs = new HashSet<String>();
		hs.add("Akhil");
		hs.add("Rohith");
		
		HashSet<String> set = new HashSet<String>(hs);
		
		set.add("Baba");
		System.out.println("New HashSet : "+set);

	}

}
