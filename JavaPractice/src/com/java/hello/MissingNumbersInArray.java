package com.java.hello;

public class MissingNumbersInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,4,5,3,8,6};
		//missing numbers 2,7
		
		//10
	   //111
		
	   //101	
		
		int n = 8;	
		int xorN = 1; //XOR value of all the n elements
		int xorA = 1; //XOR value of given array with missing numbers
		
		for(int i = 1;i <= n;i++)
		{
			xorN = xorN^i;
		}
		
		for(int i = 0;i < n-2;i++)
		{
			xorA = xorA^a[i];
		}
		
		//XOR value of missing two numbers
		int missXOR = xorN^xorA;		
		
		System.out.println(missXOR);		
	}
}
