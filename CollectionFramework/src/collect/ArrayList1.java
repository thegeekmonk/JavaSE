package collect;

import java.util.*;

public class ArrayList1 
{

	public static void main(String[] args) 
	{
         ArrayList<String> al = new ArrayList<String>();
         
         al.add("Ajay");
         al.add("Akhil");
         al.add("Vijay");
         al.add("Ramesh");
         
         ArrayList<String> al2 = new ArrayList<String>();
         
         al2.add("Mohan");
         al2.add("Satya");
         al2.add("Rupesh");
         al2.add("Akhil");
         
         
         al.addAll(al2);
         System.out.println("After Adding al2 into al : "+al);
         
         ArrayList<String> al3 = new ArrayList<String>();
         
         al3.add("Baba");
         
         al2.addAll(0,al3);
         System.out.println("After Adding al3 into al2 : "+al2);
         
         
         //al.addAll(0,al2);
         
         
         al.retainAll(al2);        
         System.out.println("After Retaining al2 : "+al);
         
         
         al3.remove("Baba");
         System.out.println("After Removal of element from Al3 : "+al3);
         System.out.println("Checking Al3 if it is Empty : "+al3.isEmpty());
         
         
         //System.out.println(" al2 : "+al2);
         al2.removeIf(str->str.contains("Mohan"));
         System.out.println("After Removal of element Mohan from Al2 : "+al2);


	}

}
