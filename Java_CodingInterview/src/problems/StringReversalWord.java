package problems;

import java.util.Stack;

public class StringReversalWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "How  are   you";
		StringBuilder sb = new StringBuilder();
		
		int len = str.length();
		
		int start = 0,end = 0;	
		char pre,next;
		int i;
		
		
		Stack<String> stack = new Stack<String>();
		
		i = 0;
		pre =  str.charAt(0);
		next = str.charAt(0);
		
		while(i < len)
		{
			if(pre != ' ' && str.charAt(i) == ' ')
			{
				end = i;
				stack.push(str.substring(start, end));
			}
			else if(pre == ' ' && str.charAt(i) != ' ')
				start = i;
			
			pre = str.charAt(i); 
			
			i++;
		}
		
		while(!stack.empty())
			sb.append(stack.pop());
		
		System.out.println("Reversed String : "+sb);
	}

}
