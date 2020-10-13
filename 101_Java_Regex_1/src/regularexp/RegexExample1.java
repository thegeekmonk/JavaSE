package regularexp;

import java.util.regex.Pattern;

public class RegexExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		System.out.println(Pattern.matches("[789][0-9]{5}","712348")); //string should start with either 7,8,9 and total length 5+1 : 6
		System.out.println(Pattern.matches("[789][0-9]{9}","7123487877"));
	}

}
