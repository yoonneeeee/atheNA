package org.atheNA.day05.array.exercise;

import java.util.Scanner;

public class Exercise_Array1 {

	public static void main(String[] args) {
		// 배열의 length 필드를 이용하여 배열 크기만큼 정수를 입력받고
		// 평균을 구하는 프로그램을 작성하라. 
		// 단, 배열의 크기는 5이다.(배열 없이 가능하지만, 배열을 사용해보라)
		// 정수입력 : 24
		// 정수입력 : 10
		// 정수입력 : 23
		// 정수입력 : 5
		// 정수입력 : 7
		//////////////////////////////////////////////////////////////////////
		int [] nums = new int[5];
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.println("정수를 입력해주세요. ");
		// 정수 입력 5번 하는데 배열에 저장하시고
		for(int i = 0; i<nums.length;i++){
			System.out.print("정수 입력 : ");
			nums[i] = sc.nextInt();
		}
		// 배열에 있는 값을 꺼내서 더한 후 평균 구해서 출력
		// sum = nums[0]+nums[1]+nums[2]+nums[3]+nums[4];
		// for문을 이용해서 반복적으로 일어나는 합 자동으로 처리하기 
		for(int i = 0; i<5; i++) {
			sum += nums[i];			// sum=sum+nums[i];
		}
		System.out.print("정수들의 평균 값 : " + (double)sum/nums.length);
	}
}
