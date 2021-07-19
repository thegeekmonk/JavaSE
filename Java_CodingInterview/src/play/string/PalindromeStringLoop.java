package play.string;

public class PalindromeStringLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		String str = "appam";		
		int i = 0;
		int j = str.length() - 1;
				
		while(i < j)
		{
			if(str.charAt(i) == str.charAt(j))
			{
				i++;
				j--;
			}
			else
			{
				System.out.println("Not a Palindrome String");
				break;
			}
		}
		
		if(i > j || i == j)
		{
			System.out.println("String is Palindrome");
		}
	}
}
