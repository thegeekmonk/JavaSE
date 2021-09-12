package com.java.HashMap;

public class PairDifferenceArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int arr[] = {1,2,3,4,5,6,7,8,9};
		int size = arr.length;
		
		int n = 2;		
		int i = 0,j = 1;
		
		while(i < size && j < size)
		{
			if((arr[j] - arr[i] == n)||(arr[i] - arr[j] == n))
			{
				System.out.println("("+arr[i]+","+arr[j]+")");
				break;
				
			}			
			else if(arr[j] - arr[i] > n)
			{
				i++;
			}
			else if(arr[j] - arr[i] < n)
			{
				j++;
			}		
		}	
	}
}
