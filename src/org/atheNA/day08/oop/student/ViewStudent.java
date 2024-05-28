package org.atheNA.day08.oop.student;

import java.util.Scanner;

public class ViewStudent {

	public int printMenu() {   //void와 리턴은 같이 쓸 수 없으므로, void를 int 형으로
		Scanner sc = new Scanner(System.in);
		System.out.println("====== 메인 메뉴 ======");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 종료");
		System.out.print("선택 >> ");
		int choice = sc.nextInt();
		return choice;					//void와 리턴은 같이 쓸 수 없으므로, void를 int 형으로
		
	}
	// 메세지 출력
	public void displayMsg(String message) {		// 메세지라는 매개변수
//		message="프로그램을 종료합니다.";
		System.out.println(message);
	
}

}
