package com.java.lambda;


class Item
{
	int id;
	String name;
	float price;
	
	Item(int id, String name,float price)
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

public class SortingLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
