package regularexp;

import java.util.regex.Pattern;

public class RegexQuantifiers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		System.out.println(Pattern.matches("[abcd]?","a"));
		System.out.println(Pattern.matches("[abcd]+","aaaabbbbbcdddcca"));
		
		System.out.println(Pattern.matches("[abcd]{1}","a"));
		System.out.println(Pattern.matches("[abcd]{1,}","abcd"));
		
		
	}

}
