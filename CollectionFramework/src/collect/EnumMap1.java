package collect;
import java.util.*;

public class EnumMap1 
{  
	public enum Days {MONDAY,TUESDAY,WEDNESDAY,THRUSDAY}

	public static void main(String[] args) 
	{
		EnumMap<Days,String> em = new EnumMap<Days,String>(Days.class);
		
		em.put(Days.MONDAY,"1");
		em.put(Days.TUESDAY,"2");
		em.put(Days.WEDNESDAY,"3");
		
		System.out.println("EnumMap Entry : ");
		for(Map.Entry m : em.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
			
			
		}

	}

}
