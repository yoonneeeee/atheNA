package org.atheNA.day07.oop;

public class Suit {
	public static void main(String[] args) {
		Suit s = new Suit(100);
	}
	int size;
	String brand;
	int price;
	
	
	//
	public Suit(int size) { 
		this(size, "Hazzys");
	//첫번째 호출 => 두번째 호출 => 출력
		System.out.println("Suit(int) 호출!!");
	}
	public Suit(int size, String brand) {
		this(size, brand, 1000000);
	// 두번째 호출 => 세번째 호출 소환 => 출력 
		System.out.println("Suit(int, Stirng) 호출");
	}
	public Suit(int size, String brand, int price) {
		this.size= size;
		this.brand=brand;
		this.price= price;
	// 세번째 호출 => 출력1
		System.out.println("Suit(int, Stirng, int) 호출");
	}
	
}
