package standalone;

import java.awt.*;
import java.awt.event.*;

public class EventList 
{

	public EventList() 
	{
		Frame f = new Frame("List Event Example ");
		
		Label lb = new Label();
		lb.setAlignment(Label.CENTER);
		lb.setSize(300,100);
		
		Button b = new Button(" show ");
		b.setBounds(100,300,70,30);
		
		List l1 = new List(5,false);
		l1.setBounds(100,100,80,50);
		l1.add("C");
		l1.add("C++");
		l1.add("Java");
		l1.add("Python");
		l1.add("Ruby");
		
		
		
		
		f.add(l1);
		f.add(lb);
		f.add(b);
		
		b.addActionListener(new ActionListener()
				{
			            public void actionPerformed(ActionEvent e)
			            {
			            	String data = "Selectd Programming Langauge : "+l1.getItem(l1.getSelectedIndex());
			            	
			            	lb.setText(data);
			            }
				}
				
				);		
		
		f.setSize(500,500);
		f.setLayout(null);
		f.setVisible(true);
		
	}

	public static void main(String[] args) 
	{
		new EventList();

	}

}
