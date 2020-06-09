package com.java.jdbc.callable;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class TestCallableStatement 
{

	public static void main(String[] args) 
	{
		try 
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:sys as sysdba/5441@localhost:1521:oracle");
			
			CallableStatement stmt = con.prepareCall("{?= call sum2(?,?)}");
			stmt.setInt(2,12);
			stmt.setInt(3,34);
			
			stmt.registerOutParameter(1,Types.INTEGER);
			
			stmt.execute();
			
			System.out.println("Using Callable Statement : "+stmt.getInt(1));
			
		} 
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
