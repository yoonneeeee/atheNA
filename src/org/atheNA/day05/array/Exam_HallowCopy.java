package org.atheNA.day05.array;

public class Exam_HallowCopy {

	public static void main(String[] args) {
	// 배열의 복사 중 얕은 복사
	
	// 기존
	int[] arrs = new int[4];
	for(int i = 0; i < arrs.length; i++) {
		arrs[i] = i * i;
	}
	
	// for-each문
	for(int i : arrs) {
		System.out.print(i + " ");
	}
	System.out.println();
	
	int [] copy = arrs;
	copy[1] = 11;
	for(int i : copy) {
		System.out.print(i + " ");
	}
}
}