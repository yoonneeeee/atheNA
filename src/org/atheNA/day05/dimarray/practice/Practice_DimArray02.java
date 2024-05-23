package org.atheNA.day05.dimarray.practice;

public class Practice_DimArray02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//	5	10	15	20	25  
		//	4	9	14	19	24
		//	3	8	13	18	23
		//	2	7	12	17	22
		//	1	6	11	16	21
		// arrs[4][0] arrs[3][0] arrs[2][0] arrs[1][0] arrs[0][0]
		// arrs[4][1] arrs[3][1] arrs[2][1] arrs[1][1] arrs[0][1]
		int[][] arrs = new int[5][5];			// 배열 선언
		
		int k = 1;
		for(int i=0; i<5 ; i++) {				// 행 생성
			for(int j = 4;j>=0 ; j--) {			// 행에 해당하는 열 생성(단,43210순으로 됨 --이니까) 
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
