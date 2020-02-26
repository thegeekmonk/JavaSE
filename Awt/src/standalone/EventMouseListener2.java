package standalone;

import java.awt.*;
import java.awt.event.*;

public class EventMouseListener2 extends Frame implements MouseListener
{

	public EventMouseListener2() 
	{
		addMouseListener(this);
		
		setSize(400,400);
		setLayout(null);
		setVisible(true);
	}
	
	public void mouseClicked(MouseEvent e)
	{
		Graphics g = getGraphics();
		g.setColor(Color.green);
		
		g.fillOval(e.getX(),e.getY(),20,20);
	}

	public void mouseExited(MouseEvent e) {}
	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
	public void mouseEntered(MouseEvent e) {}
	

	public static void main(String[] args) 
	{
		new EventMouseListener2();

	}

}
