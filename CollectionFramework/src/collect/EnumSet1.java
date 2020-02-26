package collect;
import java.util.*;

public class EnumSet1 
{ 
	enum Day {MONDAY,TUESDAY,WEDNESDAY,THRISDAY,FRIDAY,SATURDAY,SUNDAY}

	public static void main(String[] args) 
	{
		Set<Day> set = EnumSet.of(Day.MONDAY,Day.WEDNESDAY);
		
		Iterator<Day> itr = set.iterator();		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		Set<Day> set2 = EnumSet.allOf(Day.class);
		
        Iterator<Day> itr1 = set2.iterator();
        System.out.println("\nPrinting all the days :");
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
		
        Set<Day> set3 = EnumSet.noneOf(Day.class);
		
        Iterator<Day> itr2 = set3.iterator();
        System.out.println("\nPrinting all the days :");
		while(itr2.hasNext())
		{
			System.out.println(itr2.next());
		}


	}

}
