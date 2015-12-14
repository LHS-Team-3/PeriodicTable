package com.lhs.periodic;

import org.json.*;

public enum Element {
	
	//HYDROGEN((Integer)((JSONObject)Utils.masterJson.get("Hydrogen")).get("number"),1,1,1,Type.NONMETAL,"Hydrogen","H",1.01,2.2,53,1312,1,1);
	
	Hydrogen("Hydrogen"),
	Helium("Helium");
	
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
	
	Element(String name) {
		JSONObject json = Utils.masterJson.getJSONObject(name);
		this.number = json.getInt("number");
		this.protons = json.getInt("protons");
		this.electrons = json.getInt("electrons");
		this.energyLevels = json.getInt("energyLevels");
		this.type = json.getEnum(Type.class, "type");
		this.name = name;
		this.symbol = json.getString("symbol");
		this.atomicMass = json.getDouble("atomicMass");
		this.electronegativity = json.getDouble("electronegativity");
		this.atomicRadius = json.getDouble("atomicRadius");
		//find valence electrons
		int valenceElectrons = number;
		if (number>2) number-=2;
		while (number>8) number-=8;
		this.valenceElectrons = valenceElectrons;
		this.ionizationEnergy = json.getDouble("ionizationEnergy");
		this.group = json.getInt("group");
		this.period = json.getInt("period");
	}


	
}
