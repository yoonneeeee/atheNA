package org.atheNA.day04.control.loop.exercise;

public class Exercise_ForDouble3 {

	public static void main(String[] args) {
		// 2단을 세로로 출력, 그 옆에 3단 세로로 출력, 그 옆에 4단 세로로 출력
// println이 줄을 띄우는 거라 -> print로 변경해봄///////////
// 2,3,4단이 각각 가로로 출력됨...->오답////////////////////
//		for(int j=2 ; j<5 ; j++) { 
//			for(int i = 1; i <10; i++) {
//				System.out.print(j+" * "+ i +" = "+ j*i+"     ");			
//			} System.out.println("  ");
//		}	
//////그래서 변수의 위치를 바꿔봄...->정답/////////////////////		
		for(int i = 1; i <10; i++) { 
			for(int j=2 ; j<10 ; j++) {
				System.out.print(j+" * "+ i +" = "+ j*i+"     ");	
				System.out.print("\t");		// "\t" 탭만큼 띄우기
			} System.out.println(" ");		// @ * 1 = @ 하고 줄 띄우기 위해서
		}									// 출력하고 개행하기
/////////////////////////////////////////////////////////		
		
		
		
	} 
		
}
