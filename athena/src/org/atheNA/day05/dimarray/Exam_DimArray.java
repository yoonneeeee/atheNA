package org.atheNA.day05.dimarray;

public class Exam_DimArray {
	public static void main(String[] args) {
		int num = 0;						// 변수 선언
		int [] nums = new int[10];			// 배열 선언(10개짜리)
		int [][] dimNums = new int [2][5];	
				// 2차원 배열 /앞은 행, 뒤는 열
				// 4*4 => 두수가 같으면 '정방형'
		System.out.println("행의 길이 " + dimNums.length);
		System.out.println("열의 길이 " + dimNums[0].length);
		
		int [][] arrs = new int [4][4];
		int k = 1;
		// 2차원 배열 값 입력하기 >> 행을 만들고, 열을 만들어야 함 >> 중첩 for문 필요함
		for(int i =0; i < arrs.length; i++) {
			for(int j =0; j < arrs[i].length; j++) {
				arrs[i][j] = k;
				k++;
			}
		}
		for(int i =0; i <arrs.length; i++) {
			for(int j =0; j < arrs[i].length; j++) {
				System.out.print(arrs[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
//////// 배열에 대한 값 지정을 아래와 같이 할 수 있으나,
//////// 규칙적으로 반복되는 곳이 있기 때문에, 
//////// 중첩 for 문을 통해서 반복 할 수 있다. 
//		arrs[0][0] = 1;		// 첫번째 행의 첫번째 열
//		arrs[0][1] = 2;		// 첫번째 행의 두번째 열
//		arrs[0][2] = 3;
//		arrs[0][3] = 4;
//		arrs[1][0] = 5;		// 두번째 행의 첫번째 열
//		arrs[1][1] = 6;		// 두번째 행의 두번째 열
//		arrs[1][2] = 7;
//		arrs[1][3] = 8;
//		arrs[2][0] = 9;			// 세번째 행의 첫번째 열
//		arrs[2][1] = 10;		// 세번째 행의 두번째 열
//		arrs[2][2] = 11;
//		arrs[2][3] = 12;
//		arrs[3][0] = 13;		// 세번째 행의 첫번째 열
//		arrs[3][1] = 14;		// 세번째 행의 두번째 열
//		arrs[3][2] = 15;
//		arrs[3][3] = 16;
		
		
		
		
	}
}
