package collect;

import java.util.*;

class Student 
{
	String name;
	int roll;
	int age;
	
	Student(String name,int roll,int age)
	{
		this.name = name;
		this.roll = roll;
		this.age = age;
	}
}

public class ArrayListUserdefined 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Student s1 = new Student("Akhilesh",101,27);
		Student s2 = new Student("Satya",201,26);
		Student s3 = new Student("Aditya",301,29);
		
		ArrayList <Student> list = new ArrayList <Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
				
		Iterator <Student> itr = list.iterator();
		
		while(itr.hasNext())
		{
			Student st = (Student)itr.next();
			
			System.out.println(st.name+" "+st.roll+" "+st.age);
		}

	}

}
