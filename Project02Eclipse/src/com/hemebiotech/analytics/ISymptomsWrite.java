package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.Map;
/**
 * Il va lire toutes les lignes de commandes
 * @author tarek
 *
 */

public interface ISymptomsWrite {
/**
 * Il va lire les lignes une par une en detaillant les syptomes d�sign�s et les mettres en ordres alphab�tiques
 * @param res
 * @throws IOException
 */
	
	void result(Map<String, Integer> res) throws IOException;
}
