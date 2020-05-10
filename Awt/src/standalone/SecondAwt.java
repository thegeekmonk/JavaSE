package standalone;
import java.awt.*;


public class SecondAwt 
{

	public SecondAwt() 
	{
		Frame f = new Frame();
		Button b = new Button("click me");
		b.setBounds(30,80, 80, 40);
		
		f.setSize(400,400);
		f.add(b);
		f.setLayout(null);
		f.setVisible(true);
		
	}

	public static void main(String[] args) 
	{
		SecondAwt s = new SecondAwt();
	}

}
