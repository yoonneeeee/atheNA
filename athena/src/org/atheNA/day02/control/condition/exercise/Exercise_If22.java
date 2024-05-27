package org.atheNA.day02.control.condition.exercise;

import java.util.Scanner;

public class Exercise_If22 {

	public static void main(String[] args) {

		// 커피메뉴를 입력받고 가격을 알려주는 프로그램을 작성하시오
		// 주문하시겠어요? 가격을 알려드립니다. 
		// (에스프레소, 카푸치노, 카페라떼, 아메리카노)
		// 메뉴를 입력해주세요 : 에스프레소
		// 2500원 입니다. 
		// 메뉴를 입력해주세요 : 자바칩프라프치노
		// 없는 메뉴입니다. 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("주문하시겠어요? 가격을 알려드립니다.");
		System.out.println("에스프레소, 카푸치노, 카페라떼, 아메리카노");
		System.out.print("메뉴를 입력해주세요 : ");
		String menu = sc.next();
		// 문자열 비교는 == 이 안됨, 문자열 비교는 equals
		if(menu.equals("에스프레소")) {
			System.out.println("2500원입니다.");
		}else if(menu.equals("카푸치노")) {
			System.out.println("4000원입니다.");
		}else if(menu.equals("카페라뗴")) {
			System.out.println("3500원입니다.");
		}else if(menu.equals("아메리카노")) {
			System.out.println("3000원입니다.");
		}else {
			System.out.println("없는 메뉴입니다.");
			
		}
	}

}
