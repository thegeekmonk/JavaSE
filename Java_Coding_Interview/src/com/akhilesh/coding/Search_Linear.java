package com.akhilesh.coding;

public class Search_Linear 
{   
//	int arr[] = {14,89,34,56,6,8,82};
    
	public static boolean search(int arr[],int num)
	{
		for(int i = 0;i < arr.length;i++)
			if(arr[i] == num)
				return true;	
				
		return false;
	}
	
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		int arr[] = {34,56,6,9,12,24,41};
		
		System.out.println("Search Result for 9 : "+search(arr,9)); 		
		
	}

}
