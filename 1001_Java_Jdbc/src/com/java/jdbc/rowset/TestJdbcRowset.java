package com.java.jdbc.rowset;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class TestJdbcRowset 
{

	public static void main(String[] args) 
	{
		
		try 
		{
		    Class.forName("oracle.jdbc.driver.OracleDriver");
		    //Connection con = DriverManager.getConnection("jdbc:oracle:thin@localhost:sys as sysdba/5441:1521:oracle");
		    
		    JdbcRowSet rs = RowSetProvider.newFactory().createJdbcRowSet();
		    
		    rs.setUrl("jdbc:oracle:thin:@localhost:1521:oracle");
		    
		    //rs.setUrl("jdbc:oracle:thin@localhost:sys as sysdba/5441:1521:oracle");
		    rs.setUsername("sys as sysdba");
		    rs.setPassword("5441");
		    
		    rs.setCommand("select *from friend");
		    
		    rs.execute();
		    
		    while(rs.next())
		    {
		    	System.out.print(rs.getString(1)+" ");
		    	System.out.print(rs.getString(2)+" ");
		    	System.out.println(rs.getString(3));
		    }
		    
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
