package hackerrank;

import java.util.TreeSet;

public class LexicographicOrderString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		String str = "welcometojava";
		
		int len = str.length();
		int i = 0;
		
		TreeSet sortedSet = new TreeSet();
		
		while(i <= len-3)
		{
			sortedSet.add(str.substring(i, i+3));			
		}
        		
        System.out.println("First Lexiorder String : "+sortedSet.first());
        System.out.println("Last Lexiorder String : "+sortedSet.last());
	}

}
