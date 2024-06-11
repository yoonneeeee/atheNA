package org.atheNA.day15.stream.exercise;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;


public class Exam_TextFileCopy {
	public static void main(String[] args) {
		// 파일 복사하기 //
		// C:\\windows\\system.ini 을 복사해서
		// C:\\Temp\\system.txt 로 만들어주세요. 
		// 단, 문자기반스트림을 활용하세요. 
		Reader reader = null;
		Writer writer = null;
		try {
			reader = new FileReader("C:\\windows\\system.ini");
			writer = new FileWriter("C:\\Temp\\system.txt");
			int readCount;
			char [] cBuf = new char[10];
			while(true) {
				readCount = reader.read(cBuf);
				if(readCount == -1) break;
				writer.write(cBuf, 0, readCount);
				writer.flush();
			}
			System.out.println("복사가 완료되었습니다.");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				reader.close();
				writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}






