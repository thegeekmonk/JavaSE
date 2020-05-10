package standalone;
import java.awt.*;
import java.awt.event.*;

public class Event1 extends Frame implements ActionListener
{
   TextField tf;
	
	public Event1() 
	{
       tf = new TextField();
       tf.setBounds(30, 50, 80,30);
       
       Button b = new Button("Click Me");
       b.setBounds(30,90,50,30);
       
       b.addActionListener(this);
       
       add(b);
       add(tf);
       setSize(300,300);
       setLayout(null);
       setVisible(true);

	}
	
	public void actionPerformed(ActionEvent a)
	{
		tf.setText("Welcome !!");
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		new Event1();

	}

}
