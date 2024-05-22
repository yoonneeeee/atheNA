package org.atheNA.day03.control.loop.exercise;

import java.util.Scanner;

public class Exercise_Loop4 {
	public static void main(String[] args) {

//4번  
//사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요.
//만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.
		System.out.println("서로 다른 두개의 정수를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 숫자 : ");
		int num2 = sc.nextInt();
		// num1과 num2 중 1미만의 숫자가 입력되었는지 체크
		if(num1<1||num2<1 ) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}else {
			//입력된 두개의 값 중 작은 값은 초기식에 큰 값은 조건식에 입력되도록 만들어보세요. 
			// hint!! min, max를 사용하는 방법도 있음.
			int min=0, max=0;
			if(num1>num2) {
				max=num1;
				max=num2;
			}else {
				max=num2;
				min=num1;
			}
//			for(int i = min+1 ; i < max-1; i++) {	//num1이 무조건 2보다 작다고 가정
//				System.out.print(i+" ");
//			}
			for(int i = num1; i <= num2; i++) {	//num1이 무조건 2보다 작다고 가정
				System.out.print(i+" ");
			}
			
		}
//		System.out.println("서로 다른 두개의 정수를 입력하세요.");
//		Scanner sc = new Scanner(System.in);
//		System.out.print("첫번째 숫자 : ");
//		int num1 = sc.nextInt();
//		System.out.print("두번째 숫자 : ");
//		int num2 = sc.nextInt();
//		if (num1 < 0 || num2 < 0) {
//			System.out.println("1 이상의 숫자를 입력해주세요.");
//		} else {
//			if (num2 > num1) {
//				for (int i = num1; i <= num2; i++) {
//					System.out.print(i + " ");
//				}
//			} else {
//				for (int i = num2; i <= num1; i++) {
//					System.out.print(i + " ");
//				}
//			}
//		}
	}
}
