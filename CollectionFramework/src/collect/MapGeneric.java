package collect;
import java.util.*;

public class MapGeneric 
{
	public static void main(String[] args) 
	{
		Map<Integer,String> map = new HashMap<Integer,String>();
		
		map.put(1,"Amit");
		map.put(2,"Akhil");
		map.put(5,"Satya");
		
		//Set set = map.entrySet();
        
		for(Map.Entry m : map.entrySet())
			System.out.println(m.getKey()+" "+m.getValue());
	}

}
