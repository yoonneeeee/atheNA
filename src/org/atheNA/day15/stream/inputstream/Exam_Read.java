package org.atheNA.day15.stream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Exam_Read {
	public static void main(String[] args) {
		InputStream is = null;
		int readByte;
		try {
			is = new FileInputStream("src/org/atheNA/day15/stream/inputstream/reading.txt");
			do {
				readByte = is.read();
				System.out.print((char) readByte);
			} while (readByte != -1);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

