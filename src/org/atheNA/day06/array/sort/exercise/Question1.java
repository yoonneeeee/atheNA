package org.atheNA.day06.array.sort.exercise;

import java.util.Scanner;

public class Question1 {
	public static void main(String [] args) {
		int [] nums = new int[5];
		int i = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("5개의 정수를 입력해주세요.");
		for(i = 0; i<nums.length;i++){
			System.out.print(i+1+"번째정수 입력 : ");
			nums[i] = sc.nextInt();
		}
		
		for(i=0; i< nums.length-1; i++) {
			for(int j=0; j<(nums.length-1)-i; j++) {
				if(nums[j]>nums[j+1]) {
					int temp = nums[j+1];
					nums[j+1] = nums[j];
					nums[j] = temp;
				}
			}
		}
		System.out.print("정렬된 결과 : ");
		for(int num : nums ) {
			System.out.print(num+" ");
		}
		int sum = nums[0]+nums[4];
		System.out.printf("\n정렬 후 첫번째 수와 마지막 수의 합 : %d", sum);
	}
}
