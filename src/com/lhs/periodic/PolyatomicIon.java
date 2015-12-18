package com.lhs.periodic;

public enum PolyatomicIon {
	
	AMMONIUM(1,"Ammonium", Element.Nitrogen, Element.Hydrogen, Element.Hydrogen, Element.Hydrogen, Element.Hydrogen),
	CYANIDE(-1,"Cyanide", Element.Carbon, Element.Nitrogen);
	
	public int charge;
	public Element[] elements;
	public String name;
	
	PolyatomicIon(int charge, String name, Element... elements) {
		this.elements = elements;
		this.name = name;
		this.charge = charge;
	}
	
}
