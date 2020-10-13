package regularexp;

import java.util.regex.Pattern;

public class RegexExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		
		//Regex Quantifiers
		System.out.println(Pattern.matches("[789][0-9]{5}","712348")); //start with either 7,8,9 and total length 5+1 : 6
		System.out.println(Pattern.matches("[789][0-9]{9}","7123487877"));//start with either 7,8,9 and total length 9+1 : 10
		
	    //Regex Metacharacters
		
		System.out.println(Pattern.matches("[6789]{1}\\d{9}","6809399734"));
		System.out.println(Pattern.matches("[89]{1}\\d{9}","6809399734"));
	}

}
