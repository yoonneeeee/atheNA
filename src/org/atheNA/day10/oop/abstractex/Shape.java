package org.atheNA.day10.oop.abstractex;

class Line extends Shape{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
	}
	
}
public abstract class Shape {
	String name;
	
	public Shape() {}
	
	public void paint() {} 				//일반 메소드
	public abstract void draw();		//추상 메소드(몸체({})없음), 있으면 반드시 추상 클래스
										// only be defined by and abstract class

}
