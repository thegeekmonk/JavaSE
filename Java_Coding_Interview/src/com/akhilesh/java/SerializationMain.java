package com.akhilesh.java;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationMain 
{

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub

		StudentSerialization st = new StudentSerialization(101,"Akhilesh Kumar",27);
		
		FileOutputStream fout = new FileOutputStream("E:\\student.txt");		
		ObjectOutputStream out = new ObjectOutputStream(fout);
		
		out.writeObject(st);
		
		out.flush();
		out.close();
		
		fout.close();
		
		System.out.println("Student Class Serialized Successfully !");
	}

}
