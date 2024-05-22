package org.atheNA.day02.printbasic;

public class Exam_PrintSample {

	public static void main(String[] args) {
		System.out.println("이것이 원래 쓰던거");
		System.out.print("이건 조금 다른 것\n"); //개행이 없어서 \n
		
		
// 형식문자
/*
 	1. 정수 : %d
 	2. 실수 : %f
 	3. 문자 : %c 	
 	4. 문자열 : %s
 * */
		System.out.printf("정수 출력 : %d, \n문자열 출력 : %s\n", 1023, "일공이삼");
		System.out.println("이제 끝~!");
		System.out.printf("개강날짜 : %.1f, 종강날짜 : %.2f\n", 5.7, 10.23);
		
		
		

	}

}
