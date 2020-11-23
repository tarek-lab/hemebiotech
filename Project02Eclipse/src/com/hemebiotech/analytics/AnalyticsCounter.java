package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.List;
import java.util.Map;
/**
 * class qui joue le role d'un orchestrateur 
 * @author tarek
 *
 */
public class AnalyticsCounter {
	
	ReadSymptomDataFromFile readSymptomDataFromFile;
	SymptomsCounter symptomsCounter = new SymptomsCounter();
	SymptomsWrite symptomsWrite = new SymptomsWrite();
	
	private static String symptomsfile  = "symptoms.txt";
	/**
	 * Constructor of AnalyticsCounter
	 * 
	 */
	public AnalyticsCounter() {
		readSymptomDataFromFile = new ReadSymptomDataFromFile(symptomsfile);
	}

	private List<String> reader() {
		return readSymptomDataFromFile.getSymptoms();
	}
	/**
	 * The function "counter" read the object List to count all symptoms
	 *
	 * @return a map Map sorted with all occurrence Symptoms
	 */
	public Map<String, Integer> counter() {
		return symptomsCounter.countNumberSymptoms(this.reader());
	}
	/**
	 * put all result in result.out file
	 *
	 * @param res : returned by counter()
	 * @throws IOException look for any access file problems
	 */
	public void outputFile(Map<String, Integer> res) throws IOException {
	symptomsWrite.result(res);
	}
	
}
