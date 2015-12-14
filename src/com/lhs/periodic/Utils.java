package com.lhs.periodic;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;

import org.json.JSONObject;

public class Utils {
	
	public static void main(String... args) {
		System.out.println(Element.Helium.number);
	}
	
	public static JSONObject masterJson = new JSONObject(Utils.readFile("elements.json"));
	
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
	
	static String readFile(String path) {
		try {
			Charset encoding = Charset.defaultCharset();
			byte[] encoded = Files.readAllBytes(Paths.get(path));
			return new String(encoded, encoding);
		} catch(Exception e) {
			return null;
		}
	}
	
}
