package play.string;

import java.util.Scanner;

public class PalindromeStringRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		System.out.println("Is String "+str+" Palindrome : "+checkPalindrome(str));
	}
	
	static boolean checkPalindrome(String word)
	{
	    String reverseWord = getReverseWord(word);
		
	    if(word.equals(reverseWord))
	    {
	    	return true;
	    }	    
		return false;
	}
	
	static String getReverseWord(String word)
	{
		if(word.isEmpty() || word == null)
		 return word;
		else
			return word.charAt(word.length() -1) +getReverseWord(word.substring(0, word.length() -1));
	}
}
