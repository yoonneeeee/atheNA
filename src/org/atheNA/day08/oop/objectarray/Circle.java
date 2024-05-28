package org.atheNA.day08.oop.objectarray;

public class Circle {
	public int radius;
	public Circle() {} //클래스 이름과 똑같은 것 : 생성자
	public Circle(int radius) {
		this.radius=radius;
	}
	
	public double getArea() {
		double area = 3.14*this.radius*this.radius;
		return area;
	}
}
