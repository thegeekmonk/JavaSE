package practice.java;

import java.util.HashMap;

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

    HashMap<Character,CountIndex> hm = new HashMap<Character,CountIndex>(MAX_COUNT);
	
	
	public void getCountArray(String str)
	{
		for(int i = 0;i < str.length();i++)
		{
			
		}
	}
	
	
	

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
        
		
	}

}
