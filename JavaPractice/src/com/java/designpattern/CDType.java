package com.java.designpattern;

import java.util.ArrayList;
import java.util.List;

public class CDType {
	public List<Packing> cdType = new ArrayList<Packing>();
	
	public void addItem(Packing packs)
	{
		cdType.add(packs);
	}
	
	public void getCost()
	{
		for(Packing packs : cdType)
		{
			System.out.println(packs.price());
		}
	}
	
	public void showItems()
	{
		for(Packing packs : cdType)
		{
			System.out.println("CD Type : "+packs.pack());
			System.out.println("Price : "+packs.price());
		}
	}
	
	
}
