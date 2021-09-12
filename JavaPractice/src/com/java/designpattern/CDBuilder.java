package com.java.designpattern;

public class CDBuilder {

	public CDType buildSony()
	{
		CDType cds = new CDType();
		cds.addItem(new Sony());
		return cds;
	}
	
	public CDType buildSamsung()
	{
		CDType cds = new CDType();
		cds.addItem(new Samsung());
		return cds;
	}	
}
