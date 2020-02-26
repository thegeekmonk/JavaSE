package standalone;

import java.awt.*;
import java.awt.event.*;

public class EventPopupMenu
{

	public EventPopupMenu() 
	{
		final Frame f = new Frame("Popup Menu Example");
		final PopupMenu popup = new PopupMenu("Edit");
		
		MenuItem copy = new MenuItem(" Copy ");
		copy.setActionCommand("Copy");
		
		MenuItem cut = new MenuItem(" Cut ");
		cut.setActionCommand("Cut");
		
		MenuItem paste = new MenuItem(" Paste ");
		paste.setActionCommand("Paste");
		
	    popup.add(copy);
	    popup.add(cut);
	    popup.add(paste);
	    
	    f.addMouseListener(new MouseAdapter()
	    		{
	    	           public void mouseClicked(MouseEvent e)
	    	           {
	    	        	   popup.show(f,e.getX(),e.getY());
	    	           }
	    		});
  		
	    f.add(popup);
		f.setSize(500,500);
		f.setLayout(null);
		f.setVisible(true);
		
	}

	public static void main(String[] args) 
	{
		new EventPopupMenu();
	}

}
