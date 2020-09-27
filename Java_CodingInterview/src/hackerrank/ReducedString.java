package hackerrank;

public class ReducedString {
	
	static String superReducedString(String s) 
    {          
          char arr[] = s.toCharArray();
          int len = arr.length;
                    
          if(s.length() == 0)
        	  return "Empty String";
          
//          StringBuilder sb = new StringBuilder();
          String temp = "";
          
          //To remove adjacent same char
          boolean MaxReduced = true;
          int i;
          for(i = 0;i < len - 1;i++)
          {
              if(arr[i] == arr[i+1])
              {
//                  arr[i] = 0;
//                  arr[i+1] = 0;
//                  i++;
            	  MaxReduced = false;
            	  i++;
              }
              else
            	  temp = temp + String.valueOf(arr[i]);
            	  
          }
          
//          System.out.println("After Loop : "+temp);
          
          if(i == len - 1)
          {
        	  temp = temp + String.valueOf(arr[i]);
          }	 
          
//          System.out.println("After Loop : "+temp);
          
//          System.out.println();
          
          if(MaxReduced)
        	  return temp;
          else
        	  return superReducedString(temp);
          
//          String sb = "";
//          char res[] = new char[len];
//
//          boolean flag = true;
//          int j = 0;
//          int k = 0;
//          while(j < len)
//          {
//             if(arr[j] != 0)
//             {
//                res[k] = arr[j];
//                flag = false;
//                k++;  
//             }
//             j++; 
//          }
//
//          if(flag)
//           return "Empty String";
//         
//       return new String(res);
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		//str = "aaabccddd"
		
		String str = "baab";
		String result = superReducedString(str);
				
		System.out.println(result);
	}

}
