package com.java.lambda;

import java.util.ArrayList;
import java.util.List;

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
		
		
		//list.add(null);
		
	}

}
