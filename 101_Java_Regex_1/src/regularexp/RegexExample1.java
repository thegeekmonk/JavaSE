package regularexp;

import java.util.regex.Pattern;

public class RegexExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		System.out.println(Pattern.matches("[789][0-9]{5}","712348"));
	}

}
