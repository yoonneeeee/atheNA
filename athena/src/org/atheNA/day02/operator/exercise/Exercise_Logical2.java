package org.atheNA.day02.operator.exercise;

import java.util.Scanner;

public class Exercise_Logical2 {
	public static void main(String [] args) {
		// 입력 받은 문자가 대문자인지 소문자인지 확인하세요!
		// 변수 word에 초기화
		// 영어 대문자 확인 : true
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자를 입력해주세요. : ");
		char word = sc.next().charAt(0);
		boolean result = (word>=65) && (word <=90);
		System.out.println("영어 대문자 확인 : "+ result);
		
	}
}

	