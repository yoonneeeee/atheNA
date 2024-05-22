package org.atheNA.day03.control.loop.exercise;

import java.util.Scanner;

public class Exercise_Loop2 {
	public static void main(String[] args) {
	
		//2번
		//사용자로부터 한 개의 값을 입력 받아 1부터 
		//그 숫자까지의 모든 숫자를 거꾸로 출력하세요.
		//단, 입력한 수는 1보다 크거나 같아야 합니다.
		
//뱅큐///////////////////////////////////////////////		
//		Scanner scanner = new Scanner(System.in);  	// 사용자로부터 입력 받기 위한 준비
//		System.out.print("정수 하나 입력 : "); 		// 사용자로부터 입력을 받기위한 가이드 
//		int input = scanner.nextInt();				// 정수하나 입력받기 위한 명령어 입력 받은 후 input에 저장
//		if(input >=1) {								// 1 이상의 숫자 입력->1부터 입력한 모든 숫자 출력		
//			for(int i = input ; i >=1 ; i--) {			//거꾸로 출력하기 위해서 초기값을 1부터 시작했음.
//				System.out.print(i+" ");
//				}
//		}
//윤경//////////////////////////////////////////////////		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요. : ");
		
		int i = sc.nextInt();
		
		if(i>=1) {
			while(i>0) {
				System.out.print(i+" ");
				--i;
			}
		}else {
			System.out.println("입력한 수는 1보다 크거나 같아야 합니다.");
		}
	}
}
		