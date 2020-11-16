package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;
/**
 * Il va comptabiliser dans l'ordre alphab�tiques et va les trait�s
 * @author tarek
 *
 */
public interface ISymptomsCounter {
/**
 * Elle recoit une liste des symptomes et va renvoyer une map donc la cl� est le symptome et la valeur est le nombres d'occurrence	
 * @param listFromFile
 * @return
 */
	Map<String, Integer> countNumberSymptoms(List<String> listFromFile);
	

}
