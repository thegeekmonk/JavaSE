package com.java.se.regex;

import java.util.regex.Pattern;

public class RegexCharacterClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		boolean b = Pattern.matches("[amn]{1}","amn");
		
		System.out.println("Result : "+b);
		
	}

}
