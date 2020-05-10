/**
 * 
 */
package bean;

/**
 * @author AkhileshPC
 *
 */
public interface Provider 
{
	String DRIVER = "oracle.jdbc.driver.OracleDriver";
    //String CONNECTION_URL = "jdbc:oracle:thin@localhost:1521:oracle";
    
    String CONNECTION_URL = "jdbc:oracle:thin:sys as sysdba/5441@localhost:1521:oracle";
    
	//String USERNAME = "sys as sysdba";
	//String PASSWORD ="5441";

}
