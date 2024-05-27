package org.atheNA.day02.operator.exercise;

public class Exercise_Second {
	public static void main(String[] args) {
		
		boolean result1, result2, result3, result4, result5, result6;
		System.out.println("문제2");
		
		int a = 70;
		int b = 55;
		result1 = (a == b) ||(a++ < 100);
		result2 = (a < b) && (--b<55);
		result3 = (a!=b) && (b--<a++);
		result4 = (a++ !=b) || (b++>=85);
		
		/* 
		 * 1. || : x, o(70<100) :true //a:70, b:55 
		 * 2. && : x, o(54<55) : false // a: 71, b:54 
		 *		** and 의경우 앞의 결과가 false면 뒤는 연산 X
		 * 3. && : o, x(55<55) : false // a: 72, b:54
		 * 4. || : o, o : true // a : 73, b:54
		 * 		** or 의 경우 앞의 결과가 true면 뒤는 연산 X
		 * result a = 73
		 * result b = 54
		 * */
		System.out.println("결과값1 : " + result1);
		System.out.println("결과값2 : " + result2);
		System.out.println("결과값3 : " + result3);
		System.out.println("결과값4 : " + result4);
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		
	}
}
