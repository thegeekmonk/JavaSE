package collect;
import java.util.*;

class BookE
{
	int id;
	String name;
	
	BookE(int id,String name)
	{
		this.id = id;
		this.name = name;
	}
		
}

public class EnumMapBook 
{
   
	public enum Key {ONE,TWO,THREE}
	
	public static void main(String[] args) 
	{
		 BookE b1 = new BookE(101,"Spring");
		 BookE b2 = new BookE(301,"Java");
		 BookE b3 = new BookE(501,"Algo");
		 
		 EnumMap<Key,BookE> em = new EnumMap<Key,BookE>(Key.class);
		 
		 em.put(Key.ONE,b2);
		 em.put(Key.TWO,b1);
		 em.put(Key.THREE,b3);
		 
		 for(Map.Entry<Key,BookE> m  : em.entrySet())
		 {
			 BookE b = m.getValue();
			 System.out.println(b.id+" "+b.name);
		 }

	}

}
