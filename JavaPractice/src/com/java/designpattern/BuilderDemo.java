package com.java.designpattern;

public class BuilderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CDBuilder cdBuilder = new CDBuilder();
		CDType cdType = cdBuilder.buildSony();
		cdType.showItems();
		
		CDType cdt2 = cdBuilder.buildSamsung();
		cdt2.showItems();
	}
}
