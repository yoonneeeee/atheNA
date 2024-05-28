package org.atheNA.day08.oop.score;

import java.util.Scanner;

public class Student {
	// 멤버 필드
	int kor;
	int eng;
	int math;
	// 생성자
	public Student() {}
	// 멤버 메소드
	// 메뉴 출력
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
	// 성적 입력
		public void inputScore() {
			Scanner sc = new Scanner(System.in);
			System.out.println("====== 성적 입력 ======");
			System.out.println("1. 국어 : ");
			kor = sc.nextInt();					
			System.out.println("2. 영어 : ");
			eng = sc.nextInt();
			System.out.println("3. 수학 : ");
			math = sc.nextInt();
			
		}
	// 성적 출력
		public void printScore() {
			System.out.println("===== 성적 입력=====");
			System.out.println("1. 국어 : "+kor);					
			System.out.println("2. 영어 : "+eng);					
			System.out.println("3. 수학 : "+math);					
			System.out.println("4. 총점 : "+(kor+eng+math));
			System.out.println("5. 평균 : "+(kor+eng+math)/3.0);
			
		}
	// 메세지 출력
		public void displayMsg(String message) {		// 메세지라는 매개변수
//			message="프로그램을 종료합니다.";
			System.out.println(message);
		
	}

}