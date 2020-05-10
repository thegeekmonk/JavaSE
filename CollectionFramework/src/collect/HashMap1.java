package collect;
import java.util.*;

public class HashMap1 
{
	public static void main(String[] args) 
	{
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		
		hm.put(101,"Akhilesh");
		hm.put(301,"Akhil");
		hm.put(501,"Satya");
		hm.put(601,"Rohith");
		
		System.out.println("Traversal Of Map :-");
		
		for(Map.Entry map : hm.entrySet())
			System.out.println(map.getKey()+" "+map.getValue());
		
		HashMap<Integer,String> hp = new HashMap<Integer,String>();
		
		hp.putIfAbsent(402,"Baba");
		hp.put(801,"Rupesh");
		
		hm.putAll(hp);
		
		hm.replace(101,"Spring");		
		String x = hm.get(101);
		
		System.out.println("New Value : "+x);
		
		hm.replace(402,"Baba","Aditya");
				
		
		System.out.println("\nAfter Replacing Value on Key 402 :-");
		String h = hm.get(402);
		System.out.println("New Value for key 402 : "+h);
        
		System.out.println("Size of Map is : "+hm.size());
		
		
		hm.remove(402);
		System.out.println("\nUpdated Map is : "+hm);
		
		hm.remove(801,"Rupesh");
		System.out.println("\nUpdated Map is : "+hm);
		
		hm.replaceAll((K,V)->"Spring");
		System.out.println("\nUpdated Map is : "+hm);
		
		
	}

}
