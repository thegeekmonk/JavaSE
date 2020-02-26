package standalone;
import java.awt.*;
import java.awt.event.*;

public class EventTextfield extends Frame implements ActionListener 
{
    TextField tf1;
    TextField tf2;
    TextField tf3;
	Button b1;
    Button b2;
    
	public EventTextfield() 
	{
		tf1 = new TextField();
		tf1.setBounds(50,50,120,30);
		tf2 = new TextField();
		tf2.setBounds(50,100,120,30);
		
		tf3 = new TextField();
		tf3.setEditable(false);
		tf3.setBounds(50,150,120,30);
		
		b1 = new Button(" + ");
		b1.setBounds(50,250,70,30);
		b2 = new Button(" - ");
		b2.setBounds(130,250,70,30);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		add(tf1);add(tf2);add(tf3);
		add(b1);add(b2);
		
		setSize(500,500);
		setLayout(null);
		setVisible(true);
		
	}
	
	
	
	public void actionPerformed(ActionEvent e)
	{   
		int a,b,c = 0;
		
		String s1 = tf1.getText();
		a = Integer.parseInt(s1);
		
		String s2 = tf2.getText();
		b = Integer.parseInt(s2);
		
		if(e.getSource() == b1)
		{
			c = a + b;
		}
		else if(e.getSource() == b2)
		{
			c = a - b;
		}
		
		String s = String.valueOf(c);
		
		tf3.setText(s);
		
	}
	

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		new EventTextfield();

	}

}
