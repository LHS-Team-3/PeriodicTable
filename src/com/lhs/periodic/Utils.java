package com.lhs.periodic;

public class Utils {
	
	
	/**
	 * Calculates the number of valence electrons for a given number of electrons.
	 * @param electrons The number of electrons in the atom.
	 * @return The valence electrons.
	 */
	public static int getValence(int electrons) {
		//TODO: FIX THIS!
		int valenceElectrons = electrons;
		if (electrons>2) electrons-=2;
		while (electrons>8) electrons-=8;
		return valenceElectrons;
	}
	
}
