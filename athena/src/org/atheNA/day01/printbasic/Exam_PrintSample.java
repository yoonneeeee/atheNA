package org.atheNA.day01.printbasic;

import java.util.Scanner;

public class Exam_PrintSample {
	public static void main(String [] args) {
		System.out.print("지금까지와는 다른 출력 명령어\n");
		System.out.println("지금까지는 쓰던 출력 명령어");
		//ctrl+alt+방향키 : 복사하기
		// * print라는 명령어는 개행이 되지 않음 : 개행을 원할 경우 쌍따옴표 안에
		//    '\n'입력해야함.
		// * println 명령어는 자동으로 개행이 됨.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("하나의 수 입력 : ");
		int num = sc.nextInt();
		
		// printf() 메소드
		System.out.printf(" 정수 출력 : %d\n", 57);
        int age = 10;        
        String addr = "서울";
        
        //'%n'지시자를 사용 안 했을 경우
        System.out.print("줄바꿈 기능");
        System.out.println("없음.");
        
        //'%n'지시자를 사용한 경우
        System.out.print("줄바꾸기\n");
        System.out.print("성공!\n");
        
        System.out.printf("내 나이는 %d살 입니다.\n",age);
        System.out.printf("내 나이는 %d살 이고 %s에 살고 있습니다.%n",age,addr);
	}
}
 