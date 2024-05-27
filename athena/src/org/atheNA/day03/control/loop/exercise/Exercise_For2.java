package org.atheNA.day03.control.loop.exercise;

public class Exercise_For2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1~10까지의 덧셈을 표시하고, 합고 구하시오.
		
		int sum = 0;
//		sum = 1;
//		sum = 1+2;
//		sum = 1+2+3;
//		sum = 1+2+3+4;
//		sum = 1+2+3+4+5;
//		sum = 1+2+3+4+5+6;
//		sum = 1+2+3+4+5+6+7;
//		sum = 1+2+3+4+5+6+7+8;
//		sum = 1+2+3+4+5+6+7+8+9;
//		sum = 1+2+3+4+5+6+7+8+9+10;
//		sum = sum+1
		int i;
		for(i = 1; i < 11; i++) {
			sum += i;
			if(i <=9) System.out.print(i+"+");
			else System.out.print(i+"=");
		}		
			System.out.print(sum);
//			System.out.print("1+");
//			System.out.print("2+");
//			System.out.print("3+");
//			System.out.print("4+");
//			System.out.print("5+");
//			System.out.print("6+");
//			System.out.print("7+");
//			System.out.print("8+");
//			System.out.print("9+");
//			System.out.print("10=");
	}

}
