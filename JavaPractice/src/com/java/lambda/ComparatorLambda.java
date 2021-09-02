package com.java.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Product
{
	int id;
	String name;
	float price;
	
	Product(int id, String name,float price)
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

public class ComparatorLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub       
		List<Product> list = new ArrayList<>();
		
		Product p1 = new Product(1,"IPhone XR",52000f);
		Product p2 = new Product(2,"IPhone 8",47000f);
		Product p3 = new Product(3,"Moto G2",14000f);
		Product p4 = new Product(1,"Galaxy POP",8500f);
		
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		
        //Stream<Object> str = list.stream().map(p->p.name);
		
		Stream<Product> str = list.stream().filter(i->i.price > 10000);       
		str.forEach(i->System.out.println(i.name));
		
        //str.forEach(i->System.out.println(i.name));
		
	}

}
