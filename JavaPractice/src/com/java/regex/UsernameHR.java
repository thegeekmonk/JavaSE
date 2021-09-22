package com.java.regex;

import java.util.regex.Pattern;

public class UsernameHR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Pattern.matches("[a-zA-z]\\w{7,29}","julia"));
		
		System.out.println(Pattern.matches("[a-zA-z]\\w{7,29}","Samantha"));
		
		System.out.println(Pattern.matches("[a-zA-z]\\w{7,29}","Samantha_21"));
		
		System.out.println(Pattern.compile("[AZ[a-z](a-z)"));
		
	}

}
