package maven.test;

import org.junit.Assert;
import org.junit.Test;

import maven.logic.Calculation;

public class TestLogic 
{   
	//using annotation
	@Test
     public void findMax()
     {   	 
    	 Assert.assertEquals(17,Calculation.findMax(new int[] {3,5,14,17}));
    	 Assert.assertEquals(-1,Calculation.findMax(new int[] {-20,-30,-15,-1}));
    	     	 
     }
	
	//using annotation
	@Test
	public void findSquare()  
	{
		Assert.assertEquals(25,Calculation.squareNum(5)); //using assertion to test
	}
	
     
}
