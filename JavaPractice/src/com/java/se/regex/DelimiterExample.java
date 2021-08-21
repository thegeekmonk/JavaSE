package com.java.se.regex;

import java.util.Scanner;

public class DelimiterExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		//String str1 = "Java is a !good programming language";
		
		//String str1 = "If you don't like something,change.it."; 
		
		String str1 = "He is a very very good boy, isn't he?";
		
//		Scanner sc = new Scanner(str1);
//		
//		while(sc.hasNext())
//		{
//			System.out.println(sc.next());
//		}
		
		//String arr[] = str1.split("[,.']");
		
//		String arr[] = str1.split(" ",-4);
		
		String arr[] = str1.split("[!,?._'@\\s]+");
		
		System.out.println(arr.length);
		
		for(String str : arr)
		{
		   System.out.println(str);
		}		
	}
}
