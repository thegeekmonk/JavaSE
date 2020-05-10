package standalone;

import java.awt.*;
import java.awt.event.*;

public class EventScrollbar 
{

	public EventScrollbar() 
	{
		Frame f = new Frame("Scrollbar Test");
		
		final Label lb = new Label();
		lb.setAlignment(Label.CENTER);
		lb.setSize(300,100);
		
		
		Scrollbar sc = new Scrollbar();
		sc.setBounds(100,100,20,100);
		
		f.add(lb);
		f.add(sc);
		
		sc.addAdjustmentListener(new AdjustmentListener()
				{
			            public void adjustmentValueChanged(AdjustmentEvent e)
			            {
			            	lb.setText("Scrollbar Value :"+e.getValue());
			            }
				}	
				);
		
		f.setSize(500,500);
		f.setLayout(null);
		f.setVisible(true);
	}

	public static void main(String[] args) 
	{
		new EventScrollbar();

	}

}
