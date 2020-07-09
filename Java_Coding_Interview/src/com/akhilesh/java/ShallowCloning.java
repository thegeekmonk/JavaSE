package com.akhilesh.java;

class Employee
{
	 int id = 101;
	 String department = "Technology";
}

class Engineer implements Cloneable
{
	 String name = "Akhilesh Kumar";
	
	 Employee e;
	
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}	
	
}

public class ShallowCloning {

	public static void main(String[] args) throws CloneNotSupportedException 
	{
		Engineer e1 = new Engineer();
		
		Engineer e2 = (Engineer)e1.clone();

	}

}
