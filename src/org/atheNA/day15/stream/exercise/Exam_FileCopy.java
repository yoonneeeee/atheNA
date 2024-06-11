package org.atheNA.day15.stream.exercise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Exam_FileCopy {

	public static void main(String[] args) {
		// C드라이브에 있는 파일을 E드라이브로 복사해보자~!
		// 이파일을 C:\Temp\fetitlity.png
		// 여기로 복사 C:\\exercise\\copy.png
		/////////////// 경로 + 복사할 파일명.확장자!

		InputStream is = null;
		OutputStream os = null;
		try {
			is = new FileInputStream("C:\\Temp\\fetitlity.png");
			os = new FileOutputStream("C:\\exercise\\copy.png");
			byte[] byteImages = new byte[1024];
			int readCount;
			while (true) {
				readCount = is.read(byteImages);
				if (readCount == -1)
					break;
				os.write(byteImages, 0, readCount);
				os.flush();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				is.close();
				os.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
