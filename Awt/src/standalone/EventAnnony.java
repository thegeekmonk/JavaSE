package standalone;

import java.awt.*;
import java.awt.event.*;

public class EventAnnony extends Frame
{
   
	public EventAnnony() 
	{
       TextField tf = new TextField();
       tf.setBounds(50,50,150,30);
       
       Button b = new Button(" Click Me !! ");
       b.setBounds(50,100,80,30);
       
       b.addActionListener(new ActionListener()
       {
    	   public void actionPerformed(ActionEvent a)
    	   {
    		   tf.setText("Welcome Akhilesh !!");
    	   }
    	   
       });
       
       setSize(500,500);
       add(tf);
       add(b);
       setLayout(null);
       setVisible(true);

	}

	public static void main(String[] args) 
	{
		new EventAnnony();
	}

}
