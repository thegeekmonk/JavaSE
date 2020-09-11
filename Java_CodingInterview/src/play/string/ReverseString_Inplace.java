package play.string;

public class ReverseString_Inplace 
{
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
       
		StringBuffer st = new StringBuffer("Hello");		
		
		int i = 0;
		int j = st.length() - 1;
		char ch;
		
		System.out.println("Original String is : "+st);
		
		while(i < j)
		{
			ch = st.charAt(i);
			st.setCharAt(i, st.charAt(j));
			st.setCharAt(j, ch);
			++i;
			--j;
		}
		
		System.out.println("Reversed String is : "+st);
	}

}
