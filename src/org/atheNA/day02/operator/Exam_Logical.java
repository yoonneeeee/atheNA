package org.atheNA.day02.operator;

public class Exam_Logical {
	public static void main(String[] args) {
		//논리연산자 예제
		// 남자이면서 평균평점 4.3 이상인 사람 -> and
		// 컴퓨터 공학과 또는 경영학과인 사람  -> or
		boolean result1, result2, result3, result4;
//		boolean result2;
//		boolean result3;
//		boolean result4;
		// AND -> &&
		// OR -> ||
		// 변수를 선언하지 않고 사용할 경우 변수색이 변하지 않고 붉은색 오류표시가 뜬다.
		int num1 = 50;
		int num2 = 30;
		result1 = (num1 == num2) && (num1 < num2);
		System.out.println("결과값1 : "+ result1);
		result2 = (num1 < num2) || (num1==num2);
		System.out.println("결과값2 : "+ result2);
		result3 = (num1 > num2) && (num1 != num2);
		// &&직렬 : 둘다 맞아야 함 > o, o ; true
		result4 = (num1 > num2) || (num1 == num2);
		// ||병렬 : 둘 중 하나만 맞아도 됨 -> o, x; true
		System.out.println("결과값3 : "+ result3);
		System.out.println("결과값4 : "+ result4);
	}
}
