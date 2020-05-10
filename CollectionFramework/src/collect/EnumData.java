package collect;
import java.util.*;

public class EnumData 
{
    enum Day {SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THIRSDAY,FRIDAY,SATURDAY}
	
	public static void main(String[] args) 
	{
		Day day = Day.SUNDAY;		
		
		switch(day)
		{
		      case MONDAY :
		           System.out.println("This is Monday");
		           break;
		       
		      case TUESDAY :
		    	   System.out.println("This is Tuesday");
		    	   break;
		           
		      case WEDNESDAY :
		    	   System.out.println("This is Wednesday");
		    	   break;
		      
		      default :
		    	  System.out.println("Other Day");
		    	  break;
		           
		}

	}
}
