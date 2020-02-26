package collect;
import java.util.*;

public class ArrayDeque1 
{

	public static void main(String[] args) 
	{
		Deque<String> dq = new ArrayDeque<String>();
		
		dq.add("Akhil");
		dq.add("Aditya");
		dq.add("Satya");
		dq.add("Rohith");
		
		System.out.println("Traversing :-");
		System.out.println(dq);
		
		dq.addFirst("Coder");
		dq.addLast("Baba");
		
		System.out.println("\nAfter Addition Traversing printing ");
		System.out.println(dq);
		
		dq.pollLast();
		
		System.out.println("\nAfter Polling Last element printing ");
		System.out.println(dq);
		

	}

}
