package org.atheNA.day02.operator.exercise;

public class Exercise_First {
	public static void main(String[] args) {
		boolean result1, result2, result3, result4;
		System.out.println("문제1");
		int a =50;
		int b =30;
		result1 = (a != b) && (a < b);
		result2 = (a < b) || (a == b);
		result3 = (a > b) && (a != b);
		result4 = (a > b) || (a == b);
		/* 
		 * 1. && : o, x : false
		 * 2. || : x, x : false
		 * 3. && : o, o : true
		 * 4. || : o, x : true
		 * */
		System.out.println("결과값1 : " + result1);
		System.out.println("결과값2 : " + result2);
		System.out.println("결과값3 : " + result3);
		System.out.println("결과값4 : " + result4);
		System.out.println("result1 : " + result1 + "result2 : " + result2 + "result3 : " + result3 + "result4 : " + result4);
	}
}
