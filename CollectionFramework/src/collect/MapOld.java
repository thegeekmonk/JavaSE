package collect;
import java.util.*;

public class MapOld 
{
	public static void main(String[] args) 
	{
		Map map = new HashMap();
		
		map.put(1,"Amit");
		map.put(2,"Akhil");
		map.put(5,"Satya");
		map.put(7,"Aditya");
		
		Set set = map.entrySet();
		
		Iterator itr = set.iterator();
		
		while(itr.hasNext())
		{
			Map.Entry entry = (Map.Entry)itr.next();
			
			System.out.println(entry.getKey()+" "+entry.getValue());
		}		
		
	}

}
