package org.atheNA.day05.array;

public class Exam_DeepCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열 복사 중 깊은 복사
		
		int [] arrs = {0,1,4,9};
		int [] copy = new int[4];		// 공간을 새로 만들고 요소를 이동한다. 
		for(int i = 0; i<arrs.length; i++) {		//arrs에 있는 숫자를 
			copy[i] = arrs[i];						//copy로 옮기는 코드
		}
		copy[1] = 11;					// copy[1] 공간에 11 선언시 첫번째 요소 변경
		for(int i : copy ) {
			System.out.print(i+" "); 	// 0, 11, 4, 9 
		}
		System.out.println(" ");
		for(int i : arrs ) {
			System.out.print(i+" ");	// 0, 1, 4, 9
		}
	}

}
