package bean;

import java.sql.*;

public class LoginDAO 
{
	
  public static boolean validate(LoginBean b)
  {
	  boolean status = false;
	  
	  try
	  {
		  Connection con = ConnectionProvider.getCon();
		  PreparedStatement ps = con.prepareStatement("select *from coders where email = ? and password = ?" );
		  
		  ps.setString(1,b.getEmail());
		  ps.setString(2,b.getPassword());
		  
		  ResultSet rs = ps.executeQuery();		  
		  status = rs.next();	  
		  
	  }
	  catch(Exception e)
	  {
		  e.printStackTrace();
	  }
	  return status;  
	 	  
  }
		
      
}
