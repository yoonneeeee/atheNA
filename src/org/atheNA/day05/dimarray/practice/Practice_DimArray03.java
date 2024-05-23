package org.atheNA.day05.dimarray.practice;

public class Practice_DimArray03 {

	public static void main(String[] args) {
		//	1	6	//15	20	25  
		//	2	7	//14	19	24
		//	3	8	//13	18	23
		//	4	9	//12	17	22
		//	5	10	//11	16	21

		int[][] arrs = new int[5][5];			// 배열 선언
		
		int k = 1;
		for(int i=0; i<5 ; i++) {				// 행 생성
			for(int j = 0;j<5 ; j++) {			// 행에 해당하는 열 생성(단,43210순으로 됨 --이니까) 
				arrs[j][i] = k++;
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
