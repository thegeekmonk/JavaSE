package com.akhilesh.coding;

public class SAP_Sum 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		int arr[] = {1,3,4,8,9};
        
		int size = arr.length;		
		int temp;		
		int i = 0;
		
		int sum = 7;
		
		while(size > 0)
		{
			temp = arr[i] + arr[size-1];
			
			if(temp == sum)
			{
				System.out.println("{"+arr[i]+", "+arr[size-1]+" }");
				break;
			}
			else if(temp > sum)
				--size;
			else 
				++i;			
			
		}
		
		if(i >= size || size <= 0)
			System.out.println("No possible pair");		
		
	}

}
