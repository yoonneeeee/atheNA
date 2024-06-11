package org.atheNA.day06.array.sort;

public class Exam_ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//// 알고리즘의 시작
		// 정렬 알고리즘
		// 크기가 5인 배열이 있고, 24 5 7 10 23 배열이 있는데,
		// 7 24 5 23 10 이렇게 변했을 때 -> 5 7 10 23 24(오름차순으로 정렬하고 싶을 떄 어떻게 해야하는 가?)
		// 자리바꿈 발생!!
		// 1. 자리바꿈은 어떻게 해결할 것인가?
		// 2. 어떤 조건이 만족하면 바꿀 것인가?
		int num1 = 5;
		int num2 = 7;
		System.out.printf("num1 : %d, num2: %d\n", num1, num2); // num1에는 7이 들어가고 num2에는 5가 들어가도록 해야함.
		int temp = num1; // num1(5) 사라지기 전에 저장해야함
		num1 = num2;
		num2 = temp;
		System.out.printf("num1 : %d, num2: %d\n", num1, num2); // num1에는 7이 들어가고 num2에는 5가 들어가도록 해야함.

/// 3 2 1 이 되도록 바꿔보세요!!
		int nums[] = { 2, 1, 3 };

		temp = nums[0]; // 넘스 0이 사라지기 전에 temp에 값을 저장해줌
		nums[0] = nums[2]; // 넘스 0 자리에 넘스 2 숫자를 넣어줌
		nums[2] = temp; // 넘스 2 자리에 템프에 저장해놨던 넘스 0 자리 숫자 이동
						// 3 1 2 ->
		temp = nums[1];
		nums[1] = nums[2];
		nums[2] = temp;

		for (int num : nums) {
			System.out.print(num + " ");
			}
		System.out.println();
		// 5, 7, 24가 되도록 바꾸시오
		int[] opens = { 24, 5, 7 };

		int tempNum = opens[0];
		opens[0] = opens[1];
		opens[1] = tempNum;
		// 5 7 24
		tempNum = opens[1];
		opens[1] = opens[2];
		opens[2] = tempNum;
		// 5, 7, 24
		System.out.printf("%d %d %d \n", opens[0], opens[1], opens[2]);

		int[] openss = { 24, 5, 7 };

		int tempNumm = openss[0];
		openss[0] = openss[1];
		openss[1] = tempNumm;
		// 7 5 24
		tempNumm = openss[1];
		openss[1] = openss[2];
		openss[2] = tempNumm;
		// 5 7 24
		System.out.printf("%d %d %d \n", openss[0], openss[1], openss[2]);

	}

}

///// 정렬 알고리즘
//		알고리즘이란 문제해결을 하기 위한 절차나 방법, 
//		프로그래밍 언어로 어떻게 해결할 것인가를 고민해 가는 것
//		정렬 알고리즘의 종류
//		1. 삽입정렬
//		2. 선택정렬
//		3. 법를정렬
//		4. 퀵정렬
//		5. 병합정렬
