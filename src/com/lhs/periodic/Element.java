package com.lhs.periodic;

import org.json.*;

public enum Element {
	
	//HYDROGEN((Integer)((JSONObject)Utils.masterJson.get("Hydrogen")).get("number"),1,1,1,Type.NONMETAL,"Hydrogen","H",1.01,2.2,53,1312,1,1);
	
	Hydrogen("Hydrogen"),
	Helium("Helium"),
	Lithium("Lithium"),
	Beryllium("Beryllium"),
	Boron("Boron"),
	Carbon("Carbon"),
	Nitrogen("Nitrogen"),
	Oxygen("Oxygen"),
	Fluorine("Fluorine"),
	Neon("Neon"),
	Sodium("Sodium"),
	Magnesium("Magnesium"),
	Aluminum("Aluminum"),
	Silicon("Silicon"),
	Phosphorus("Phosphorus"),
	Sulfur("Sulfur"),
	Chlorine("Chlorine"),
	Argon("Argon"),
	Potassium("Potassium"),
	Calcium("Calcium"),
	Scandium("Scandium"),
	Titanium("Titanium"),
	Vanadium("Vanadium"),
	Chromium("Chromium"),
	Manganese("Manganese"),
	Iron("Iron"),
	Cobalt("Cobalt"),
	Nickel("Nickel"),
	Copper("Copper"),
	Zinc("Zinc"),
	Gallium("Gallium"),
	Germanium("Germanium"),
	Arsenic("Arsenic"),
	Selenium("Selenium"),
	Bromine("Bromine"),
	Krypton("Krypton"),
	Rubidium("Rubidium"),
	Strontium("Strontium"),
	Yttrium("Yttrium"),
	Zirconium("Zirconium"),
	Niobium("Niobium"),
	Molybdenum("Molybdenum"),
	Technetium("Technetium"),
	Ruthenium("Ruthenium"),
	Rhodium("Rhodium"),
	Palladium("Palladium"),
	Silver("Silver"),
	Cadmium("Cadmium"),
	Indium("Indium"),
	Tin("Tin"),
	Antimony("Antimony"),
	Tellurium("Tellurium"),
	Iodine("Iodine"),
	Xenon("Xenon"),
	Cesium("Cesium"),
	Barium("Barium"),
	Lanthanum("Lanthanum"),
	Cerium("Cerium"),
	Praseodymium("Praseodymium"),
	Neodymium("Neodymium"),
	Promethium("Promethium"),
	Samarium("Samarium"),
	Europium("Europium"),
	Gadolinium("Gadolinium"),
	Terbium("Terbium"),
	Dysprosium("Dysprosium"),
	Holmium("Holmium"),
	Erbium("Erbium"),
	Thulium("Thulium"),
	Ytterbium("Ytterbium"),
	Lutetium("Lutetium"),
	Hafnium("Hafnium"),
	Tantalum("Tantalum"),
	Tungsten("Tungsten"),
	Rhenium("Rhenium"),
	Osmium("Osmium"),
	Iridium("Iridium"),
	Platinum("Platinum"),
	Gold("Gold"),
	Mercury("Mercury"),
	Thallium("Thallium"),
	Lead("Lead"),
	Bismuth("Bismuth"),
	Polonium("Polonium"),
	Astatine("Astatine"),
	Radon("Radon"),
	Francium("Francium"),
	Radium("Radium"),
	Actinium("Actinium"),
	Thorium("Thorium"),
	Protactinium("Protactinium"),
	Uranium("Uranium"),
	Neptunium("Neptunium"),
	Plutonium("Plutonium"),
	Americium("Americium"),
	Curium("Curium"),
	Berkelium("Berkelium"),
	Californium("Californium"),
	Einsteinium("Einsteinium"),
	Fermium("Fermium"),
	Mendelevium("Mendelevium"),
	Nobelium("Nobelium"),
	Lawrencium("Lawrencium"),
	Rutherfordium("Rutherfordium"),
	Dubnium("Dubnium"),
	Seaborgium("Seaborgium"),
	Bohrium("Bohrium"),
	Hassium("Hassium"),
	Meitnerium("Meitnerium"),
	Darmstadtium("Darmstadtium"),
	Roentgenium("Roentgenium"),
	Copernicium("Copernicium"),
	Ununtrium("Ununtrium"),
	Ununquadium("Ununquadium"),
	Ununpentium("Ununpentium"),
	Ununhexium("Ununhexium"),
	Ununseptium("Ununseptium"),
	Ununoctium("Ununoctium");
	
	
	
	
	public int number;
	public int protons;
	public int electrons;
	public int energyLevels;
	public Type type;
	public String name;
	public String symbol;
	public double atomicWeight;
	public double electronegativity;
	public double atomicRadius;
	public int valenceElectrons;
	public double ionizationEnergy;
	public ElectronConfiguration configuration;
	
	Element(String name) {
		JSONObject json = Utils.masterJson.getJSONObject(name);
		this.number = json.getInt("number");
		configuration = new ElectronConfiguration(number);
		this.protons = number;
		this.electrons = number;
		this.energyLevels = configuration.getLevels();
		this.type = json.getEnum(Type.class, "type");
		this.name = name;
		this.symbol = json.getString("symbol");
		this.atomicWeight = json.getDouble("atomicWeight");
		this.electronegativity = json.getDouble("electronegativity");
		this.atomicRadius = json.getDouble("atomicRadius");
		//find valence electrons
		this.valenceElectrons = configuration.getValence();
		this.ionizationEnergy = json.getDouble("ionizationEnergy");
	}


	
}
