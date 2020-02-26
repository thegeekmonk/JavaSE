package standalone;
import java.awt.*;
import java.awt.event.*;

public class EventOuter extends Frame
{
    TextField tf; 
	public EventOuter() 
	{   
		
		tf = new TextField();
		Outer o = new Outer(this);
		
		tf.setBounds(50,50,200,30);
		Button b = new Button(" Click Me ");
		b.setBounds(50,100,80,30);
		
		b.addActionListener(o);
		
		setSize(500,500);
		add(tf);
		add(b);
		setLayout(null);
		setVisible(true);
	}

	public static void main(String[] args) 
	{
		new EventOuter();
	}

}

class Outer implements ActionListener
{
	EventOuter obj;
	
	Outer(EventOuter obj)
	{
		this.obj = obj;
	}
	
	public void actionPerformed(ActionEvent a)
	{
		obj.tf.setText("Welcome Akhilesh ");
	}
		
	
}

