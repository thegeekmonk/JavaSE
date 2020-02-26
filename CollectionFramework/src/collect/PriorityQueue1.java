package collect;
import java.util.*;

public class PriorityQueue1 
{
	public static void main(String[] args) 
	{
		Queue<String> qu = new PriorityQueue<String>();
		
		qu.add("Akhil");
		qu.add("Rohith");
		qu.offer("Aditya");
		qu.offer("Satya");
		
		System.out.println(qu);
		
		System.out.println("Poll : "+qu.poll());
		System.out.println("After Poll : "+qu);
		
		System.out.println("Element Method : "+qu.element());
		System.out.println("Peek Method : "+qu.peek());
		
		System.out.println(qu);
		
		qu.remove();
		System.out.println(qu);
		
		qu.poll();
		System.out.println(qu);
				
 
	}

}
