package practice.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

class CountIndex
{
	 int count;
	 int index;
	 
	 //Initialization for 1st occurrence of character
	 public CountIndex(int index)
	 {
		 this.count = 1;
		 this.index = index;
	 }
	 
	 public void incCount()
	 {
		 this.count++;
	 }	 	 
}

public class FirstUniqueChar 
{   	
	static final int MAX_COUNT = 256;
    static HashMap<Character,CountIndex> hm = new HashMap<Character,CountIndex>(MAX_COUNT);	
	
	public static void getCountArray(String str)
	{
		for(int i = 0;i < str.length();i++)
		{
			  if(hm.containsKey(str.charAt(i)))
				  hm.get(str.charAt(i)).incCount();
			  else
			  {
				  //this is the 1st occurrence of char so store index as 'i' and count = 1
				  hm.put(str.charAt(i),new CountIndex(i));
			  }	  
		}
	}
	
	public static int firstNonRepetative(String str)
	{
		int result = Integer.MAX_VALUE;
		
		for(Map.Entry<Character, CountIndex> entry : hm.entrySet())
		{
			  int c = entry.getValue().count;
			  int ind = entry.getValue().index;
			  
			  if(c == 1 && ind < result )
				  result = ind;
			  
		}
		
		return result;
	}
		
	

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
        int index;        
		String str = "HelloH";
		
		getCountArray(str);
		
		index = firstNonRepetative(str);
		
		if(index == -1)
			System.out.println("Either String is EMPTY !! Or All are repetative Characters");
		else
			System.out.println("The Character is : "+str.charAt(index));
		
	}

}
