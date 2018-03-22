package org.itstep;

import java.io.FileWriter;
import java.io.IOException;

public class FileIOManager {
	private static final String FILE_PATH = "D:\\goodInfo.txt";

	public static synchronized void writeTextToFile(String text) {
		FileWriter writer = null;
		try {
			writer = new FileWriter(FILE_PATH, true);
			writer.write(text);
			writer.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
