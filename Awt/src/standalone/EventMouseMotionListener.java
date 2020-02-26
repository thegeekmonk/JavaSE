package standalone;

import java.awt.event.*;
import java.awt.*;

public class EventMouseMotionListener extends Frame implements MouseMotionListener
{
    Label l;
    
	public EventMouseMotionListener() 
	{
		l = new Label();
		l.setBounds(20,50,200,40);
		
		addMouseMotionListener(this);		
		
		add(l);
		
		setSize(500,500);
		setLayout(null);
		setVisible(true);
	}
	
	public void mouseDragged(MouseEvent e)
	{
		Graphics g = getGraphics();
		
		g.setColor(Color.GREEN);		
		g.fillOval(e.getX(),e.getY(),20,20);
		
	}
	
	public void mouseMoved(MouseEvent e)
	{
		l.setText("X : "+e.getX()+" , Y :"+e.getY());
	}
		

	public static void main(String[] args) 
	{
		new EventMouseMotionListener();
	}

}
