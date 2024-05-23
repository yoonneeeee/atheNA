package org.atheNA.day05.array.exercise;

import java.util.Scanner;

public class Exercise_Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		int[] num;
		num = new int[4];
		
		System.out.println("[입력 값의 평균 구하기]");
		
		System.out.print("평균을 구할 숫자 4개를 입력하세요 : ");
		num[0] = scanner.nextInt();
		num[1] = scanner.nextInt();
		num[2] = scanner.nextInt();
		num[3] = scanner.nextInt();
		
		double total = num[0] + num[1] + num[2] + num[3];
		double res = total/4;
		
		System.out.println("합계 : " + res);

		
		
	}

}
