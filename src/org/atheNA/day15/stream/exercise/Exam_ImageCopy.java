package org.atheNA.day15.stream.exercise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Exam_ImageCopy {
	public static void main(String[] args) {
		// 이미지 복사하기 //
		// C:\Windows\Web\Wallpaper\Spotlight\img14.jpg
		// C:\Temp\copyimg.jpg
		InputStream is = null;
		OutputStream os = null;
		try {
			is = new FileInputStream("C:\\Windows\\Web\\Wallpaper\\Spotlight\\img14.jpg");
			os = new FileOutputStream("C:\\Temp\\copyimg.jpg");
			byte [] byteImages = new byte[1024];
			int readCount;
			while(true) {
				readCount = is.read(byteImages);
				if(readCount == -1) break;
				os.write(byteImages, 0, readCount);
				os.flush();
			}
			System.out.println("복사가 완료되었습니다. ");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
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
