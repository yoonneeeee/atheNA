package org.atheNA.day08.oop.score;

import java.util.Scanner;

public class ScoreProgram {

	public static void main(String [] args) {   //(String [] args) => 매개변수 : 전달값을 받는 변수
		Scanner sc = new Scanner(System.in);
		int kor = 0;
		int eng = 0;
		int math = 0;
		end : 
		while(true) {
//			===== 메인메뉴 =====
//			1. 성적입력
//			2. 성적출력
//			3. 종료
//			선택 : 
			System.out.println("====== 메인메뉴 ======");
			System.out.println("1. 성적 입력");
			System.out.println("2. 성적 출력");
			System.out.println("3. 종료");
			System.out.println("선택 : ");
			int choice = sc.nextInt();
			switch(choice) {
			case 1 : 
				System.out.println("===== 성적 입력=====");
				System.out.println("1. 국어 : ");
				kor = sc.nextInt();
				System.out.println("2. 영어 : ");
				eng = sc.nextInt();
				System.out.println("3. 수학 : ");
				math = sc.nextInt();
//			===== 성적 입력=====
//			1. 국어 : 88
//			2. 영어 : 77
//			3. 수학 : 66	
				break;
			case 2 : 
				System.out.println("===== 성적 입력=====");
				System.out.println("1. 국어 : "+kor);					// 1번 케이스에서 변수 선언했음에도 왜 빨간줄인가? 
				System.out.println("2. 영어 : "+eng);					// 1번 케이스를 안거치고 오면 입력값이 없으므로
				System.out.println("3. 수학 : "+math);					// 따라서, 스위치문 밖에서 먼저 변수를 선언한다. 
				System.out.println("4. 총점 : "+(kor+eng+math));
				System.out.println("5. 평균 : "+(kor+eng+math)/3.0);
//			===== 성적 출력 =====
//			1. 국어 : 88
//			2. 영어 : 77
//			3. 수학 : 66	
//			4. 총점 : 231	
//			3. 평균 : 77.0	
				break;
			case 3 : 
				System.out.println("프로그램이 종료되었습니다. ");
//			프로그램이 종료되었습니다. 
				break end;				// break에 end를 추가하면 와일문을 나갈 수 있다 .=> 프로그램을 종료시킬 수 있다.
			default:
				System.out.println("1~3 사이의 숫자를 입력하세요. ");
//			1~3 사이의 숫자를 입력하세요. 
			}
					
		}
	}
}
