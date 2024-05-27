package org.atheNA.day06.array.sort;

public class Exam_SelecetionSort {

	public static void main(String[] args) {

	// 선택 정렬이란?
	// 배열을 전부 검색하여 최소값을 고르고 왼쪽부터 채워나가는 정렬
	// 특징 : 데이터의 양이 적을 때 좋은 성능을 보여주는 정렬
	// 데이터 양이 만을 때 급격한 성능 저하를 보임.
	// 원소의 개수가 적을 때나 이미 거의 정렬된 상태일 때 사용. but 느리고 비효율적이라 실제로 잘 사용되지 않음.
	// 배열의 n번 인덱스 값을 n+1 ~ 마지막 인덱스까지 비교함.
		
		// {2, 5, 4, 1, 3} 첫번째자리가 최소값이라 가정하에 비교한 결과 네번째자리수가 더 작으므로 교환
		// {1, 5, 4, 2, 3} 결과 / 5가 최소값이라 가정하에 오른쪽 숫자들과 비교한 결과 네번째 수가 더 작으므로 교환
		// {1, 2, 4, 5, 3} 결과 / 4가 최소값이라 가정하에 오른쪽 숫자들과 비교한 결과 다섯번째 수가 더 작으므로 교환
		// {1, 2, 3, 5, 4} 결과 / 5가 최소값이라 가정하에 
		// {1, 2, 3, 4, 5}
		int [] arrs = {2,5,4,1,3};
		int min = 0;
		for(int i = 0; i<arrs.length-1 ;i++) {

//			for(int j = i; j>=0; j--) {
			for(int j=i+1; j<arrs.length; j++) {
				if(arrs[min] > arrs[j]) { 
				// 최소값이 나왔을 때,
				// 그때의 인덱스(자리)를 기억하자!
					min = j;			// 최소값이 정해졌을 때 min을 arrs[min]으로 구하면 최소값
				}
			}
			int temp = arrs[i];
			arrs[i] = arrs[min];
			arrs[min] = temp;
		}
		for(int num : arrs ) {
				System.out.print(num+" ");
			}
//////////////////////////구조도///////////////////////////////
//				if(arrs[0] > arrs[1]) { } 
//				if(arrs[0] > arrs[2]) { }
//				if(arrs[0] > arrs[3]) { }
//				if(arrs[0] > arrs[4]) { }
//					int temp = arrs[0];
//					arrs[0] = 최소값;
//					최소값의 자리 = temp;
//				if(arrs[1] > arrs[2]) { }
//				if(arrs[1] > arrs[3]) { }
//				if(arrs[1] > arrs[4]) { }
//					int temp = arrs[1];
//					arrs[3] = 최소값;
//					최소값의 자리 = temp;
//				if(arrs[2] > arrs[3]) { }
//				if(arrs[2] > arrs[4]) { }
//					int temp = arrs[2];
//					arrs[3] = 최소값;
//					최소값의 자리 = temp;
//				if(arrs[3] > arrs[4]) { }
//				int temp = arrs[3];
//					arrs[3] = 최소값;
//					최소값의 자리 = temp;
///////////////////////////////////////////////////////////////
	}

}
