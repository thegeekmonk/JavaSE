package collect;
import java.util.*;

public class PropertiesClassTest1 
{
	public static void main(String[] args) throws Exception
	{
		Properties p = new Properties();
		
		p = System.getProperties();
		
		Set set = p.entrySet();
		
		Iterator itr = set.iterator();
		
		System.out.println("System Properties : -");
		while(itr.hasNext())
		{
			Map.Entry en = (Map.Entry)itr.next();			
			System.out.println(en.getKey()+"  -->  "+en.getValue());
			
		}
	}

}
