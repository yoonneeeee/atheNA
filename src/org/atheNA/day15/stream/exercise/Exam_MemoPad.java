package org.atheNA.day15.stream.exercise;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class Exam_MemoPad {

	public static void main(String[] args) {
		/*
		 * 저장할 파일 입력(확장자 제외) : snow 
		 * 종료는 exit 
		 * 1. 오늘은 
		 * 2. 눈이 
		 * 3. 옵니다. 
		 * 4. 펑펑 
		 * 5. 옵니다. 
		 * 6. exit
		 * 파일 저장이 완료되었습니다. 
		 * F5를 눌러 확인해보세요~ 
		 * snow.txt -> 오늘은\n 눈이\n 옵니다 \n펑펑 \n옵니다
		 * 
		 * 1. 어떤 스트림을 쓸까?
		 * 2. 입력받은 값이 어떻게 파일에 저장할까?
		 * 3. 입력받은 값이 exit일 경우 종료하는 방법은?
		 * 
		 */
		Scanner sc = new Scanner(System.in);					// 입력받을 준비!
		System.out.print("저장할 파일명 입력(확장자 제외) : ");	// 가이드 메세지
		String fileName = sc.nextLine();						// 첫입력 : 파일명 선언
		String dest = "src/org/atheNA/day15/stream/exercise/" + fileName +".txt";
																// 입력받은 파일명으로 해당 경로 셋팅
		Writer writer = null;									// 출력스트림 준비!
		try {
			writer = new FileWriter(dest);		// 파일 생성 => 입력받을 준비 완료
			System.out.println("종료는 exit");
			for(int i = 1;;i++){				// 무한반복 i는 1부터 시작하여 출력해서 이용
				System.out.print(i + " : ");	// 1 : , 2 : , .... n : 출력
				String input = sc.nextLine();	// 저장할 데이터 입력
				if("exit".equals(input)) break;	// 널포인트익셉션 방지, exit입력시 무한반복문 탈출
				writer.write(input+"\n");		// 해당 경로 파일에 저장
				writer.flush();					// 버퍼 지우기
			}
			System.out.println("파일 저장이 완료되었습니다.\nF5를 눌러 확인해보세요~");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
