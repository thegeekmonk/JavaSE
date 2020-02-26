package standalone;

import java.awt.*;
import java.awt.event.*;

public class EventChoice 
{

	public EventChoice() 
	{
	    Frame f = new Frame("Choice Test");
	    final Label lb = new Label();
	    lb.setAlignment(Label.CENTER);
	    lb.setSize(400,100);
	    
	    final Button b = new Button(" show ");
	    b.setBounds(200,100,50,20);
	    //b.setSize(50,30);
	    
	    final Choice ch = new Choice();
	    ch.setBounds(100,100,75,75);
	    
	    ch.add("C");
	    ch.add("C++");
	    ch.add("Java");
	    ch.add("Python");
	    	    
	    
	    f.add(ch);
	    f.add(lb);
	    f.add(b);
	   	    
	    
	    f.setSize(500,500);
	    f.setVisible(true);
	    f.setLayout(null);
	    
	    b.addActionListener(new ActionListener()
		{
	         public void actionPerformed(ActionEvent e)
	         {
	        	 String data = "Selected Programming Language : "+ch.getItem(ch.getSelectedIndex());
	        	 lb.setText(data);
	         }
		});
	    
	}

	public static void main(String[] args) 
	{
		
           new EventChoice();
	}

}
