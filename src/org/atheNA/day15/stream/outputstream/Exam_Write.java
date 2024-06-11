package org.atheNA.day15.stream.outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Exam_Write {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OutputStream os = null;
		try {
			os = new FileOutputStream("src/org/atheNA/day15/stream/outputstream/writing.txt");
			byte[] input = "헬로우 입출력".getBytes();
			for(int i = 0; i <input.length ; i++) {
				os.write(input[i]);
			}
		os.flush();	// 버퍼비우기
		os.close();	// 자원해제
			System.out.println("파일 쓰기 완료");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
