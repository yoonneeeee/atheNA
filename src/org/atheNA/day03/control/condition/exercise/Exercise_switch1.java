package org.atheNA.day03.control.condition.exercise;

import java.util.Scanner;

public class Exercise_switch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
		int price=0;
		switch(menu) {
			case "에스프레소" : 
				price=2500;
				System.out.println("2500원입니다.");
			break;
			case "카푸치노" :
				price=2500;			
//				System.out.println("4000원입니다.");
				price=4000;
				break;
			case "카페라떼" :
				price=3000;
//				System.out.println("3000원입니다.");
				break;
			case "아메리카노" :
				price=3000;
//				System.out.println("3000원입니다.");
				break;
			default :
				System.out.println("없는 메뉴입니다. ");
		}
		if(price !=0)
			System.out.println(price+"원입니다.");
		//if문을 쓰는 이유는 없는 메뉴입니다. 나왔을 때는 작동하지 않게 하려고..
	}

}
