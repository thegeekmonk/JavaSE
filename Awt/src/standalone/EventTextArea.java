package standalone;

import java.awt.*;
import java.awt.event.*;

public class EventTextArea extends Frame implements ActionListener
{
    
	Label l1,l2;
	Button b;
	TextArea ta;
	
	public EventTextArea() 
	{
		l1 = new Label();
		
		l1.setBounds(50,50,100,30);
		l2 = new Label();
		
		l2.setBounds(180,50,150,30);
		
		b = new Button(" Count ");
		b.setBounds(50,350,80,30);
		
		b.addActionListener(this);
		
		ta = new TextArea("This is a text area Component for multi line test");
		
		ta.setBounds(10,100,300,200);
		
		add(l1);
		add(l2);
		add(b);
		add(ta);
		
		setSize(400,400);
		setLayout(null);
		setVisible(true);
		
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		  String txt = ta.getText();
		  String word[] = txt.split("\\s");
		  
		  l1.setText("Word Count : "+word.length);
		  l2.setText("Character Count : "+txt.length());
		  
	}

	public static void main(String[] args) 
	{
		new EventTextArea();

	}

}
