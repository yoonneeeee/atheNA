package org.atheNA.day05.array.practice;

public class Practice_Array1 {

	public static void main(String[] args) {

// 문제1
// 길이가 10인 배열을 선언하고 1부터 10 까지의 값을 반복문을 이용하여
// 순서대로 배열 인덱스에 넣은 후 그 값을 출력하세요. 
//		ex. 1 2 3 4 5 6 7 8 9 10
		int [] arrs = new int[10];
		
		for(int i = 0;i<10;i++) {
			arrs[i] = (i+1);
			System.out.print(arrs[i]+" ");
		}
///////////////////////////////////////
// 이렇게 다 입력해도 되지만, for문을 이용하여 반복실행하면 더 간단하게 쓸 수 있음. 
//		arrs[0] = 1;
//		arrs[1] = 2;
//		arrs[2] = 3;
//		arrs[3] = 4;
//		arrs[4] = 5;
//		arrs[5] = 6;
//		arrs[6] = 7;
//		arrs[7] = 8;
//		arrs[8] = 9;
//		arrs[9] = 10;
////////아래 부분이 반복되므로, for문안에것을 위로 올려도 됨.
//		for(int i = 0; i<10; i++) {
//		System.out.print(arrs[i]+" ");
//		}
	}

}
