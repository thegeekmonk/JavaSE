package regularexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex1 {

	public Regex1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		//1st way of writing regular expression 
		Pattern p = Pattern.compile(".s");  //. means single character
		Matcher m = p.matcher("aas");   
		
		boolean b = m.matches();
		
		System.out.println(b);
		//2nd way of writing regular expression
		
		
		
	}

}
