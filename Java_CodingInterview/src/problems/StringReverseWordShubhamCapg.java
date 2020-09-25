package problems;

public class StringReverseWordShubhamCapg {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
			String start = "   How are   you    ";
		    
		    char arr[]=start.toCharArray();		    
		    int count=arr.length;
		    
		    String end="";
		    
		    while(count!=0)
		    {
		      if(arr[count-1]!=' ')
		      {
		        String temp = "";
		        
		        while(count!=0 && arr[count-1]!=' ' )
		        {
		          temp = Character.toString(arr[count-1]) + temp;
		          count--;
		        }
		        
		        end=end+" "+temp;		        
		     }
		     else
		     {
		       count--;
		     }
		      
		    }
		    
		    System.out.println(end);
			}
}


