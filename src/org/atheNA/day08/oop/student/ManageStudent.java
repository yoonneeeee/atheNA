package org.atheNA.day08.oop.student;

import java.util.Scanner;

public class ManageStudent {
	// 멤버 필드
	int kor;
	int eng;
	int math;
	// 생성자
	public ManageStudent() {}
	
	public void inputScore() {
		Scanner sc = new Scanner(System.in);
		System.out.println("====== 성적 입력 ======");
		System.out.println("1. 국어 : ");
		kor = sc.nextInt();					
		System.out.println("2. 영어 : ");
		eng = sc.nextInt();
		System.out.println("3. 수학 : ");
		math = sc.nextInt();
		
	}

	public void printScore() {
		System.out.println("===== 성적 입력=====");
		System.out.println("1. 국어 : "+kor);					
		System.out.println("2. 영어 : "+eng);					
		System.out.println("3. 수학 : "+math);					
		System.out.println("4. 총점 : "+(kor+eng+math));
		System.out.println("5. 평균 : "+(kor+eng+math)/3.0);
		
	}





}