package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

/**
 * lecture lignes par lignes des symptomes
 * @author tarek
 *
 */

public class SymptomsWrite implements ISymptomsWrite {
	private static final String DEFAULT_OUT = "result.out";

	@Override
	public void result(Map<String, Integer> res) throws IOException {
		FileWriter writer = new FileWriter(DEFAULT_OUT); // Write in the result file.
		for (Map.Entry<String, Integer> entry : res.entrySet()) {
			try {
				writer.write(entry.getKey() + "=" + entry.getValue());
				writer.write(System.getProperty("line.separator"));
			} catch (IOException e) {
				System.err.println("Error Access Of result.out File");
				e.printStackTrace();
			}
		}
		writer.close();
		System.out.println("The 'result.out' File is Successfully Written");
	}

}
