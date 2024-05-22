package org.atheNA.day02.operator.exercise;

import java.util.Scanner;

public class tExer_Logical2 {
	public static void main(String[] args) {
//		 char a = 'A' +1;
		// String str = "";
		// a = 'a'+ 1;
//		 System.out.println("문자 : " + a);
		
		// 입력 받은 문자가 대문자인지 소문자인지 확인하세요!
		// 변수 word에 초기화
		// 문자를 입력해주세요 : a
		// 문자 출력 : a
		// 영어 대문자 확인 : false
		// 몇부터 몇 사이의 숫자인가? : 60~90
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자를 입력해주세요. : ");
		char word = sc.next().charAt(0);
		boolean result = (word>=65) && (word <=90);
		System.out.println("영어 대문자 확인 : "+ result);
		
	}
}
