package com.akhilesh.java;

class Empl
{
	 int id;
	 String department;
	 
//	public Employee() 
//	{
//		super();
//		id = 101;
//		department = "Technology";
//	}
//	 
	 
}

class Engg implements Cloneable
{
	 String name;
	 
//	 = "Akhilesh Kumar";
	
	Empl e = new Empl();
	
	public Object clone() throws CloneNotSupportedException
	{   
		Engg eg = (Engg)super.clone();
		
		eg.e = new Empl();
				
		return eg;		
	}	
	
}

public class DeepCloning 
{

	public static void main(String[] args) throws CloneNotSupportedException 
	{
		Engineer e1 = new Engineer();
		
		e1.name = "Akhilesh";
		e1.e.id = 101;
		e1.e.department = "technology";		
		
		Engineer e2 = (Engineer)e1.clone();
		
//		e2.e.department = "cloud";  //testing Deep cloning feature
		
	    System.out.println("Original Object --> ID : "+e1.e.id+" Department : "+e1.e.department+" Name : "+e1.name);
	    
	    System.out.println("Cloned Object --> ID : "+e2.e.id+" Department : "+e2.e.department+" Name : "+e2.name);

	}

}

