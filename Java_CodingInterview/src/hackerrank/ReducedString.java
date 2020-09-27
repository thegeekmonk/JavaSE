package hackerrank;

public class ReducedString {

	
	static String superReducedString(String s) 
    {          
          char arr[] = s.toCharArray();
          int len = arr.length;
          
          //To remove adjacent same char
          for(int i = 0;i < len - 1;i++)
          {
              if(arr[i] == arr[i+1])
              {
                  arr[i] = 0;
                  arr[i+1] = 0;
                  i++;
              }
          }
          
          String sb = "";
          char res[] = new char[len];

          boolean flag = true;
          int j = 0;
          int k = 0;
          while(j < len)
          {
             if(arr[j] != 0)
             {
                res[k] = arr[j];
                flag = false;
                k++;  
             }
             j++; 
          }

          if(flag)
           return "Empty String";
         
       return new String(res);
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		String str = "aaabccddd";
		String result = superReducedString(str);
				
		System.out.println(result);
	}

}
