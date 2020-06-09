package com.java.jdbc.rowset;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class TestRowset 
{

	public static void main(String[] args) 
	{
				
		try 
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");			
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:sys as sysdba/5441@localhost:1521:oracle");						
			PreparedStatement ps = con.prepareStatement("insert into friend values(?,?,?)");
			
			con.setAutoCommit(false);
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));						
			
			
			while(true)
			{   
				System.out.print("Enter the ID : ");
				int id = Integer.parseInt(br.readLine());
				
				System.out.print("Enter Name : ");
				String name = br.readLine();
				
				System.out.print("Enter Age : ");
				int age = Integer.parseInt(br.readLine());
				
				ps.setInt(1,id);
				ps.setString(2,name);
				ps.setInt(3,age);
				
				ps.executeUpdate();
				//con.commit();
				
				System.out.println("Record added successfully !");
				
				
				
				System.out.print("Want to continue y/n : ");
				String ans = br.readLine();
				
				if(ans.equals("n"))
					break;
				else
					con.commit();
				
				
			}
			
			
		con.close();	
			
		}catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
