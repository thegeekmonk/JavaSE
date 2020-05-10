package standalone;

import java.awt.*;
import java.awt.event.*;

public class EventMenu 
{

	public EventMenu() 
	{
		Frame f = new Frame("Menu Item Example");
		MenuBar mb = new MenuBar();
		
		
		Menu m = new Menu("Menu");
		Menu sub = new Menu("Submenu");
		
		MenuItem i1 = new MenuItem("Item 1");
		MenuItem i2 = new MenuItem("Item 2");
		MenuItem i3 = new MenuItem("Item 3");
		MenuItem i4 = new MenuItem("Item 4");
		MenuItem i5 = new MenuItem("Item 5");
		
		m.add(i1);
		m.add(i2);
		m.add(i3);
		
		sub.add(i4);
        sub.add(i5);
        m.add(sub);
        
        mb.add(m);
        
        f.setMenuBar(mb);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
	}

	public static void main(String[] args) 
	{
		new EventMenu();
	}

}
