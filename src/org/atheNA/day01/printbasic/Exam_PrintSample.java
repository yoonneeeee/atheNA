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
		System.out.printf(" 정수 출력 : %d", 57);
		
	}
}
 