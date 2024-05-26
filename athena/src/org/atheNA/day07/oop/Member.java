package org.atheNA.day07.oop;

import java.util.Scanner;

public class Member {
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		Member member1 = new Member();		// 객체1 생성
		member1.name = "일용자";
		member1.age = 33;			
		member1.job = "의사";
		Member member2 = new Member();		// 객제2 생성
		member2.name ="이용자";
		member2.age = 22;
		
		System.out.println(member1.name);
		System.out.println(member1.job);
		System.out.println(member1.salary);
		System.out.println(member2.name);
		System.out.println(member2.job);
		System.out.println(member2.salary);
	}
	
/// 멤버변수(필드)
	public String name;			// 문자열
	char genter;			// 문자
	public int age; 				// 숫자
	String education; 		// 숫자
	long salary; 			// 숫자
	public String job;				// 문자열
	String property;		// 집 2채(String), 차동차 2대(String), 500,000,000(long)
	String phone;			// 01044720123 // 문자열로 들어감. 숫자일 경우 0부터 시작 불가능
	String address;			// 문자열
	boolean divorceYN;		// 
	String children;		// 1남 1녀, 아들1, 딸1
/// 생성자	
	public Member() {} 		// 생성자
	
/// 멤버메소드(메소드) // 행위
	public void registerMember() { }
	public void doHeart() { }
	public void sendMessage() { }
	public void doPromise() { }
	
	
}
