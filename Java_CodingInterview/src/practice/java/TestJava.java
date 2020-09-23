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
 }	
	
	
	
		