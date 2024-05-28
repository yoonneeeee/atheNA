package org.atheNA.day08.oop.objectarray;

public class Book {
// 제목 >> 어린왕자
	public String title;
	public String author;
	
	public Book() {}
	public Book(String title, String author) {
		this.title = title;
		this.author= author;
		
	}
	
// 저자
	public String toString() {
		return"("+this.title+","+this.author+")";
				
	}
	
}
