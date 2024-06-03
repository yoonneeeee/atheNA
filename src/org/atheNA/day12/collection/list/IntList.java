package org.atheNA.day12.collection.list;

public class IntList {
	int[] nums;
	int size;

	public IntList() {
		nums = new int[3];
		size = 0;
	}
	// 매개변수 없이 기본형을 써놓고, 필요할 때 넣어서 사용하는 습관 들이기
	
	public void add(int num) {
		nums[size] = num;
		size++;
	}
	// 꺼내서 사용하려는 함수. 
	// 전체 값을 가져올떄는 매개변수 필요 없음
	// 그런데 1개의 값을 가져올 때는 그 위치가 필요하므로 매개변수 필요함. 
	public int get(int index) {
//		return nums;			// 리턴타입 int [] : 리턴값의 자료형
		return nums[index];		// 리턴타입 int : 리턴값의 자료형
	}
	public int size() {
		return size;
	}
	public void clear() { 			//다지워버리겠따
		// 1. for문 돌면서 초기화
		// 2. 배열 자체 초기화
		nums = new int[3];
		size = 0;
	}
	
}
