package org.atheNA.day05.random;

import java.util.Random;

public class Exam_random {
	public static void main(String [] args) {
			// 확률 : 주로 게임에서 많이 활용됨.
		Random rand = new Random();
//		for(int i=0 ; i<100 ; i++) {
		int num = rand.nextInt(10);
		System.out.print(num+" \n");
//		}
//		
//		// 25부터 35 사이의 랜덤한 수를 출력하시오.
//		// rand.nextInt(10) + 25 // 25 ~ 34
//		// -25	-25
//		// 0~10+1->11
//		
//		// 1 또는 2 랜덤한 수를 출력하도록 하시오.
//		// rand.nextInt() ???
//		// -1      -1
//		// 0~1 + 1 -> 2
//		// rand.nextInt(2) +1 // 1~2
//		
//		// 1~10 사이의 랜덤한 수를 구하시오.
//		// rand.nextInt(10) : 0~9 사이의 랜덤한 수
//		for(int i = 0; i<100; i++) {
//		num = rand.nextInt(10)+1;		// 1~10 사이의 랜덤
//		System.out.print(num+" ");
//		}
//		for(int i = 0; i<50;i++) {
////		double randNum = Math.random(); 		// 1이하의 소수점 출력됨 -> 0~9까지 출력하고 싶다면 아래처럼 
			// Random rand = new Random();  // 써야됨
			// rand.nextInt()				// rand를 통해서 원하는 기능 사용
			// Math math = new Math(); 		//안써도 됨
//			int randNum = (int)(Math.random()*10); 	// 0~9 사이의 값
//			// 1~10 사이의 값
//			// (int)(Math.random()*10)+1
//			
//			// 25~35 사이의 값
//			//(int)(Math.random()*10)+26
//			randNum = (int)(Math.random()*11)+25;
//			//  0 ~ 10
//			// +25	+25
//			System.out.println(randNum);
//		}
	}
}
