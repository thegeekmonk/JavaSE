package standalone;

import java.awt.*;
import java.awt.event.*;

public class EventDialog 
{
    private static Dialog d;
	public EventDialog() 
	{
		Frame f = new Frame("Frame");
		d = new Dialog(f,"Diolog",true);
		d.setLayout(new FlowLayout());
		
		Button b = new Button("OK");
		b.setBounds(50,50,80,30);
		
		b.addActionListener(new ActionListener()
				{
			        public void actionPerformed(ActionEvent e)
			        {
			        	EventDialog.d.setVisible(false);
			        }
				}
		);
		
		d.add(new Label("Click OK Continue "));
		d.add(b);
		d.setSize(400,400);
		d.setVisible(true);		
		
	}

	public static void main(String[] args) 
	{
		
           new EventDialog();
	}

}
