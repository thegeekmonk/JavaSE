package standalone;

import java.awt.*;
import java.awt.event.*;

public class EventMouseMotionAdapter extends MouseMotionAdapter implements WindowListener
{
    Frame f;
	EventMouseMotionAdapter()
	{
		f = new Frame("Motion Listener");
		
        f.addMouseMotionListener(this);
        f.addWindowListener(this); 
		
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
	}
	
	   public void mouseDragged(MouseEvent e)
       {
       	    Graphics g = f.getGraphics();
       	    
       	    g.setColor(Color.blue);
       	    g.fillOval(e.getX(),e.getY(),20,20);
       }
	   
	   public  void windowActivated(WindowEvent e) {} 
	   
	   public  void windowClosed(WindowEvent e)
	   {
		 
	   }
	   	   
	   public  void windowClosing(WindowEvent e)
	   {
		   f.dispose();
	   } 
	   public  void windowDeactivated(WindowEvent e) {}  
	   public  void windowDeiconified(WindowEvent e) {}
	   public  void windowIconified(WindowEvent e) {}  
	   public  void windowOpened(WindowEvent e) {}
	     	
	
	public static void main(String[] args) 
	{
		new EventMouseMotionAdapter();
	}

}
