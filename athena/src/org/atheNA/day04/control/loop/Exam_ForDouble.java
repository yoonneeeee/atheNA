package org.atheNA.day04.control.loop;

public class Exam_ForDouble {
	public static void main(String[] args) {
		// 중첩 for문 : for문 안의 for문
		// 문법
		// for (     ) { for (     ) {       }}
		
		// 복합대입연산자
		// i = i + 1;
		// i++;
		// ->i += 1;
		// i = i * 2
		// -> i *= 2;
		// i =i + 2;
		// -> i += 2;
		
		// 구구단 만들기
//		int dan =2;		
		for(int j=2 ; j<5 ; j++) { //현재 변수는 2 ; 변수는 4까지 ; 1씩 증가// 
			// 1. j는 2일때 시작해서 2단을 출럭함
			// 2. 안에 있는 for문을 통해서 2단  출력
			// 4. j는 3이 되어서
			// 5. 안에 있는 for문으로 3단 출력
			// 7. j는 5가 되어서
			// 8. 안에 있는 for문으로 4단 출력
			// 10. 조건식이 false가 되므로 중첩 for문 동작 끝
			for(int i = 1; i <10; i++) {	//두번째 숫자(변수 1선언 ; 변수는 9까지 ; 1씩증가//
				System.out.println(j+" * "+ i +" = "+ j*i);
			}  // 3. 2단 출력이 모두 끝나면 바깥 for문에 증가식 동작
			// 6. 3단 출력 끝, 끝나면 바깥 for 문에 증가식 동작
			// 9. 4단 출력 끝, 끝나면 바깥 for 문에 증가식 동작

//			dan++;
		}
		
//		System.out.println("2 * 2 = 4"); 	// 반복되는 부분 : 곱하기 앞의 부분 : 단
//		System.out.println("2 * 3 = 6");	// 변하는 부분 : 곱하기 뒤의 부분
//		System.out.println("2 * 4 = 8");
//		System.out.println("2 * 5 = 10");
//		System.out.println("2 * 6 = 12");
//		System.out.println("2 * 7 = 14");
//		System.out.println("2 * 8 = 16");
//		System.out.println("2 * 9 = 18");
		
//		System.out.println("3 * 2 = 6");
//		System.out.println("3 * 3 = 9");
//		System.out.println("3 * 4 = 12");
//		System.out.println("3 * 5 = 15");
//		System.out.println("3 * 6 = 18");
//		System.out.println("3 * 7 = 21");
//		System.out.println("3 * 8 = 24");
//		System.out.println("3 * 9 = 27");
//		
//		System.out.println("4 * 2 = 8");
//		System.out.println("4 * 3 = 12");
//		System.out.println("4 * 4 = 16");
//		System.out.println("4 * 5 = 20");
//		System.out.println("4 * 6 = 24");
//		System.out.println("4 * 7 = 28");
//		System.out.println("4 * 8 = 32");
//		System.out.println("4 * 9 = 36");
//
	}
}
