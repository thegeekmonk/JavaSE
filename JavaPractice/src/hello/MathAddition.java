package hello;

public class MathAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		  String s1 = "9689";  //0-3 : 4
	      String s2 =  "394";  //0-1 : 3
	      
	      //"6083";   = 3806
	      
	      int len1 = s1.length();
	      int len2 = s2.length();
	      
	      int diff;
	      int i;
	      
	      StringBuilder sb2;
	      
			if (len1 > len2) {
				sb2 = new StringBuilder(s2);
				diff = len1 - len2;

				for (int k = 0; k < diff; k++) {
					sb2.insert(0, '0');
				}

			i = len1 - 1;	
			} else {
				sb2 = new StringBuilder(s1);
				diff = len2 - len1;
				for (int k = 0; k < diff; k++) {
					sb2.insert(0, '0');
				}
				i = len2 - 1;
			}

		System.out.println(s1);	
		System.out.println(sb2);	
		
	      StringBuilder sb = new StringBuilder();
	        
	        int carry = 0;	              
	        int temp;
	        	        
	        while(i >= 0)
	        {
	           System.out.println("Sum  "+sb);
	          	
	           temp = s1.charAt(i) - '0' + sb2.charAt(i) - '0' + carry;	           
	           sb.insert(0,temp%10);	           
	           carry = temp/10;
	           
	           i--;
	        }
	        
	        if(carry > 0)
	        	sb.insert(0,carry);
	        
	        System.out.println("Sum  "+sb);		
	}

}
