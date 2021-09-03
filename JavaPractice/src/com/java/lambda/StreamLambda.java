package com.java.lambda;

import java.util.ArrayList;
import java.util.List;

class Prod
{
	int id;
	String name;
	float price;
	
	Prod(int id, String name,float price)
	{
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}	
}

public class StreamLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Prod> list = new ArrayList<>();
		
		Prod p1 = new Prod(1,"IPhone XR",52000f);
		Prod p2 = new Prod(2,"IPhone 8",47000f);
		Prod p3 = new Prod(3,"Moto G2",14000f);
		Prod p4 = new Prod(4,"Galaxy POP",8500f);
		
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		
		Prod pr = list.stream().max((product1,product2)->p1.price > p2.price ?1:-1).get();
		
		System.out.println(p2.name);
		
	}

}
