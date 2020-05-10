package code.java.hackerrank;

import java.util.*;

public class ArrayListEx1 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		ArrayList list[] = new ArrayList[n];
		
	    for(int i = 0;i < n;i++)
	    {   
	    	int d = sc.nextInt();
	    	
	    	list[i].add(Integer.valueOf(d));
	    	
	    	//int j = d;
	    	while(d > 0)
	    	{ 
	    	   Integer data = sc.nextInt();	
	    	   list[i].add(data);
	    	   
	    	   d--;
	    	}	    	
	    }
	    
	    int q = sc.nextInt();
	    
	    int x[] = new int[q];
	    int y[] = new int[q];
		
	    //ArrayList<Integer> list[] = new ArrayList<Integer>()[n];
		
	    for(int k = 0;k < q;k++)
	    {
	    	x[k] = sc.nextInt();
	    	y[k] = sc.nextInt();
	    }
	    
	    for(int k = 0;k < q;k++)
	    {
	    	//if(list[x[k]].get(y[k])) != null)
	    	
	    	if(y[k] > (list[x[k]].size()))
	    		System.out.println("ERROR!");
	    	
	    	else
	    	{
	    		System.out.println(list[x[k]].get(y[k]));
	    	}
	    	
	    }
		
       sc.close();
	}

}
