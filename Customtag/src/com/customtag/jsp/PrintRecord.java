/**
 * 
 */
package com.customtag.jsp;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;
import java.sql.*;

/**
 * @author AkhileshPC
 *
 */
public class PrintRecord extends TagSupport
{
   
	private String table;
	private String id;
	
	public void setTable(String table)
	{
		this.table = table;
	}
	
	/*public void setId(String id)
	{
		this.id = id;
	} */
	
	
	public int doStartTag() throws JspException
	{
		JspWriter out = pageContext.getOut();
		
		try
		{   
			//step1 load the driver class
			//Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//step2 create  the connection object
			//Connection con = DriverManager.getConnection("jdbc:oracle:thin:sys as sysdba/5441@localhost:1521:oracle");
			
		     Class.forName("oracle.jdbc.driver.OracleDriver");
			 Connection con = DriverManager.getConnection("jdbc:oracle:thin:sys as sysdba/5441@localhost:1521:oracle");
			
			
			//step3 create the statement object
			PreparedStatement ps = con.prepareStatement("select *from friend");	
			
			//ps.setInt(1,Integer.parseInt(id));
			ResultSet rs = ps.executeQuery();
			
			if(rs != null)
			{
			    ResultSetMetaData rsmd = rs.getMetaData();			
			    int totalColumn = rsmd.getColumnCount();
			    
			   
			    //printing column name
			    out.write("<table border = '2'>");
			    
			    out.write("<tr>");			    
			    for(int i = 1;i <= totalColumn;i++)
			    {
			    	out.write("<th>"+rsmd.getColumnName(i)+"</th>");  //printing table heading with <td> element
			    } 
			    out.write("</tr>");
			   
			    
			    while(rs.next())
			    { 	
			    //printing column value
			    out.write("<tr>");
			    for(int i = 1;i <= totalColumn;i++)
			    {
			        out.write("<td>"+rs.getString(i)+"</td>");       //printing table column value/data with <td> element
			    }		    
			    out.write("</tr>");
			    
			    }
			    //else
			    	//out.write("Table id "+id+ "doesnot exist");
			    	
			   			   			   			   
			    out.write("</table>");
			
			}
						
			con.close();
				
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
								
		return SKIP_BODY;
	}	
		
}
