package com.akhilesh.coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Search_Linear 
{   
    //int arr[] = {14,89,34,56,6,8,82};
    
	public static int search(int arr[],int num)
	{  
//		System.out.println("Passed number is : "+num);
		
		for(int i = 0;i < arr.length;i++)
			if(arr[i] == num)
				return i;	
				
		return -1;
	}
	
	
	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub

		int arr[] = {34,56,6,9,12,24,41};		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String ans = "yes";
		
		while(ans.equals("yes"))
		{
		      
		     System.out.println("Enter the number to be searched : ");
		     int num = Integer.valueOf(br.readLine());
		     
		     int result = search(arr,num);
		     
		     if(result != -1)
		          System.out.println("Index of "+num+" in Array : "+(result+1)); 
		     else
			      System.out.println("Not Found in Array!!");
		
		    
		     System.out.print("Want to search more yes/no : ");
		     ans = br.readLine();
		}
		
	}

}
