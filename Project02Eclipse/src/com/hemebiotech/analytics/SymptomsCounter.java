package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
/**
 * il va compter les symptomes et les traités dans un ordre d'occurrence
 * @author tarek
 *
 */
public class SymptomsCounter implements ISymptomsCounter {
	/**
	 * Create a map with the number of symptoms sorted in alphabetic order.
	 **/ 
	@Override
	public Map<String, Integer> countNumberSymptoms(List<String> listFromFile) {
		TreeMap<String, Integer> mapSymptoms = new TreeMap<>();
		if (listFromFile != null && !listFromFile.isEmpty()) {
			for (String temp : listFromFile) {
				mapSymptoms.put(temp, !mapSymptoms.containsKey(temp) ? 1 : (mapSymptoms.get(temp) + 1));
			}
		}
		return mapSymptoms;
		
	}
	

}
