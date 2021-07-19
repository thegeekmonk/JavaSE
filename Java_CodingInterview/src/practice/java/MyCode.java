package practice.java;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

class MyCode 
{
	public static void main (String[] args) 
	{
		System.out.println("Hello Java");
        int input1[]={1,1,1,5,5,5,6,6,6,7,7};
    
    Map<Integer,Integer> result = new HashMap<Integer,Integer>();
    
    for(int i=0;i<input1.length;i++)
    {
      
      if(result.containsKey(input1[i])){
        result.put(input1[i],result.get(input1[i])+1);
      }
      else
      {
        result.put(input1[i],1);
      }
      
      
    }   
    
//        List<Integer> r  =  result.stream().filter(s->s.get() < 3).collect(s.key());		
   }
	
//	SDK Platform Android 10, API 29, revision 4
	
//	List<Integer> r  =  result.stream().filter(s->s.get() < 3).collect(s.key());

	
}	
