package com.java.se;

abstract class Person
{
	abstract void eat();
}

public class AnonymousInnerClassWithClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Person p = new Person() {
    	 void eat()
    	 {
    		 System.out.println("Eating");
    	 }
     };
     p.eat();
 }
}
