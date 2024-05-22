package org.atheNA.day03.control.loop.exercise;

public class Exercise_While1 {

	public static void main(String[] args) {
		// While 문을 이용하여 1~100 사이의 홀수의 합을 출력하시오.
		// 1~100 사이의 홀수의 합 ?
		
	
		int i = 1;
		int sum = 0;
		while(i<50) {
			sum += (2*i)+1;
			i++;
		}
		System.out.println("결과 : "+sum);
//쌤버전
//		//합시작
//		while(i<=100 ) {
//			if(i%2!=0) {
//				sum += i;
//			}
//			i++;
//		}
//		//합 끝, 출력
//		System.out.println("결과 : "+sum);
		
//다른학생 버전
//		while(++i<100) {
//			if(i%2 == 1) sum+=i;
//		}
//		System.out.println("결과 : "+sum);
	}

}
