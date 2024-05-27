package org.atheNA.day05.dimarray.exercise;

public class Exercise_DimArray01 {

	public static void main(String[] args) {

		//1 2 3 4 5 
		//6 7 8 9 10
		int[][] arrs = new int[5][5];			// 배열 선언
		int k = 1;
		for(int i=0; i<5 ; i++) {				// 행 생성
			for(int j = 4;j>=0 ; j--) {			// 행에 해당하는 열 생성(단,43210순으로 됨 --이니까) 
				arrs[i][j] = k;					
				k++;
			}
		}
		for(int [] arr: arrs) {					// 출력
			for(int num : arr) {
				System.out.print(num +"\t");
			}
			System.out.println();
		}
		
	}

}
