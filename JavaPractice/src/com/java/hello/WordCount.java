package com.java.hello;

import java.util.HashMap;
import java.util.Map;

public class WordCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String inputString = "Core java test and Core java interview";
		
		Map<String,Integer> map = new HashMap<String,Integer>();
		
		int len = inputString.length();
		
		int start = 0;
		int end = 0;	
		int i = 0;
		
		//Logic :-
		//1.Read string , when we find whitesapce char, 
		//will read substring till whitespace char and put them in Map as key.
		//
			
		while(i < len)
		{
			if(inputString.charAt(i) == ' ' || i == len-1)
			{
				end = i;
				
				//for reading last substring 'word'
				if(i == len -1)
					end = i+1;
				
				//1st time insertion of string , frequency as 1. 
				if(!map.containsKey(inputString.substring(start, end)))
						{
					map.put(inputString.substring(start, end),1);
						}
				else{
				//Another time insertion of same string , frequency increased by 1.	
				int freq = map.get(inputString.substring(start, end));
				
				
			   System.out.println(freq);
				
				map.put(inputString.substring(start, end),++freq);
				}
				
				start = i+1;	
			}
						
			i++;
		}
        System.out.println("Word with Frequency --> "+map);	
	}
}
