package org.atheNA.day05.array;

public class Exam_Array {
	
	public static void main(String[] args) {
		int num;	//변수의 선언
		num = 1;	//변수의 초기화, 리터럴 선언
		
		int [] nums;			//배열의 선언				ㅁ
		nums = new int[10];		//배열의 생성(할당)			ㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁ
		nums[0] = 1;			//배열의 초기화
				
		System.out.println(nums[0]);
		System.out.println(nums[1]);
		System.out.println(nums[2]);
		System.out.println(nums[3]);
		System.out.println(nums[4]);
		System.out.println(nums[5]);
		System.out.println(nums[6]);
		System.out.println(nums[7]);
		System.out.println(nums[8]);
		System.out.println(nums[9]);
		System.out.println(nums.length);	// 배열의 갯수를 확인하고 싶을 때 사용하는 것 
//		System.out.println(nums[10]);
		
		for(int i = 0; i < 10 ; i++) {
			System.out.println(nums[i]);
		}

		
		
	}
}
