package standalone;
import java.awt.*;

public class FirstAwt extends Frame
{
    FirstAwt()
    {
    	Button b = new Button("click me");
    	b.setBounds(40, 100, 80, 30);
    	
    	add(b);
    	
    	setSize(500,500);
    	setLayout(null);
    	setVisible(true);
    }
	
	
	public static void main(String[] args) 
	{
		FirstAwt f = new FirstAwt();

	}

}
