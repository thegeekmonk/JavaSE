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
		
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();		
		
		for(int i = 0;i < arr.length;i++)
		{
			if(map.containsKey(arr[i]))
				map.put(arr[i],map.get(arr[i])+1);
			else
			    map.put(arr[i],1);
		}
		
		List<Integer> list = new ArrayList<Integer>(arr.length);
		
		for(int i = 1;i <= arr.length;i++)
		  list.add(i);
		
		System.out.println("Expected Array : -");
		System.out.println(list);
		
		System.out.println("Given Array : -");
		for(int x : arr)
		 System.out.print(x+", ");
		
		Set<Integer> set = map.keySet();
		
		list.removeAll(set);
		
		System.out.println("List of integer which is missing in given array : -");
		System.out.println(list);
		
	}

}
