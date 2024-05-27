package org.atheNA.day05.dimarray.practice;

public class Exercise_DimArray {
	public static void practice1() {
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
	public static void practice2() {
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
	public static void practice3() {
//		1	6	//15	20	25  
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
	public static void practice4() {
		//	1	2	3	4	5	  
		//	10	9	8	7	6
		//	11	12	13	14	15
		//	20	19	18	17	16
		//	21	22	23	24	25
		// arrs[0][0] arrs[0][1] arrs[0][2] arrs[0][3] arrs[0][4]  - 열 증가
		// arrs[1][4] arrs[1][3] arrs[1][2] arrs[1][1] arrs[1][0]  - 열 감소
		// arrs[2][0] arrs[2][1] arrs[2][2] arrs[2][3] arrs[2][4]  - 열 증가
		// arrs[3][4] arrs[3][3] arrs[3][2] arrs[3][1] arrs[3][0]  - 열 감소
		// arrs[4][0] arrs[4][1] arrs[4][2] arrs[4][3] arrs[4][4]  - 열 증가

		//
		int[][] arrs = new int[5][5];			// 배열 선언
		int k = 1;
		
		
		for(int i=0; i<5 ; i++) {				// 행 생성
			if(i%2==0) {
				for(int j =0 ;j<5 ; j++) {			// 행에 해당하는 열 생성(단,43210순으로 됨 --이니까) 
					arrs[i][j] = k++;
				}
			}else {
				for (int j = 4; j>=0 ; j--) {
					arrs[i][j]=k++;
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
}
