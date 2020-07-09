package com.akhilesh.coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinarySearch 
{
    
	public static int binarySearch(int arr[],int num)
	{
		int a = 0;
		int b = arr.length;
		
		int mid;
		
		while(a <= b)
		{
			mid = (a+b)/2;          //since in each iteration search is reduced to half hence Time Complexity : O(logN)
			
			if(arr[mid] == num)
				return mid;
			else
			{
				if(arr[mid] > num)
					b = mid-1;        //search size reduced to left half
				else
					a = mid+1;        //search size reduced to right half
			}			
			
		}
				
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
		     int num = Integer.valueOf(br.readLine());                   //using Integer.valueOf to get integer value of String
		     
		     int result = binarySearch(arr,num);
		     
		     if(result != -1)
		          System.out.println("Index of "+num+" in Array : "+(result+1)); 
		     else
			      System.out.println("Not Found in Array!!");
			    
		     System.out.print("Want to search more yes/no : ");
		     ans = br.readLine();
		}
        
		System.exit(0);
     }
	
}
