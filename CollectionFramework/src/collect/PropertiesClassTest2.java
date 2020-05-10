package collect;
import java.util.*;
import java.io.*;

public class PropertiesClassTest2 
{
	public static void main(String[] args) throws Exception
	{
		Properties p = new Properties();
		
		p.setProperty("name","Akhilesh");
		p.setProperty("age","27");
		p.setProperty("skill", "Java");
		
		p.store(new FileWriter("akhilesh.properties"),"Akhilesh Information");
		
		Properties p1 = new Properties();		
		FileReader fr = new FileReader("akhilesh.properties");
		p1.load(fr);
		
		System.out.println("Printing properties from Akhilesh Properties File : ");
		
		System.out.println(p1.getProperty("name"));
		System.out.println(p1.getProperty("age"));
		System.out.println(p1.getProperty("skill"));
        
	}

}
