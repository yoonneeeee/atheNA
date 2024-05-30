package org.atheNA.day09.oop.encapsulation;

public class Student {
	private String name;
	private int firstScore;
	private int secondScore;
	
	public Student() {
		
	}
	
	public Student(String name, int firstScore, int secondScore) {
		this.name = name;
		this.firstScore = firstScore;
		this.secondScore = secondScore;
	}
///// setter(), getter()을 왜 쓰는 걸까?
///// 만드는 규칙이 있나? 
//		1. set을 쓰고 필드명을 낙타표기법으로 써줌
//			ex) 필드가 name이면 setter()메소드는 setName()가 됨
//		2. get을 쓰고 필드명을 낙타표기법으로 써줌
//			ex) 필드가 age이면 getter()메소드는 getAge()가 됨

///// setter() 메소드 : 필드에 직접 접근하지 못하게 하고 우회하여 접근하게 하려고
	// setter 메소드
	public void setName(String name) {
		this.name = name;
	}
	public void setFirstScore(int firstScore) {
		this.firstScore = firstScore;
	}
	public void setSecondScore(int secondScore) {
		this.secondScore = secondScore;
	}
	
	// getter 메소드
	public String getName() {
		return name;
	}
	public int getFirstScore() {
		return this.firstScore;
	}
	public int getSecondScore() {
		return secondScore;
	}
	
	public String toString() {
		return this.name+" 학생의 첫번째 점수는 " 
			+this.firstScore +"점, 두번째 점수는 " 
			+this.secondScore+"점입니다.";
	}
}
