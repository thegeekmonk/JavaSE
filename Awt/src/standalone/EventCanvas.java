package standalone;

import java.awt.*;
import java.awt.event.*;

public class EventCanvas 
{

	public EventCanvas() 
	{
		Frame f = new Frame("Canvas Example");
		Label lb = new Label();
		lb.setAlignment(Label.CENTER);
		lb.setSize(300,100);
		
		f.add(lb);
		f.add(new MyCanvas());
		
		f.setSize(500,500);
		f.setLayout(null);
		f.setVisible(true);
		
	}

	public static void main(String[] args) 
	{
		new EventCanvas();

	}

}

class MyCanvas extends Canvas
{
	MyCanvas()
	{
		setBackground(Color.GREEN);
		setSize(300,300);
	}
	
	public void paint(Graphics g)
	{
		g.setColor(Color.RED);
		g.fillOval(50, 150,100,75);
	}
}



