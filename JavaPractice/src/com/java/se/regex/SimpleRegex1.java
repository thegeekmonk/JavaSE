package com.java.se.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SimpleRegex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		Pattern p = Pattern.compile("..d");
		Matcher m = p.matcher("788");
		
		boolean b = m.matches();		
		System.out.println("Result : "+b);
	}

}
