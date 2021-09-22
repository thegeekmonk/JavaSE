package hello;

public class Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int arr[] = {8,7,5,0,4,0,0,0,10};
	
	int len = arr.length;	
	//output = {8,7,5,4,10,0,0,0,0}
	
	int brr[] = new int[len];

	for(int i = 0;i < len;i++)
	{
		brr[i] = 0;		
	}
	
	int count = 0;
	
	for(int j = 0;j < len;j++)
	{
		if(arr[j] != 0)
		{
			brr[count++] = arr[j];
		}
	}
	
	for(int j = 0;j < len;j++)
	{
		System.out.print(brr[j]+" ");
	}
	
	
//	s1 = new Student(10,"A");
//	s2 = new Student(10,"A");
	
	
//	int loc = 0;
//	int temp;
//	int counter;
	
//	for(int i = 0;i < len;i++)
//	{
//		if(arr[i] == 0)
//		{
//			loc = i;
//		}
//		else if(loc != 0)
//		{
//			temp = arr[i];
//			arr[i] = arr[loc];
//			arr[loc] = temp;
//			
//			loc = i;
//			
//		}			
//	}
	
//	for(int j = 0;j < len;j++)
//	{
//		System.out.println(arr[j]);
//	}
	
	
	
	

 }
}
