/**
 * 
 */
package bean;
import java.sql.*;

//import bean.ConnectionProvider.*;
//import bean.Provider.*;

/**
 * @author AkhileshPC
 *
 */
public class RegisterDAO 
{
	
	
	public static int register(User u)
	{
		int status = 0;
		
		try
		{
			Connection con = ConnectionProvider.getCon();
			
			PreparedStatement ps = con.prepareStatement("Insert into coders values(?,?,?)");
			ps.setString(1,u.getName());
			ps.setString(2,u.getEmail());
			ps.setString(3,u.getPassword());
			 
			status = ps.executeUpdate();
			
			//if(status != 0)
				//out.print("Record added successfully !");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return status;
	}

}
