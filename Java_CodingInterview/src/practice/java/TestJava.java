package practice.java;

public class TestJava
{
	public static void main()
	{
	    int a[] = {7,5,6,8,9,3};
	 
	    int max = a[0];
	    int secMax = 0;
	    
	    for(int i=1;i<a.length;i++)
	    {
	      if(max<a[i])
	      {
	        secMax=max;
	        max=a[i];
	      }
	      else 
	      {
	         if(secMax==0)
	         {
	           secMax=a[i];
	         }
	         else if(secMax<a[i])
	         {
	           secMax=a[i];
	         }
	      }
	    }
	    System.out.println(secMax);
	    
	}  
	
	class MyCode {
		public static void main (String[] args) {
			System.out.println("Hello Java");
	    int input1[]={1,1,1,5,5,5,6,6,6,7,7};
	    
	    Map<Integer,Integer> result = new HashMap<Integer,Integer>();
	    for(int i=0;i<input1.length;i++){
	      
	      if(result.containsKey(input1[i])){
	        result.put(input1[i],result.get(input1[i])+1);
	      }else{
	        result.put(input1[i],1);
	      }
	      
	    }
	    
	    
	    List<Integer> r= result.stream().filter(s->s.get()<3).Collect(s.key());
	
	
		
}