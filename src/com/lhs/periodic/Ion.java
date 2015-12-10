package com.lhs.periodic;

public class Ion {
	
	private Element element;
	private int charge;
	
	public Ion(Element element, int charge) {
		this.element = element;
		this.charge = charge;
	}
	public Ion(Element element) {
		this(element,0);
	}
	
	public Element getElement() { return element; }
	public int getCharge() { return charge; }
	public int getElectrons() { return element.electrons-charge; }
	public int getValence() { return Utils.getValence(element.electrons-charge); }
	
}
