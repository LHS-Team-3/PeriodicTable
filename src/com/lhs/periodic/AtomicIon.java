package com.lhs.periodic;

public class AtomicIon implements Ion {
	
	private Element element;
	
	public AtomicIon(Element element, int charge) {
		this.element = element;
		this.charge = charge;
	}
	public AtomicIon(Element element) {
		this(element,0);
	}
	
	public Element getElement() { return element; }
	public int getCharge() { return charge; }
	public int getElectrons() { return element.electrons-charge; }
	public int getValence() { return Utils.getValence(element.electrons-charge); }
	public boolean isCation() { return charge>0; }
	public boolean isAnion() { return charge<0; }
	
}
