package standalone;

import java.awt.*;
import java.awt.event.*;

public class EventWindowListener 
{
    Frame f;
	EventWindowListener()
	{
		f = new Frame("Testing Frame");
		
		f.addWindowListener(new WindowAdapter()
				{
			        public void windowClosing(WindowEvent e)
			        {
			        	f.dispose();
			        }
			
				}
								
				);
		
		
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
		
	}
	
	
	
	public static void main(String[] args) 
	{
		new EventWindowListener();

	}

}
