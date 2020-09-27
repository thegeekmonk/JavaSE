package hackerrank;

import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;

public class MinAbsoluteDifference {

	public static int minDifference(int arr[],int n)
	{
        int len = arr.length;		
        int len2 = (Arrays.stream(arr).boxed().collect(Collectors.toSet())).size();
        
        if(len != len2)
        	return 0;
        
//        System.out.println("Set Length : "+len2);
        
		if(n == 1)
		{
			if(arr[0] < 0)
				return -arr[0];
			else
				return arr[0];
		}
		else
		{
			int min = arr[0] - arr[1];  
			
			if(min < 0)
				min = -min;
			
			int diff;
			for(int i = 0;i < len -1;i++)
			{
				for(int j = i+1;j < len;j++)
				{
					diff = arr[i] - arr[j];
					
					if(diff < 0)
						diff = -diff;
					
					if(diff < min)
						min = diff;
				}
			}
			
		 return min;	
		}		
		
	}
	
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int arr[] = {-59, -36, -13, 1, -53, -92, -2, -96, -54, 75};
		
		int len = arr.length;
		
		int absoluteDiff = minDifference(arr,len);
		
		System.out.println(absoluteDiff);
		
	}

}


/*

void quicksort(int arr[], int l, int r)
{
    // Base case: No need to sort arrays of length <= 1
    if (l >= r)
    {
        return;
    }
    
    // Choose pivot to be the last element in the subarray
    int pivot = arr[r];

    // Index indicating the "split" between elements smaller than pivot and 
    // elements greater than pivot
    int cnt = l;

    // Traverse through array from l to r
    for (int i = l; i <= r; i++)
    {
        // If an element less than or equal to the pivot is found...
        if (arr[i] <= pivot)
        {
            // Then swap arr[cnt] and arr[i] so that the smaller element arr[i] 
            // is to the left of all elements greater than pivot
            swap(&arr[cnt], &arr[i]);

            // Make sure to increment cnt so we can keep track of what to swap
            // arr[i] with
            cnt++;
        }
    }
    
    // NOTE: cnt is currently at one plus the pivot's index 
    // (Hence, the cnt-2 when recursively sorting the left side of pivot)
    quicksort(arr, l, cnt-2); // Recursively sort the left side of pivot
    quicksort(arr, cnt, r);   // Recursively sort the right side of pivot
}


*/
