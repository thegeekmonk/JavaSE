
/*

Amazon Interview Question for SDE1s

You are given an array of n integers which can contain integers from 1 to n only . 
Some elements can be repeated multiple times and some other elements can be absent from the array . 
Write a running code on paper which takes O(1) space apart from the input array and O(n) time to 
print which elements are not present in the array and 
the count of every element which is there in the array along with the element number .
NOTE: The array isn't necessarily sorted.

*/

package problems;

public class Array1AMZ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		int arr[] = {1,2,3,4,5,5,5,4,3,10};
		
		for(int i = 1;i <= arr.length;i++)             //Time : O(N^2)
		{
			int count = 0;
			
			for(int j = 0;j < arr.length;j++)
			{
				if(arr[j] == i)
					count++;
			}
			
			if(count == 0)
				System.out.println("Number : "+i+" Missing");
			else
				System.out.println("Number : "+i+" Frequency --> "+count);
		}
		
	}
	
	/*
	     Time Complexity : O(N^2)
	     Space Complexity :O(1) 
	*/

}
