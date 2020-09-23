package problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FrequencyElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        		
		int arr[] = {3,4,3,7,3,4,5,7,4,5,7};
		
//		int len = arr.length;
		
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		for(int i = 0;i < arr.length;i++)
		{
			if(map.containsKey(arr[i]))
				map.put(arr[i],map.get(arr[i])+1);
			else
				map.put(arr[i],1);
		}
		
		Set<Entry<Integer, Integer>> entry = map.entrySet();
		
		for(Map.Entry<Integer,Integer> en : entry)
		{
			if(en.getValue() == 2)
			{
				System.out.println("Number is : "+en.getKey());
				break;
			}
		}
		
	}

}
