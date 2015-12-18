package com.lhs.periodic;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.NoSuchElementException;

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
		ElectronConfiguration config = new ElectronConfiguration(electrons);
		return config.getValence();
	}
	
	public static Element fromShort(String symbol) {
		for (Element e : Element.values()) {
			if (e.symbol.equals(symbol)) return e;
		}
		throw new NoSuchElementException("Element with symbol "+symbol+" does not exist!");
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
