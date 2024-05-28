package org.atheNA.day08.oop.score;

import java.util.Scanner;

public class ScoreProgram2 {
	static int kor = 0;			// 여러 메소드에서 변수를 적용시키려고, main()필드 바깥으로 꺼내고
	static int eng = 0;			// 변수초기화 앞에 static을 붙여주어, 전체 필드에서 쓰도록 한다.
	static int math = 0;		// ScoreProgram2 클래스의 멤버 필드
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		finish :
		while(true) {
			int choice = printMenu();			
			switch(choice) {
			case 1 : 
				inputScore();			// 컨트롤+클릭 => 변수에 해당하는 메소드로 이동
				break;					// 알트+왼쪽 => 다시 돌아옴
			case 2 : 
				printScore();
				break;
			case 3 : 
				System.out.println("프로그램을 종료합니다.");
				break finish;
			default :
				displayMsg("1~3 사이의 수를 입력해주세요. ");
			}
		}
	}
	private static void displayMsg(String message) {		// 메세지라는 매개변수
//		message="프로그램을 종료합니다.";
		System.out.println(message);
	}
	private static void printScore() {
		System.out.println("===== 성적 입력=====");
		System.out.println("1. 국어 : "+kor);					
		System.out.println("2. 영어 : "+eng);					
		System.out.println("3. 수학 : "+math);					
		System.out.println("4. 총점 : "+(kor+eng+math));
		System.out.println("5. 평균 : "+(kor+eng+math)/3.0);
		
	}
	private static void inputScore() {
		Scanner sc = new Scanner(System.in);
		System.out.println("====== 성적 입력 ======");
		System.out.println("1. 국어 : ");
		kor = sc.nextInt();					
		System.out.println("2. 영어 : ");
		eng = sc.nextInt();
		System.out.println("3. 수학 : ");
		math = sc.nextInt();
		
	}
	public static int printMenu() {   //void와 리턴은 같이 쓸 수 없으므로, void를 int 형으로
		Scanner sc = new Scanner(System.in);
		System.out.println("====== 메인 메뉴 ======");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 종료");
		System.out.print("선택 >> ");
		int choice = sc.nextInt();
		return choice;					//void와 리턴은 같이 쓸 수 없으므로, void를 int 형으로
		
	}
	
	
	
}
