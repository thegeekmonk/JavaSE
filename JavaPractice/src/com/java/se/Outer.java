package com.java.se;

public class Outer {
	
	private int data;
	
	Outer()
	{
		data = 10;
	}
	
	class Inner
	{
		public void msg()
		{
			System.out.println("Outer class Private data : "+data);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Outer out = new Outer();
	  
      Outer.Inner in = out.new Inner();
      
      in.msg();
	}

}
