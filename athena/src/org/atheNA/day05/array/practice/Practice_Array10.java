package org.atheNA.day05.array.practice;

import java.util.Scanner;

public class Practice_Array10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("주민등록번호(-포함) : ");
		String idNum = sc.next();
		char [] idNums = new char[idNum.length()];		//길이를 숫자로 입력해도 되지만, 오류를 줄이기 위해  ####.length()
		for(int i = 0; i <idNums.length;i++) {
		idNums[i] = idNum.charAt(i);
		}
		char [] copy = new char[idNums.length];
		for(int i = 0; i <idNums.length;i++) {			//123456-1333444	원본저장
//			copy[i] = idNums[i];						//123456-1******	고객 표출용...
			if(i<8) {
				copy[i]=idNums[i];
				
			}else {
				copy[i]='*';
				
			}
		}
		for(char num : copy) {
			System.out.print(num);
		}
	}

}
