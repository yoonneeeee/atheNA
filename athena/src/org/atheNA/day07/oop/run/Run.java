package org.atheNA.day07.oop.run;

import java.util.Scanner;

import org.atheNA.day07.oop.Book;
import org.atheNA.day07.oop.Circle;
import org.atheNA.day07.oop.Member;
import org.atheNA.day07.oop.Rectangle;
import org.atheNA.day07.oop.Suit;

// 실행용 클래스
public class Run {
	public static void main(String[] args) {
//		Run ex = new Run();
//		ex.oopPractice1();
		Run.oopPractice1();
		oopExercise();
		Math.random();
	}		
	// this()를 통한 실행순서
	public void constructorEx() {	
		Suit s = new Suit(100);

	// 생성자 예제 연습
//		Book book = new Book();	// 기본 생성자 이용해서 객체 생성,(컨트롤+시프트+o) 
								// title, author는 모두 비어있음.

//		book.title = "춘향뎐";
//		book.author = "작자미상";
		
	// 위의 3줄에 걸쳐서 썼던 부분을 아래와 같이 바꿀 수 있다. 
		Book book = new Book("춘향뎐", "작자미상");
		Book emptyBook = new Book();
		
		
		
		Circle bintz = new Circle();
//		bintz.radius = 10;
		bintz.setRadius(10);
	}
	
	public static void oopPractice1() {
	
	// 예제1. 
	// Circle의 instance를 이용하여
	// 이름이 달덩이, 반지름은 5인
	// Circle의 넓이를 출력해보세요~
	
	// circle.java에서 변수에 public을 붙여서 변수 선언을 해줌
	// circle.java 를 임포트 해줌(컨트롤+시프트+o)
	Circle circle = new Circle();
	circle.name = "달덩이";
	circle.radius = 5;
	// (서로 대체 가능)원의 넓이 구하기 출력
	System.out.println(circle.getArea());
	// (서로 대체 가능)원의 넓이에대한 area 변수를 선언하여 출력
	double area = circle.getArea();
	System.out.println(area);
	
	// 서클 도넛이라는 새로운 원에대한 것 선언
	Circle donut=new Circle();
	donut.radius = 2;
	donut.name ="던킨도넛";
	area = donut.getArea();
	System.out.println(area);
}		
		
	public static void oopExercise() {
		// 예제2. 	
		// 너비와 높이를 입력받아
		// 사각형의 넓이를 출력하는 클래스를 만드시오. 	
		// >> 4 5 => 20
		Scanner sc = new Scanner(System.in);
		Rectangle rect = new Rectangle();
		System.out.print(">> ");
//		int width = sc.nextInt();
		rect.width = sc.nextInt();
//		int height = sc.nextInt();
		rect.height = sc.nextInt();
//		int result = width*height;
		int result = rect.getArea();
		System.out.println("사각형의 넓이는 "+result+"입니다.");

}		
		
	public void memberPractice() {				
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
				System.out.println(member1.age);
				System.out.println(member2.name);
				System.out.println(member2.job);

	}

}
