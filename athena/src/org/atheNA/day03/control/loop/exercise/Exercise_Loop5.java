package org.atheNA.day03.control.loop.exercise;

import java.util.Scanner;

public class Exercise_Loop5 {
	public static void main(String[] args) {
		// 5번
		// 사용자로부터 입력 받은 숫자의 단을 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나 입력 : ");
		int dan = sc.nextInt();
		if (dan >= 1 && dan <= 9) {
			for (int i = 2; i < 10; i++) {
				System.out.println(dan + " * " + i + " = " + dan * i);
			}
		} else {
			System.out.println("1~9사이의 양수를 입력하여야 합니다.");
		}
	}
}
