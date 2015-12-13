package com.lhs.periodic;

public enum Element {
	
	HYDROGEN(1,1,1,1,Type.NONMETAL,"Hydrogen","H",1.01,2.2,53,1312,1,1);
	
	public int number;
	public int protons;
	public int electrons;
	public int energyLevels;
	public Type type;
	public String name;
	public String symbol;
	public double atomicMass;
	public double electronegativity;
	public double atomicRadius;
	public int valenceElectrons;
	public double ionizationEnergy;
	public int group;
	public int period;
	
	Element(int number, int protons, int electrons, int energyLevels, Type type, String name, String symbol, double atomicMass, double electronegativity, double atomicRadius, double ionizationEnergy, int group, int period) {
		this.number = number;
		this.protons = protons;
		this.electrons = electrons;
		this.energyLevels = energyLevels;
		this.type = type;
		this.name = name;
		this.symbol = symbol;
		this.atomicMass = atomicMass;
		this.electronegativity = electronegativity;
		this.atomicRadius = atomicRadius;
		//find valence electrons
		int valenceElectrons = number;
		if (number>2) number-=2;
		while (number>8) number-=8;
		this.valenceElectrons = valenceElectrons;
		this.ionizationEnergy = ionizationEnergy;
		this.group = group;
		this.period = period;
	}


	
}
