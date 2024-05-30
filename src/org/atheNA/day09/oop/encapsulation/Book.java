package org.atheNA.day09.oop.encapsulation;

public class Book {
	public static void main(String[] args) {
// 필드에 직접 접근하여 초기화(옳지 않음	
		// Book book = new Book();
		// book.title ="춘향던";
		// book.author ="작자미상";

// 필드에 직접 접근하지 않고 객체 초기화 하는 방법
		// 생성자를 통한 초기화
		Book book = new Book("춘향뎐", "작자미상");

		// setter()메소드를 이용한 초기화
		Book bookbook = new Book();
		bookbook.setTitle("춘향뎐");
		bookbook.setAuthor("작자미상");

	}

	private String title; // 캡슐화 : 변수선언에 private를 붙여줌
	private String author;

	public Book() {
		this("", "");
	}

	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
// setter(), getter()을 왜 쓰는 걸까?
// 만드는 규칙이 있나? 
//	1. set을 쓰고 필드명을 낙타표기법으로 써줌
//		ex) 필드가 name이면 setter()메소드는 setName()가 됨
//	2. get을 쓰고 필드명을 낙타표기법으로 써줌
//		ex) 필드가 age이면 getter()메소드는 getAge()가 됨

// setter() 메소드 : 필드에 직접 접근하지 못하게 하고 우회하여 접근하게 하려고

	public void setTitle(String title) {
		this.title = title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

// getter() 메소드
	public String getTitle() {
		return this.title;
	}

	public String getAuthor() {
		return this.author;
	}

	// 멤버필드
	// 제목 bookTitle
	// 가격 bookPrice
	// 저자 bookAuthor
	// 카테고리 category
	// 출판사 publisher
	// 출판날짜 publishingDate
//	String title;
//	int price;
//	String author;
//	String category;
//	String publisher;
//	String publishingDate;

	// 멤버메소드
	// 빌려주다, 팔리다, 입고되다(등록), ...
}
