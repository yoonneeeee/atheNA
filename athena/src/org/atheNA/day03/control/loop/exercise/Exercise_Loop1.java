package org.atheNA.day03.control.loop.exercise;

import java.util.Scanner;

public class Exercise_Loop1 {
	public static void main(String[] args) {
	// +=은 앞의 변수에 뒤의 값을 더하는것
	// 1번
	// 사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 숫자들을 모두 출력하세요.
	// 단, 입력한 수는 1보다 크거나 같아야 합니다.
	// 만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.		
		
		Scanner scanner = new Scanner(System.in);  	// 사용자로부터 입력 받기 위한 준비
		System.out.print("정수 하나 입력 : "); 		// 사용자로부터 입력을 받기위한 가이드 
		int input = scanner.nextInt();				// 정수하나 입력받기 위한 명령어 입력 받은 후 input에 저장
		if(input >=1) {								// 1 이상의 숫자 입력->1부터 입력한 모든 숫자 출력
			for(int i = 1; i<=input ;i++) {				// 조건식의 최댓값만큼 i가 출력이 되므로, 최대값을 입력한 값으로 변경
													
				System.out.print(i + " ");			// 내가 입력한 숫자까지 1부터 출력하게 됨.
			}
		}else {										// if에 해당하지 않을 경우 
			System.out.println("1이상의 숫자를 입력해야 합니다. ");
		
		}
		
		
//윤경/////////////////////////////////////////////////////////		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("숫자를 입력해주세요. : ");
//		
//		int num = sc.nextInt();
//		int i;
//		if(num>=1) {
//			for(i = 1; i<=num ;i++)
//				System.out.print(i);
//		}else {
//				System.out.println("1이상의 숫자를 입력해야 합니다. ");
//		}
		
	}
}
