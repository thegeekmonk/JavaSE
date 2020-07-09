package com.akhilesh.coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinarySearch 
{
    
	public static int binarySearch(int arr[],int num)
	{
		
		
		
		return -1;
	}
	
	
	public static void main(String[] args) throws IOException 
	{			
		
        int arr[] = {6,9,12,24,41,56,87};		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String ans = "yes";
		
		while(ans.equals("yes"))
		{		      
		     System.out.println("Enter the number to be searched : ");
		     int num = Integer.valueOf(br.readLine());
		     
		     int result = binarySearch(arr,num);
		     
		     if(result != -1)
		          System.out.println("Index of "+num+" in Array : "+(result+1)); 
		     else
			      System.out.println("Not Found in Array!!");
			    
		     System.out.print("Want to search more yes/no : ");
		     ans = br.readLine();
		}

     }
	
}
