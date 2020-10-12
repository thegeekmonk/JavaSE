package regularexp;

import java.util.regex.Pattern;

public class RegexQuantifiers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		System.out.println(Pattern.matches("[abcd]?","a"));
		System.out.println(Pattern.matches("[abcd]+","aaaabbbbbcdddcca"));
		System.out.println(Pattern.matches("[abcd]*", "abbbbbccccd"));
		
//		System.out.println(Pattern.matches("[abcd]{1}","a"));
//		System.out.println(Pattern.matches("[abcd]{1,}","aababccccdddbcd"));
//		System.out.println(Pattern.matches("[abcd]{1,3}","abb"));
		
		System.out.println();
		
	}

}
