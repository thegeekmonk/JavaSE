package com.java.hashmap.builder;

import java.util.Date;

final class Employee
{
	 private final long id;
	 private final String name;
	 private final Double salary;
	 private final Date dob;
	 
	 public Employee(EmployeeBuilder employeeBuilder)
	 {
		 this.id = employeeBuilder.id;
		 this.name = employeeBuilder.name;
		 this.salary = employeeBuilder.salary;
		 this.dob = employeeBuilder.dob;		 
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
		
		
		static final class EmployeeBuilder
		{
			private long id;
			private String name;
			private Double salary;
			private Date dob;
			
		}
		
	
	
}




public class SolutionCustomObjectHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
