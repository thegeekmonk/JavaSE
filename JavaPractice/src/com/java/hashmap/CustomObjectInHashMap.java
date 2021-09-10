package com.java.hashmap;

import java.util.Date;
import java.util.HashMap;

class Employee
{
	private int id;
	private String name;
	private float salary;
	private Date dob;
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setSalary(float salary)
	{
		this.salary = salary;
	}
	
	public void setDob(Date dob)
	{
		this.dob = dob;
	}
	
	public int getId()
	{
		return id;
	}
	
	public String getName()
	{
		return name;
	}
	
	public float getSalary()
	{
		return salary;
	}
	
	public Date getDob()
	{
		return dob;
	}
}



public class CustomObjectInHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	HashMap<Employee,String> employeeHashMap = new HashMap<>();
	
	Employee e1 = new Employee();
	e1.setId(1);
	e1.setName("Sachin");
	e1.setSalary(1001.2f);
	e1.setDob(new Date(1987,2,1));
	
	employeeHashMap.put(e1, "India");
	
	Employee e2 = new Employee();
	e2.setId(1);
	e2.setName("Sachin");
	e2.setSalary(1001.2f);
	e2.setDob(new Date(1987,2,1));
	
	employeeHashMap.put(e2, "Japan");
	
	System.out.println(employeeHashMap.get(e1));	
	System.out.println(employeeHashMap);
	
	System.out.println("Employee1 hashcode : "+e1.hashCode());
	System.out.println("Employee2 hashcode : "+e2.hashCode());
	
	}

}
