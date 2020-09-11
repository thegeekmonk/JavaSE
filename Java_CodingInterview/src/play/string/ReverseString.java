package play.string;

public class ReverseString 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		String st = "Hello";		
	    int i = 0;
		int j = st.length() - 1;
				
		char arr[] = new char[j+1];
		
		System.out.println("Original String : "+st);
		

           while(j >= 0)
           {
			arr[i] = st.charAt(j);   //copying element in a reverse order
			++i;
			--j;
           }
		
		System.out.println("Reversed String : "+String.valueOf(arr));
		
	}

}
