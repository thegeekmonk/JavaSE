package standalone;

import java.awt.*;
//import java.awt.event.*;

public class EventIconToolkit 
{

	public EventIconToolkit() 
	{
		Frame f = new Frame("Frame");
		Image icon = Toolkit.getDefaultToolkit().getImage("E:\\test.jpg");
		
		f.setIconImage(icon);
		f.setLayout(null);
		f.setVisible(true);
		f.setSize(400,400);
		
	}

	public static void main(String[] args) 
	{
		new EventIconToolkit();

	}

}
