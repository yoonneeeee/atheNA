package org.atheNA.day08.oop.objectarray;

import java.util.Scanner;

public class Exam_ObjectArray2 {
	public static void main(String[] args) {
//	여러개의 책이 존재하는 데 그 책의 정보를 여러개 저장하려고 함.
// 책은 5권까지 저장할 수 있도록 하고, 제목과 저자만 입력받아 저장할 수 있는 
// 프로그램을 작성하시오
		// 제목 >> 어린왕자 // 작가 >> 쌩텍쥐베리
		// 제목 >> 춘향뎐 // 작가 >> 작가미상
		Book[] books = new Book[3];
		Scanner sc = new Scanner(System.in);
		// 객체 배열 입력
		for(int i = 0; i<books.length;i++) {
			System.out.println(">>");
			String title = sc.nextLine();			//띄어쓰기 및 엔터를 입력 받음
			System.out.println(">>");
			String author = sc.nextLine();
			books[i]=new Book(title, author);
		}
		for(Book book : books) { 
			System.out.println(book.toString());
		}
	}
}
