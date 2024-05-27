package org.atheNA.day03.control.loop.exercise;

import java.util.Scanner;

public class Exercise_Loop3 {
	public static void main(String[] args) {
		// +=은 앞의 변수에 뒤의 값을 더하는것
		//3번
		//1부터 사용자에게 입력 받은 수까지의 정수들의 합을 for문을 이용하여 출력하세요.  
//뱅큐/////////////////////////////////////////////////////
		Scanner scanner = new Scanner(System.in);  	// 사용자로부터 입력 받기 위한 준비
		System.out.print("정수 하나 입력 : "); 		// 사용자로부터 입력을 받기위한 가이드 
		int input = scanner.nextInt();				// 정수하나 입력받기 위한 명령어 입력 받은 후 input에 저장
		//입력을 받았고, 입력받은 값:까지 1부터 더해야 함.
		//누적합 -> sum 변수 선언
		// 누적합 식은 sum += input
		int sum = 0;
		for(int i=1; i<=input;i++) {				// 1부터 입력한 값까지 증가하며 반복을 해야하기 때문에
													// int i =1; 이고 조건식의 최대값은 입력받은 값이어야 함. 
													// i는 증가(++)
			sum += i;
			if(i!=input) System.out.print(i+"+");	//총합 출력1
			else System.out.print(i+"=");			// 총합 출력2
		}
		
		System.out.println(sum);
		System.out.println("총합 : "+ sum);
		System.out.println("1부터 "+ input+"까지의 합 : " + sum );
		System.out.printf("1부터 %d까지의 합 : %d\n", input, sum);
		
//윤경/////////////////////////////////////////////////////		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("숫자를 입력해주세요. : ");
//		
//		int num = sc.nextInt();
//		int sum = 0;
//		for(int i = 1; i<=num ; i++) {
//			sum += i;
//		}		
//			System.out.print(sum);
//		
	}
}
