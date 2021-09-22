package com.java.hello;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	      int[] numbers = {14,46,47,86,92,52,48,36,66,85};		
		  
	      int arr[] = new int[2];
		
		arr[0] = numbers[0]; //to store largest
		arr[1] = numbers[0]; //to store 2nd largest
		int len = numbers.length;
		
		for(int i = 1;i < len;i++)
		{
			if(numbers[i] > arr[0])
			{			
				arr[1] = arr[0];
				arr[0] = numbers[i];
			}
			else if(numbers[i] > arr[1])
			{
				arr[1] = numbers[i];
			}
		}	      
	    System.out.println("2nd Largest : " +arr[1]);		
	}

}
