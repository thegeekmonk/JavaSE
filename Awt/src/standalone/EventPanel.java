package standalone;

import java.awt.*;
import java.awt.event.*;

public class EventPanel 
{

	public EventPanel() 
	{
		Frame f = new Frame("Panel Example");
		Panel pan = new Panel();
		pan.setBounds(50,50,200,200);
		pan.setBackground(Color.cyan);
		
		Button b1 = new Button("button 1");
		b1.setBounds(60,60,60,30);
		b1.setBackground(Color.BLUE);
		
		Button b2 = new Button("button 2");
		b1.setBounds(100,60,60,30);
		b1.setBackground(Color.green);
		
		pan.add(b1);
		pan.add(b2);
		
		f.add(pan);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
		
		
	}

	public static void main(String[] args) 
	{
		
          new EventPanel();
	}

}
