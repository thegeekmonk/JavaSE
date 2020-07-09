package com.akhilesh.coding;

public class Search_Linear 
{   
//	int arr[] = {14,89,34,56,6,8,82};
    
	public static int search(int arr[],int num)
	{
		for(int i = 0;i < arr.length;i++)
			if(arr[i] == num)
				return i;	
				
		return -1;
	}
	
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		int arr[] = {34,56,6,9,12,24,41};
		
		int result = search(arr,9);
		
		if(result != -1)
		   System.out.println("Index of 9 in Array : "+result); 
		else
			System.out.println("Not Found in Array!!");
		
	}

}
