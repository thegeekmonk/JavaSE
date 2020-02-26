package collect;
import java.util.*;

class Bookp implements Comparable<Bookp>
{
	int id;
	String name;
	
	Bookp(int id,String name)
	{
		this.id = id;
		this.name = name;
	}
	
	public int compareTo(Bookp b)
	{
		if(id > b.id)
			return 1;
		else if(id < b.id)
			return -1;
		else 
			return 0;		
		
	}
}


public class PriorityQueueBook 
{

	public static void main(String[] args) 
	{
		Bookp b1 = new Bookp(101,"Java");
		Bookp b2 = new Bookp(301,"Spring");
		Bookp b3 = new Bookp(501,"Algorithm");
		Bookp b4 = new Bookp(201,"DS");
				
		PriorityQueue<Bookp> pq = new PriorityQueue<Bookp>();
		
		pq.add(b1);
		pq.add(b2);
		pq.add(b3);
		
        pq.offer(b4);
        
        System.out.println("Traversing Element :- ");
        for(Bookp b : pq)
        	System.out.println(b.id+" "+b.name);
        
        
        pq.poll();
        System.out.println("\nAfter Removal of Head Element :- ");
        for(Bookp b : pq)
        	System.out.println(b.id+" "+b.name);
        
	}

}
