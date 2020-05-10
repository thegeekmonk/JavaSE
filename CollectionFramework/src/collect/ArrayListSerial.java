package collect;

import java.util.*;
import java.io.*;

public class ArrayListSerial 
{

	public static void main(String[] args) 
	{
		ArrayList<String> al = new ArrayList<String>(); 
		
		al.add("Akhilesh");
		al.add("Satya");
		al.add("Akhil");		
		
		System.out.println("Before serialization :-");		
		System.out.println(al);
			
		try
		{   
			//Serialization of Object
			
			FileOutputStream fos = new FileOutputStream("file");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(al);
			
			
			fos.close();
			oos.close();
			
			FileInputStream fis = new FileInputStream("file");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			ArrayList al1 = (ArrayList)ois.readObject();
			
			System.out.println("After De-serialization :-");			
			System.out.println(al1);
			
			fis.close();
			ois.close();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
