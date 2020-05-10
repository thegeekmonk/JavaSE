package practice;
import java.util.*;

public class ListTest1	
{
	public static void main(String[] args) 
	{
		List<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		
		List<String> list2 = new ArrayList<String>();
		list2.add("X");
		list2.add("Y");
		list2.add("A");
		
		for(int i = 0;i < list.size();i++)
		{
			if(!list2.contains(list.get(i)))
             {
	              System.out.println(list.get(i));
             }
		}

	}

}
