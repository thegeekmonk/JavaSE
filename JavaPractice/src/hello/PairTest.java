package hello;

public class PairTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		
		int left = 0;
		int right = 9;
		
		int k = 4;

		int diff = -1;

		while(left <= right)
		{
		     diff = arr[right] - arr[left];
		    if(diff == k)
			{
			    System.out.println("left Index : "+left+" Right Index : "+right);
			    break;
			}
			else if(diff > k)
			{
			   right--;
			}
		   	    
		}				
	}

}
