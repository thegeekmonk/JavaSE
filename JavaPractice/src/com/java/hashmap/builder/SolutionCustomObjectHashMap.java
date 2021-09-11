package com.java.hashmap.builder;

import java.util.Date;
import java.util.HashMap;

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
			
			public EmployeeBuilder()
			{
				
			}
			
			public static EmployeeBuilder anEmployee()
			{
				return new EmployeeBuilder();
			}
			
			public static EmployeeBuilder anEmployee(Employee employee)
			{
				return anEmployee().withId(employee.id).withName(employee.name).withSalary(employee.salary).withDOB(employee.dob);
			}
			
			public EmployeeBuilder withId(long id)
			{
				this.id = id;
				return this;
			}		
			public EmployeeBuilder withName(String name)
			{
				this.name = name;
				return this;
			}
			public EmployeeBuilder withSalary(Double salary)
			{
				this.salary = salary;
				return this;
			}
			public EmployeeBuilder withDOB(Date dob)
			{
				this.dob = dob;
				return this;
			}	
			
			public Employee build()
			{
				return new Employee(this);
			}
		}	
}

public class SolutionCustomObjectHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Employee, String> employeeMap = new HashMap<Employee, String>();
		
		Employee e1 = Employee.EmployeeBuilder.anEmployee().withId(1).withName("Sachin").withDOB(new Date(1987,2,1)).withSalary(1000d).build();
		
		employeeMap.put(e1, "India");
		
		System.out.println(employeeMap.get(e1));
		
		
	}

}
