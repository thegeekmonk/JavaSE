package standalone;

import java.awt.*;
import java.awt.event.*;

public class EventCheckboxGroup extends Frame 
{
    CheckboxGroup cbg;
    Checkbox ch1,ch2;
    Label lb;
    
	public EventCheckboxGroup() 
	{
		cbg = new CheckboxGroup();
		
		ch1 = new Checkbox("C ",cbg,false);
		ch2 = new Checkbox("Java ",cbg,false);
		
		ch1.setBounds(100,100,50,30);
		ch2.setBounds(100,130,50,30);
		
		lb = new Label();
		lb.setAlignment(Label.CENTER);
		lb.setSize(400,100);
		
				
		add(ch1);
		add(ch2);
		add(lb);
		
		ch1.addItemListener(new ItemListener()
				{
			          public void itemStateChanged(ItemEvent e)
			          {
			        	  lb.setText("C CheckboxButton : Checked");
			          }
				});
		
		ch2.addItemListener(new ItemListener()
				{
			         public void itemStateChanged(ItemEvent e)
			         {
			        	 lb.setText("Java CheckboxButton : Checked");
			         }
				});
		
		setSize(400,400);
		setLayout(null);
        setVisible(true);		
	}


	public static void main(String[] args) 
	{
		new EventCheckboxGroup();

	}

}
