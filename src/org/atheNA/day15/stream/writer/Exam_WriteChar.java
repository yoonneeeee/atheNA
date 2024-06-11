package org.atheNA.day15.stream.writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Exam_WriteChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Writer writer = null;

		try {
			writer = new FileWriter("src/org/atheNA/day15/stream/writer/writing2.txt");
			char [] data = "hTML/cSS/jAVA".toCharArray();
			writer.write(data);
			writer.flush();// 버퍼 비우기
			System.out.println("파일 쓰기 완료");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

}
