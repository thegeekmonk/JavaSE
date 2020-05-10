package standalone;

import java.awt.*;
import java.awt.event.*;

public class EventMouseListener implements MouseListener
{
    Label l;
	public EventMouseListener() 
	{
        Frame f = new Frame("Mouse Listener Example");
        f.addMouseListener(this);
        
        l = new Label();
        l.setBounds(100,100,100,40);
        l.setBackground(Color.cyan);
        
        f.add(l);
        
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
        
	}
	
	public void mouseClicked(MouseEvent e)
	{
		l.setText(" Mouse Clicked ");
	}
	
	public void mouseExited(MouseEvent e)
	{
		l.setText("Mouse Exited");
	}
	
	public void mousePressed(MouseEvent e)
	{
		l.setText(" Mouse Pressed ");
	}
	
	public void mouseEntered(MouseEvent e)
	{
		l.setText("Mouse Entered ");
	}
	
	public void mouseReleased(MouseEvent e)
	{
		l.setText(" Mouse Released ");
	}

	public static void main(String[] args) 
	{
		new EventMouseListener();

	}

}














