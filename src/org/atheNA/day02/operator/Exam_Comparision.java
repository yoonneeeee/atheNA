package org.atheNA.day02.operator;

public class Exam_Comparision {
	public static void main(String[] args) {
		// 비교 연산자
		// 더이상 "="은 이꼬르가 아니다!!
		// 이꼬르는 "=="다.
		int num1 = 50;
		int num2 = 30;
		boolean result;
		result = (num1>num2);
		System.out.print("result : " + result);
		result = (num1>num2);
		result = (num1<num2);
		result = (num1==num2);		// 값이 같을 때 true
		result = (num1!=num2);		// 값이 다를 때 true
		System.out.println("result : " + result);
}
}
