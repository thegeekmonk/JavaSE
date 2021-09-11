package com.java.hashmap.custom;

import java.util.Date;
import java.util.HashMap;

class Employee
{
	private int id;
	private String name;
	private Float salary;
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
	
	@Override
	public boolean equals(Object o)
	{
		if(o == this)
			return true;
		if(o == null ||getClass() != o.getClass())
			return false;
		
		Employee employee = (Employee)o;		
		if(id != employee.id)
			return false;
		if(name != null ? !name.equals(employee.name) : employee.name != null)
			return false;
		if(salary != 0 ? salary != employee.salary : employee.salary != 0)
			return false;
		if(dob != null ? !dob.equals(employee.dob) : employee.dob != null)
			return false;
				
		return true;
	}
	
	@Override
	public int hashCode()
	{
		int result = (int)(id^(id >>> 32));
		
		result = 31*result + (name != null ? name.hashCode() : 0);
		result = 31*result + (salary != 0 ? salary.hashCode() : 0);
		result = 31*result + (dob != null ? dob.hashCode() : 0);
		return result;
	}
	
}

public class EmployeeObjectKeyHashMap {

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
		
//		System.out.println(employeeHashMap.get(e1));	
//		System.out.println(employeeHashMap);
		
		System.out.println("Employee1 hashcode : "+e1.hashCode());
		System.out.println("Employee2 hashcode : "+e2.hashCode());

	}

}
