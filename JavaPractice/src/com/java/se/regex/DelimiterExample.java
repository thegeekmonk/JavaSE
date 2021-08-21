package com.java.se.regex;

import java.util.Scanner;

public class DelimiterExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		String str1 = "Java is a !good programming language";
		
//		Scanner sc = new Scanner(str1);
//		
//		while(sc.hasNext())
//		{
//			System.out.println(sc.next());
//		}
		
		String arr[] = str1.split("!");
		
		for(String str : arr)
		{
		   System.out.println(str);
		}
		
		
	}

}
