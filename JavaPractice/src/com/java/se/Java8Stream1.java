package com.java.se;

interface Sayable
{
	public String say();
}


public class Java8Stream1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		//without lambda expression
		Sayable s1 = new Sayable() {             
			public String say()
			{
				return "Without Lambda Expression";
			}
		};
		
		System.out.println(s1.say());
		
		//with lambda expression	
		Sayable s2 = ()->{ return "with lambda expression @with retun";};
		System.out.println(s2.say());
		
		Sayable s3 = ()->{ String str = "with lambda expression @with retun";};
		System.out.println(s2.say());
		
	}

}
