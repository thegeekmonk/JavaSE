package com.java.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

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
     
		List<Item> list = new ArrayList<>();
		
		Item p1 = new Item(1,"IPhone XR",52000f);
		Item p2 = new Item(2,"IPhone 8",47000f);
		Item p3 = new Item(3,"Moto G2",14000f);
		Item p4 = new Item(1,"Galaxy POP",8500f);
		
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		
		Comparator<Item> cm =  Comparator.comparing(Item::getPrice);
		Collections.sort(list,cm);		
		list.forEach(i->System.out.println(i.name));
		
		System.out.println("\n");
		
		Collections.sort(list,(i1,i2)-> {return i1.name.compareTo(i2.name);});
		list.forEach(p->System.out.println(p.name));
		
	}
}
