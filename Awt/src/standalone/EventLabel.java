package standalone;
import java.awt.*;
import java.awt.event.*;

public class EventLabel extends Frame implements ActionListener
{
	TextField tf;
	Label l;
	public EventLabel() 
	{
	    tf = new TextField();
		tf.setBounds(30,50,200,30);
		tf.setText("www.facebook.com");
		
	    l = new Label();
		l.setBounds(30,100,300,30);
		
		Button b = new Button("Find IP");
		b.setBounds(150,130,80,30);
		
		b.addActionListener(this);
		
		add(b);
		add(tf);
		add(l);
		
		setSize(500,500);
		setLayout(null);
		setVisible(true);
		
	}
    	
	
	public void actionPerformed(ActionEvent a)
	{
		try
		{
			String host = tf.getText();
			String ip = java.net.InetAddress.getByName(host).getHostAddress();
			
			l.setText("IP Address of "+host+" is :"+ip);
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) 
	{
		new EventLabel();
	}

}
