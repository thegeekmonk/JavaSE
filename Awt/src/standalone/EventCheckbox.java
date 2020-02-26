package standalone;

import java.awt.*;
import java.awt.event.*;

public class EventCheckbox 
{
    //Label lab;
    Checkbox ch1,ch2;
    Frame f;
    
	public EventCheckbox() 
	{
       f = new Frame("Checkbox Testing");
       final Label lab = new Label();
       lab.setAlignment(Label.CENTER);
       
       lab.setSize(400,100);
       
       ch1 = new Checkbox("C");
       ch1.setBounds(100,100,50,30);
       
       ch2 = new Checkbox("Java");
       ch2.setBounds(100,150,50,30);
       
       f.add(lab);
       f.add(ch1);
       f.add(ch2);
       
       
       ch1.addItemListener(new ItemListener() 
       {    	   
    	  public void itemStateChanged(ItemEvent e)
    	  {
    		  lab.setText("C Checkbox Checked ");
    	  }
       } 
       );
       
       
       ch2.addItemListener(new ItemListener()
       {
    	  public void itemStateChanged(ItemEvent e)
    	  {
    		 lab.setText("C++ checkbox : "+(e.getStateChange() == 1 ?"Checked ": "Unchecked"));
    	  }
       }
    		   
       );
                  
       
       f.setSize(400,400);
       f.setVisible(true);
       f.setLayout(null);
       
       
	}

	public static void main(String[] args) 
	{
		new EventCheckbox();

	}

}
