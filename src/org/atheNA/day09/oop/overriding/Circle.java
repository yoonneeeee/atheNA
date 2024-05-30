package org.atheNA.day09.oop.overriding;

public class Circle extends Shape { // extends Shape 상속
	@Override
	public void draw() {
		System.out.println("Circle");
	}
}
