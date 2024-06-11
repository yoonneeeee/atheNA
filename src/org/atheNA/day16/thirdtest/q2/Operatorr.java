package org.atheNA.day16.thirdtest.q2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Operatorr {
	public void plus() {
		int[] num = new int[2];
		for (int i = 0; i < num.length; i++) {
			num[i] = inputNumber(i);
		}
		System.out.println("두 수의 합은 : " + (num[0] + num[1]));
	}

	public int inputNumber(int i) {
		Scanner sc = new Scanner(System.in);
		int inputNumber;
		while (true) {
			try {
				System.out.println((i + 1) + "번째 정수를 입력하세요. : ");
				inputNumber = sc.nextInt();
				break;
			} catch (InputMismatchException e) {
				System.out.println("잘못입력하셨습니다. 정수만 입력해주세요. ");
			}
		}
		return inputNumber;
	}
}
