package collect;
import java.util.*;

class BookH
{
	int id;
	String name;
	
	BookH(int id,String name)
	{
		this.id = id;
		this.name = name;
	}
}

public class HashMapBook 
{

	public static void main(String[] args) 
	{
		BookH b1 = new BookH(101,"Spring");
		BookH b2 = new BookH(301,"Data Structure");
		BookH b3 = new BookH(501,"Algorithm");
		BookH b4 = new BookH(302,"System Design");
		
		HashMap<Integer,BookH> hm = new HashMap<Integer,BookH>();
		
		hm.put(1,b1);
		hm.put(2,b2);
		hm.put(3,b3);
		hm.put(7,b4);
		
        for(Map.Entry<Integer,BookH> map : hm.entrySet())
        {
        	int id = map.getKey();
        	BookH b = map.getValue();
        	
        	System.out.println(id+" Details : "+b.id+" "+b.name);
        	
        }
	}

}
