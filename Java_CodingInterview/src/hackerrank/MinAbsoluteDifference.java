package hackerrank;

public class MinAbsoluteDifference {

	public static int minDifference(int arr[],int n)
	{
        int len = arr.length;
		
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

		int arr[] = {3,-7,0};
		
		int len = arr.length;
		
		int absoluteDiff = minDifference(arr,len);
		
		System.out.println(absoluteDiff);
		
	}

}
