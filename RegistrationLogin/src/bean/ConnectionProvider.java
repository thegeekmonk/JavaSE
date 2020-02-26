/**
 * 
 */
package bean;
import static bean.Provider.*;
import java.sql.*;

/**
 * @author AkhileshPC
 *
 */
public class ConnectionProvider 
{
	private static Connection con = null;
	
	static
	{
		try
		{
			Class.forName(DRIVER);
			//con = DriverManager.getConnection(CONNECTION_URL,USERNAME,PASSWORD);
			
			con = DriverManager.getConnection(CONNECTION_URL);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static Connection getCon()
	{
		return con;
	}

}
