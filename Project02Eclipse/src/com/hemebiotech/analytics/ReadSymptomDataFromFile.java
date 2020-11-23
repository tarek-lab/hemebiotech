package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;


/**
 * Simple brute force implementation
 *
 */
public class ReadSymptomDataFromFile implements ISymptomReader {

	private final String filepath;
	private static final String DEFAULT_OUT = "result.out";

	/**
	 * 
	 * @param filepath a full or partial path to file with symptom strings in it, one per line
	 */
	public ReadSymptomDataFromFile (String filepath) {
		this.filepath = filepath;
	}
	/**
	 * méthodes qui lit le contenu d'un fichier de string et qui retourne et liste les strings
	 */
	@Override
	public List<String> getSymptoms() {
		ArrayList<String> result = new ArrayList<>();

		if (filepath != null) {
			try {
				BufferedReader reader = new BufferedReader (new FileReader(filepath));
				String line = reader.readLine();

				while (line != null) {
					result.add(line);
					line = reader.readLine();
				}
				reader.close();

				if (result.isEmpty()) {
					throw new IllegalStateException("The symtomps.txt file is Empty, so result.out is Not Written");
				}

			} catch (IOException e) {
				System.err.println("ERROR ACCESS FILE : 'symptoms.txt'");
				e.printStackTrace();
			}
		}

		return result;
	}
	
	

	
}
