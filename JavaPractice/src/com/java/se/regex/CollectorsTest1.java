package com.java.se.regex;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

public class CollectorsTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Product p1 = new Product(101,"HP",2200);
		Product p2 = new Product(102,"Dell",2100);
		Product p3 = new Product(103,"Lenevo",2300);
		Product p4 = new Product(104,"Apple",2400);
		
		List<Product> list = new ArrayList<>();
		
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		
		//total elements in list
		Long count = list.stream().collect(Collectors.counting());
		System.out.println("Total Object : "+count);
		
		//average price
		double avg = list.stream().collect(Collectors.averagingDouble(p->p.price));
		System.out.println("Average Price : "+avg);
		
		//Dell price
		List<Float> hh = list.stream().filter(p->p.name.equals("Dell")).map(i->i.price).collect(Collectors.toList());
		System.out.println(""+hh.get(0));
		
		//summing id's
		
		int sum = list.stream().collect(Collectors.summingInt(i->i.id));
		System.out.println("Sum of id : "+sum);
	}
}
