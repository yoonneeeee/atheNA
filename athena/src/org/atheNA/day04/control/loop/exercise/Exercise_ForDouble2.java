package org.atheNA.day04.control.loop.exercise;

public class Exercise_ForDouble2 {

	public static void main(String[] args) {
		// 0시 0분부터 23시 56분까지 출력하기
//		for(int j=2 ; j<5 ; j++) { //현재 변수는 2 ; 변수는 4까지 ; 1씩 증가// 
//			for(int i = 0; i <10; i++) {	//두번째 숫자(변수 1선언 ; 변수는 9까지 ; 1씩증가//
//				System.out.println(j+" * "+ i +" = "+ j*i);
		for(int j=0 ; j<24 ; j++) {
			for(int i=0; i<61; i++) {
				System.out.println(j+"시 "+i+"분");
			}
		}
	}

}
