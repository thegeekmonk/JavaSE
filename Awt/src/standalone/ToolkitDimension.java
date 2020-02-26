package standalone;

import java.awt.*;

public class ToolkitDimension 
{

	public ToolkitDimension() 
	{
		//Frame f = new Frame("Dimension Test");
		Toolkit t = Toolkit.getDefaultToolkit();
		
		System.out.println("Screen Resolution : "+t.getScreenResolution());
		Dimension d = t.getScreenSize();
				
		System.out.println(d);
				
		System.out.println("Width : "+d.width);
		System.out.println("Height : "+d.height);		
		
	}

	public static void main(String[] args) 
	{
		
         new ToolkitDimension();
	}

}
