package com.java.se;

public class LocalInnerClass {
    
	private int data = 90;
	
	void display()
	{   
		int value = 70;
		
		class LocalInner
		{
			void msg()
			{
				System.out.println("Inner Class Local Data : "+value);
			}
		}		
		LocalInner in = new LocalInner();
		in.msg();
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        LocalInnerClass lin = new LocalInnerClass();
        
        lin.display();
	}

}
