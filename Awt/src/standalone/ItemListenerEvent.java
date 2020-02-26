package standalone;

import java.awt.*;
import java.awt.event.*;

public class ItemListenerEvent implements ItemListener,WindowListener
{
    Frame f;
    Label lab;
    Checkbox ch1,ch2;
    
    ItemListenerEvent()
    {
    	f = new Frame("Item Event Test");
    	lab = new Label();
    	
    	lab.setBounds(100,30,300,40);
    	
    	ch1 = new Checkbox("C ");
    	ch1.setBounds(200,100,100,30);
    	
    	ch2 = new Checkbox("Java ");
    	ch2.setBounds(200,150,100,30);
    	
    	ch1.addItemListener(this);
    	ch2.addItemListener(this);
    	f.addWindowListener(this);
    	
    	
    	f.add(ch1);
    	f.add(ch2);
    	f.add(lab);
    	
    	f.setSize(500,500);
    	f.setLayout(null);
    	f.setVisible(true);
    	
    }
	
	public void itemStateChanged(ItemEvent e)
	{
		if(e.getSource() == ch1)
		{
			lab.setText("C  : "+ (e.getStateChange()==1?"Checked ":" Unchecked "));
		}
		
		if(e.getSource() == ch2)
		{
			lab.setText("Java  : "+ (e.getStateChange()==1?"Checked ":" Unchecked "));
		}
		
	}
	


	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) 
	{
	   f.dispose();
		
	}

	@Override
	public void windowClosed(WindowEvent e) 
	{
	
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	public static void main(String[] args) 
	{
		new ItemListenerEvent();

	}

}
