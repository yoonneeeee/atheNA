package org.atheNA.day05.dimarray;

public class Exam_sDimArray1 {

	public static void main(String[] args) {

//		int [][] arrs = new int [5][5];
//		int k = 1;
//		// 2차원 배열 값 입력하기 >> 행을 만들고, 열을 만들어야 함 >> 중첩 for문 필요함
//		for(int i =0; i < arrs.length; i++) {
//			for(int j =0; j < arrs[i].length; j++) {
//				arrs[i][j] = k;
//				k++;
//			}
//		}
//		for(int i = 0; i <arrs.length; i++) {
//			for(int j =0; j < arrs[i].length; j--) {
//				System.out.print(arrs[i][j]+" ");
//			}
//			System.out.println();
//		}
		int[][] arr = new int[5][5];					//표와 같이 출력할 5x5배열을 선언한다
        int num = 1;									//배열에 대입할 첫번째 수 num을 선언하고 초기화한다
        for (int i = 0; i < arr.length; i++) {			//배열 arr의 행의 길이만큼 반복문이 수행된다
            for (int j = 0; j < arr[0].length; j++) {	//배열arr[0]의 열의 길이만큼 반복문이 수행된다
                arr[i][j] = num;						//arr[i][j]에 num을 대입한다
                System.out.print(arr[i][j]+ " ");		//배열 arr에 들어있는 숫자를 출력한다
                num++;//num을 1증가시킨다
            }
            System.out.println();//줄을 바꾼다
        }
	}

}
