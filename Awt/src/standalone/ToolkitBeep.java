package standalone;

import java.awt.*;
import java.awt.event.*;

public class ToolkitBeep
{

	public ToolkitBeep() 
	{
	   Frame f = new Frame("Beep Toolkit");	
	   
	   Button b = new Button("Beep");
	   b.setBounds(100,100,80,30);
	   b.setBackground(Color.GREEN);
	   
	   b.addActionListener(new ActionListener()
			   {
		            public void actionPerformed(ActionEvent e)
		            {
		            	Toolkit.getDefaultToolkit().beep();
		            }
			   });
	   
	   
	   f.add(b);
	   f.setSize(400,400);
	   f.setLayout(null);
	   f.setVisible(true);
	   
	}

	public static void main(String[] args) 
	{
		new ToolkitBeep();

	}

}
