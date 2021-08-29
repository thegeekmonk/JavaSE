package com.java.se;

interface Sayable
{
	public String say();
}

interface Addable
{
	public int add(int a, int b);
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
		
		Sayable s3 = ()->{ return "with lambda expression @with retun";};
		System.out.println(s2.say());
		
		Addable ad = (a,b)->{ return (a+b);};
		System.out.println(ad.add(8, 9));
		
	}

}
