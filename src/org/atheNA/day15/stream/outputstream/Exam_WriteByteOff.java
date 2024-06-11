package org.atheNA.day15.stream.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Exam_WriteByteOff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OutputStream os = null;
		try {
			os = new FileOutputStream("src/org/atheNA/day15/stream/outputstream/writing3.txt");
			byte[] data = "마지막입출력".getBytes();
			os.write(data, 0, 6);
			os.flush();
			System.out.println("파일쓰기 완료");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				os.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}