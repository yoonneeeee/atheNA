package org.atheNA.day02.operator.exercise;

import java.util.Scanner;

public class Exercise_Logical1 {

	public static void main(String[] args) {

		// 입력한 정수가 1~100 사이의 숫자인지 확인하세요!
		// 변수 num에 초기화
		// 1부터 100사이의 숫자인가? : true
		
		// atheNA //
		Scanner scanner = new Scanner(System.in);
		System.out.println("입력한 정수가 1~100 사이의 숫자인지 확인하세요!");
		
		int number = scanner.nextInt();
		boolean result;
		result = (1<=number) && (number<=100);
		System.out.println("1부터 100사이의 숫자인가?" + result);
		
	}
}
