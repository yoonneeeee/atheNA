package org.atheNA.day06.array.sort;

public class Exam_BubbleSort {
	public static void main(String[] args) {
	
		// 버를정렬이란?
		// 인접한 두개의 원소를 검사하여 정렬하는 방법.
		// 구현이 쉽다는 장점, 이미 정렬된 데이터를 정렬할 때 가장 빠름.
		// 기본적으로 다른 정렬에 비해서 속도가 느린편이며 역순으로 정렬할 때 가장 느림.

	// {2, 5, 4, 1, 3}
	// ** 두번째 자리의 숫자를 골라  순서대로 비교해서 더 작으면 자리 교환
		//	{2, 5, 4, 1, 3} 
		// 	{2, 4, 5, 1, 3}
		//  {2, 4, 1, 5, 3}
		//  {2, 4, 1, 3, 5} >> 4회 비교 >> 첫번째 결과

	// {2, 4, 1, 3, 5}
	// ** 두번째 자리의 숫자를 골라  순서대로 비교해서 더 작으면 자리 교환
		//  {2, 4, 1, 3, 5} 
		//  {2, 1, 4, 3, 5}
		//  {2, 1, 3, 4, 5} >> 3회 비교 >> 두번째 결과 
		
	// {2, 1, 3, 4, 5} 
	// ** 두번째 자리의 숫자를 골라  순서대로 비교해서 더 작으면 자리 교환
		// 	{1, 2, 3, 4, 5}
		// 	{1, 2, 3, 4, 5} >> 2회 비교 >> 세번째 결과 => 정렬 끝
		
	// {1, 2, 3, 4  5}
	// ** 두번째 자리의 숫자를 골라  순서대로 비교해서 더 작으면 자리 교환
		//  {1, 2, 3, 4  5} >> 1회 비교 >> 4번째 결과 => 비교 끝
				
		int arrs[] = {2, 5, 4, 1, 3};
		
		for(int i=0; i< arrs.length-1; i++) {
			// 비교하는 코드
			for(int j=0; j<(arrs.length-1)-i; j++) {
				if(arrs[j]>arrs[j+1]) {
					int temp = arrs[j+1];
					arrs[j+1] = arrs[j];
					arrs[j] = temp;
				}
			}
		}
		for(int num : arrs ) {
			System.out.print(num+" ");
		}
	}
}
/////////////////////////////////////////////////////
//		if(int i=0; i< arrs.length - 1; i++) {
//			int temp = arrs[2];
//			arrs[2] = arrs[1];
//			arrs[1] = temp;
//		}
//		if(int i=0; i< arrs.length - 1; i++) {
//			int temp = arrs[3];
//			arrs[3] = arrs[2];
//			arrs[2] = temp;
//		}
//		if(int i=0; i< arrs.length - 1; i++) {
//			int temp = arrs[4];
//			arrs[4] = arrs[3];
//			arrs[3] = temp;

