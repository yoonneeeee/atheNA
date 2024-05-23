package org.atheNA.day05.random.exercise;

import java.util.Scanner;
import java.util.Random;

public class Exercise_Random2 {
	public static void main(String[] args) {
		// 가위 바위 보 중 하나를 선택, 승패를 결정하는 게임
		// ===== 가위 바위 보 게임 ======
		// 숫자를 선택하세요.(1.가위/2.바위/3.보) :
		// =============결과=============
		// 당신은 가위를 냈습니다. 
		// 컴퓨터는 보를 냈습니다. 
		// ==============================
		// 당신이 이겼습니다. ^^*
		
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
//		int num = rand.nextInt(2);
//		System.out.print(num+" \n");
		while(true) {
			int computer = (int)(Math.random()*2)+1; //1~2 사이의 랜덤한 수
			System.out.print("숫자를 입력하세요. (1. 앞면 / 2. 뒷면) :");
			int choice = sc.nextInt();
			if(choice == -1) break;
			// int computer = rand.nextInt(2)+1;  //1~2사이의 랜덤한 수 
			if(computer == choice) {
				System.out.println("맞췄습니다. ");
			}else {
				System.out.println("틀렸습니다. ");
			
			}
		}
	}
}
