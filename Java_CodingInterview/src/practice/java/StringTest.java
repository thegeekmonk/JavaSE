package practice.java;

class StringTest
{
     static int countWord(String str)
     {        
         int count = 0;
         
         char start  = str.charAt(0);
         char next = ' ';
         
         if(str.length() == 0)
          return 0;
                          
         for(int i = 1;i < str.length();i++)
         {     
              next = str.charAt(i);
              
              if(next == ' ' && start != ' ')
                count++;
                
            start = next;                
         } 

         if(next == ' ')
          return count;          
                        
       return (count +1);     
                 
     }

     public static void main(String args[])
     {
         String str = "How  are        you   Sir";
               
         System.out.println("Word Count : "+countWord(str));
       
     }


}
