package org.atheNA.day15.stream.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Exam_Read {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reader reader = null;
		try {
			reader = new FileReader("src/org/atheNA/day15/stream/reader/reading.txt");
			
			int readData;
			while((readData = reader.read())!=-1) {
				System.out.print((char)readData);
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
