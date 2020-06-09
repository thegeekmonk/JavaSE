package com.java.jdbc.rowset;

import javax.sql.RowSetEvent;
import javax.sql.RowSetListener;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class TestJdbcRowset_Event 
{

	public static void main(String[] args) 
	{
		try 
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			JdbcRowSet rs = RowSetProvider.newFactory().createJdbcRowSet();
			
			rs.setUrl("jdbc:oracle:thin:@localhost:1521:oracle");
			rs.setUsername("sys as sysdba");
			rs.setPassword("5441");
			
			
			rs.addRowSetListener(new MyListener());
			rs.setCommand("select *from friend");
			rs.execute();
			
			while(rs.next())
			{
				System.out.println(rs.getString(1)+" ");
		    	System.out.println(rs.getString(2)+" ");
		    	System.out.println(rs.getString(3));
			}
			
			
		} 
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}


class MyListener implements RowSetListener
{
	public void cursorMoved(RowSetEvent e)
	{
		System.out.println("Cursor has Moved");
	}
	
	public void rowChanged(RowSetEvent e)
	{
		System.out.println("Row Changed");
	}
	
	public void rowSetChanged(RowSetEvent e)
	{
		System.out.println("RowSet Changed");
	}
}
