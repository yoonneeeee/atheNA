package org.atheNA.day03.control.loop.exercise;

import java.util.Scanner;

public class Exercise_For1 {

	public static void main(String[] args) {
		// 정수 하나를 입력받아서 그 수가 1~9 사이의 수일 때만
		// 그 수의 구구단을 출력하세요.
		// 단, 조건이 맞지 않으면 "1~9사이의 양수를 입력하여야 합니다."를 
		// 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나 입력 : ");
		int dan = sc.nextInt();
		// 반복이 되는 부분, 매번 같은 부분은 어디인가?
		// 변해야 하는 부분은 어디인가?
		// 어떻게 하면 for문으로 나타낼 수 있을까?
			
		// 반복문	
			// 실행문장을 원하는 횟수만큼 반복해줌
			// 문법
			// for(초기식 ; 조건식 ; 증감식) { 실행문장;}
			// for문에서 변수 선언 시 for문 밖에서도 할 수 있고, 안에서도 할 수 있다
				
			// int i = 0; 초기화
			// int i;
		if(dan>=1 && dan <=9) {
			for(int i = 2; i<10 ; i++) {
				System.out.println(dan + " * " + i + " = " + dan*i );
			
			}
		}else {
			System.out.println("1~9사이의 양수를 입력하여야 합니다.");
		}

//		
//		System.out.println("2 * 2 = 4");
//		System.out.println("2 * 3 = 6");
//		System.out.println("2 * 4 = 8");
//		System.out.println("2 * 5 = 10");
//		System.out.println("2 * 6 = 12");
//		System.out.println("2 * 7 = 14");
//		System.out.println("2 * 8 = 16");
//		System.out.println("2 * 9 = 18");
//		
//		
		
	}

}
