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
			System.out.print("Enter the Regular Expression : ");
			Pattern pattern = Pattern.compile(sc.nextLine());
			
			System.out.println("Enter the Pattern Text : ");
			Matcher matcher = pattern.matcher(sc.nextLine());
			
			boolean found = false;
			while(matcher.find())
			{
				System.out.println("Found the Text : "+matcher.group());
				System.out.print("Start Index : "+matcher.start());
				System.out.print("  End Index : "+matcher.end());
				System.out.println();
				found = true;   //there is some matching
			}
			
			if(!found)
			{
			   System.out.println("Given Text not found in the pattern");
			   break;			
			}
			break;
		}
		
		System.out.println("Thank You!!");
		
	}

}
