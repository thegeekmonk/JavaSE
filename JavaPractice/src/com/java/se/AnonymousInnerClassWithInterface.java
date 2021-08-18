package com.java.se;

interface Eatable{
	 void eat();
}

class AnonymousInnerClassWithInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Eatable p = new Eatable() {
    	   public void eat()
    	   {
    		   System.out.println("Eating Interface");
    	   }
       };
       p.eat();
	}

}
