package com.java.se;

public class StaticNestedClass {
   
	static int data = 90;
	static class InnerClass
	{
		void msg()
		{
			System.out.println("Data Is : "+data);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		StaticNestedClass.InnerClass in = new StaticNestedClass.InnerClass();
		
		in.msg();
	}

}
