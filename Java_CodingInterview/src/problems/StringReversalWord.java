package problems;

import java.util.Stack;

public class StringReversalWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "How  are   you";
		
		int len = str.length();
		
		int start = 0,end = 0;		
		int i = 0;
		
		Stack<String> stack = new Stack<String>();
		
		while(i < len)
		{
			if(str.charAt(i) == ' ')
			{
				end = i;
				stack.push(str.substring(start, end));
				
				start = i;
			}
			
			
			i++;
		}
		
	}

}
