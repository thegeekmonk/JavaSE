package regularexp;

import java.util.regex.Pattern;

public class RegexCharacterClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Pattern.matches("[abcd]","a"));
//		System.out.println(Pattern.matches("[abcd]","b"));
//		System.out.println(Pattern.matches("[abcd]","c"));
//		System.out.println(Pattern.matches("[abcd]","d"));
//		
//		System.out.println(Pattern.matches("[abcd]","ab"));
//		System.out.println(Pattern.matches("[abcd]","bc"));
//		System.out.println(Pattern.matches("[abcd]","cd"));
//		
		
		System.out.println(Pattern.matches("[^abcd]","f"));
		
		System.out.println(Pattern.matches("[abcd]","a"));
		
		System.out.println(Pattern.matches("[a-fG-J]","H"));  //union for single char
		
		System.out.println(Pattern.matches("[a-z&&def]","d"));
		
		System.out.println(Pattern.matches("[a-g&&[^b-g]]","a"));
		
	}

}
