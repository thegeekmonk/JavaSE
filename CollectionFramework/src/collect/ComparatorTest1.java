package collect;
import java.util.*;
import collect.*;

class StudentA
{
	int id;
	String name;
	
	StudentA(int id,String name)
	{
		this.id = id;
		this.name = name;
	}
	
	public int getId()
	{
		return id;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
		
}

class IdComparator implements Comparator<StudentA>
{
	
	public int compare(StudentA s1,StudentA s2)
	{
		if(s1.id > s2.id)
			return 1;
		else if(s1.id < s2.id)
			return -1;
		else
			return 0;				
	}
		
}

class NameComparator implements Comparator<StudentA>
{
	public int compare(StudentA s1,StudentA s2)
	{
		return s1.name.compareTo(s2.name);
	}
}

public class ComparatorTest1 
{

	public static void main(String[] args) 
	{
		StudentA s1 = new StudentA(101,"Akhilesh");
		StudentA s2 = new StudentA(201,"Rohith");
		StudentA s3 = new StudentA(301,"Satya");
		StudentA s4 = new StudentA(105,"Vivek");
		
		
		List<StudentA> list = new ArrayList<StudentA>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		
		
		System.out.println("Sorting By ID :-");
		Collections.sort(list,new IdComparator());
		
		for(StudentA s : list)
			System.out.println(s.id+" "+s.name);	
		
		System.out.println("\nSorting By Name :-");
		Collections.sort(list,new NameComparator());
		
		for(StudentA s : list)
			System.out.println(s.id+" "+s.name);
		
		
		//Using Java8 feature
		
		//Comparator<StudentA> cm = Comparator.comparing(StudentA::getId());

	}

}
