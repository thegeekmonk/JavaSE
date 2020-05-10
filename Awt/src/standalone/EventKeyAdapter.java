package standalone;

import java.awt.*;
import java.awt.event.*;

public class EventKeyAdapter extends KeyAdapter implements WindowListener
{
    Frame f;
    Label l;
    TextArea ta;

    EventKeyAdapter()
    {
    	f = new Frame("Key Adapter Test");
    	
    	l = new Label();
    	l.setBounds(30,50,200,30);
    	
    	ta = new TextArea("This is Text Area");
    	ta.setBounds(20,90,400,300);
    	
    	f.add(l);
    	f.add(ta);
    	
    	f.addKeyListener(this);
    	f.addWindowListener(this);
    	ta.addKeyListener(this);
    	
    	
    	f.setSize(500,500);
    	f.setLayout(null);
    	f.setVisible(true);
    }
    
       public void keyReleased(KeyEvent e)
       {
    	  
    	   String st = ta.getText();
    	   String word[] = st.split("\\s");
    	   
    	   l.setText("Word : "+word.length+ "Character : "+st.length());
    	     	   
       }  
    
       public  void windowActivated(WindowEvent e){}    
	   public  void windowClosed(WindowEvent e){}
	
	   	   
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
		new EventKeyAdapter();

	}

}
