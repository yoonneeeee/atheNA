package org.atheNA.day05.array.practice;

public class Practice_Array2 {

	public static void main(String[] args) {
		// 길이가 10인 배열을 선언하고 , 1부터 10까지의 값을 반복문을 이용하여
		// 역순으로 배열 인덱스에 넣은 후 그 값을 출력하세요.
		int arrs [] = new int[10];
		int count = 10;
		for (int i = 0; i<10; i++){
			arrs[i] = count;
			count--;
			System.out.print(arrs[i]+" ");
		}
		
//		int arrss[] = new int[10];
////		int countt = 10;
//		for (int i = 0, countt =10; i++, countt--){
//			arrss[i] = countt;
////			countt--;
//			System.out.print(arrss[i]+" ");
//		}

	}

}
