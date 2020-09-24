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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ArrayAMZ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {1,2,3,4,5,5,5,4,3,10};
		
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();	//Space : O(n)	
		
		for(int i = 0;i < arr.length;i++)
		{
			if(map.containsKey(arr[i]))
				map.put(arr[i],map.get(arr[i])+1);
			else
			    map.put(arr[i],1);
		}

        Set<Map.Entry<Integer,Integer>> entry = map.entrySet();     //space : O(n)
        
        System.out.println("Frequency of elements :-");
		for(Map.Entry<Integer,Integer> en : entry)
			System.out.println("Key : "+en.getKey()+" Frequency --> "+en.getValue());
		
		
		System.out.println("Missing Numbers :-");
		for(int i = 1;i <= arr.length;i++)
		{
			if(!map.containsKey(i))
				System.out.print(i+", ");
		}
		
 /*		
		List<Integer> list = new ArrayList<Integer>(arr.length);    //Space : O(n)
		
		for(int i = 1;i <= arr.length;i++)
		  list.add(i);
		
//		System.out.println("Expected Array : -");
//		System.out.println(list);
//		
//		System.out.println("Given Array : -");
//		for(int x : arr)
//		 System.out.print(x+", ");
		
		Set<Integer> set = map.keySet();                         //Space : O(n)
		
		list.removeAll(set);
		
		System.out.println("List of integer which is missing in given array : -");
		System.out.println(list);
		
		System.out.println("Frequency of elements :-");
		
		Set<Map.Entry<Integer,Integer>> entry = map.entrySet();     //space : O(n)
		
		for(Map.Entry<Integer,Integer> en : entry)
			System.out.println("Key : "+en.getKey()+" Frequency --> "+en.getValue());
		
		*/
		
		
	}

}
