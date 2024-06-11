package org.atheNA.day15.stream.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Exam_ReadCharByte {

	public static void main(String[] args) {
		Reader reader = null;
		try {
			reader = new FileReader("src/org/atheNA/day15/stream/reader/reading.txt");
			int readCount;
			char[] cBuf = new char[3];
			String result = "";
			while (true) {
				readCount = reader.read(cBuf);
				if (readCount == -1) break;
				result += new String(cBuf, 0, 3);
			}
			System.out.println(result);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
