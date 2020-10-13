package regularexp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Regular Expression Example :-");
		
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			Pattern pattern = Pattern.compile(sc.nextLine());
			
			Matcher matcher = pattern.matcher(sc.nextLine());
		}
		
	}

}
