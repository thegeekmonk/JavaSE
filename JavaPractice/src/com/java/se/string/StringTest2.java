package com.java.se.string;

public class StringTest2 
{

	public StringTest2()
	{
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		String a = "meow";
		String ab = a+"deal";
		
		String cd = a.concat("deal");
		
		String abc = "meowdeal";
		
		System.out.println("checking equality : "+ab.equals(abc));
		
		System.out.println("ab == abc : "+(ab == abc));
		
		System.out.println("cd == abc : "+(cd == abc));

	}

}
