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
		
		int sum = 34;
		
		while(i < size)
		{
			temp = arr[i] + arr[size-1];
			
			if(temp == sum)
			{
				System.out.println("{"+arr[i]+","+arr[size-1]+"}");
				break;
			}
			else if(temp > sum)   //if temp value is greater than sum
				--size;           //we will have to decrease size index so that temp value can be decreased
			else               //if temp value is less than sum
				++i;			//we will have to increase start index so that temp value can be increased 
			
		}
		
		if(i >= size)   //this means size 
			System.out.println("No possible pair");		
		
	}

}
