package org.atheNA.day05.array.practice;

import java.util.Scanner;

public class Practice_Array6 {

	public static void main(String[] args) {
//문제6//
	//	"월"~"일"까지 초기화 된 문자열 배열을 만들고 0부터 6까지 숫자를 입력받아
	//	입력한 숫자와 같은 인덱스에 있는 요일을 출력하고, 
	//	범위에 없는 숫자를 입력 시 
	//	"잘못 입력하셨습니다."를 출력하세요. 
	//	ex. 
			// 0~6사이 숫자 입력 : (4) -> 금요일
		 	// 0~6사이 숫자 입력 : (7) -> 잘못 입력 하셨습니다. 
	Scanner sc = new Scanner(System.in);
	System.out.println("0~6 사이 숫자 입력 : ");
	int num = sc.nextInt();
	if (num < 0 || num > 6) {
	System.out.println("잘못입력하셨습니다. ");
		
	}else {
		String[]weeks = {"월요일", "화요일", "수요일", "목요일", "금요일", "토요일", "일요일"};
//		Char [] weekss = {'월', '화', '수', '목", "금", "토", "일"};
		System.out.println(weeks[num]);
//		System.out.println(weekss[num]+"요일");
	}
		
		
		
		
		
		
	}

}
