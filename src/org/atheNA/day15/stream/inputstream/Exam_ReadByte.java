package org.atheNA.day15.stream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Exam_ReadByte {

	public static void main(String[] args) {

		InputStream is = null;
		try {
			is = new FileInputStream("src/org/atheNA/day15/stream/inputstream/reading.txt");
			byte[] readBytes = new byte[3];
			int readCount;
			String result = "";
// 읽은 건 readBytes에 저장되고, 읽은 갯수는 readCount로 들어간다. 
//			do {
			while (true) {
				readCount = is.read(readBytes);
				if (readCount == -1)
					break;
				result += new String(readBytes, 0, readCount);
			}
//			}while(readCount != -1);
			System.out.println(result);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
