package com.java.se.string;

public class StringTest1 
{

	public StringTest1() 
	{
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		String s1 = "Sachin";
		String s2 = new String("Sachin");
		
		//comparing the content of both string using equals() method
		System.out.println("Both String are Equal : "+s1.equals(s2)); 
		
		//comparing string using '==' operator 
		System.out.println("Checking if s1 == s2 "+s1==s2);
		
		
		
		

	}

}
