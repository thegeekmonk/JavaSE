package collect;
import java.util.*;

public class HashSet1 
{
	public static void main(String[] args) 
	{
		HashSet<String> hs = new HashSet<String>();		
		hs.add("Akhil");
		hs.add("Ravi");
		hs.add("Aditya");
		hs.add("Ravi");
		
		System.out.println(hs);
		
		//hs.remove("Ravi");
		
		//System.out.println("After Remove method\n");
		//System.out.println(hs);
		
		HashSet<String> set = new HashSet<String>();
		set.add("Baba");
		set.add("Rohith");
		set.add("Vemula");
		
		System.out.println(set);
		
		hs.addAll(set);
		System.out.println("\nAfter adding set to hs :-");
		System.out.println(hs);
		
		hs.removeAll(set);
		System.out.println("\nAfter removing set from hs :-");
		System.out.println(hs);
		
		hs.removeIf(str->str.contains("Ravi"));
		System.out.println("\nAfter removing Ravi from hs :-");
		System.out.println(hs);
		
        hs.clear();
        System.out.println("\nAfter invoking clear method on hs :-");
		System.out.println(hs);
        
	}

}
