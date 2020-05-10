package collect;
import java.util.*;

public class TreeSet2 
{   
	public static void main(String[] args) 
	{
		TreeSet<String> ts = new TreeSet<String>();
		
		ts.add("A");
		ts.add("D");
		ts.add("F");
		ts.add("B");
		ts.add("C");
		ts.add("E");
		
		System.out.println("Sorted Set Methods Example :-\n");
		System.out.println("Sorted Headset Method : "+ts.headSet("C"));
		System.out.println("Sorted TailSet Method : "+ts.tailSet("B"));
		System.out.println("Sorted SubSet Method :"+ts.subSet("B","F"));
		
		System.out.println("\nNevigableSet Methods Example :-\n");
		System.out.println("NevigableSet headSet Method : "+ts.headSet("C",true));
		System.out.println("NevigableSet tailSet Method :"+ts.tailSet("D",false));
		System.out.println("NevigableSet SubSet Method :"+ts.subSet("B",false,"E",true));

	}

}
