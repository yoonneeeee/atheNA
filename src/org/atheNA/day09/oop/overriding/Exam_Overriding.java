package org.atheNA.day09.oop.overriding;

public class Exam_Overriding {
	
	static void paint(Shape shape) { 	//페인트라는 메쏘드를 통해서
////////// 오버라이딩 //////////
		/*
		 * 오버라이딩이란 ? 
		 * 1. 오버라이딩은 상속관계에서 사용 
		 * 2. 오버라이딩은 다 똑같고(접근지정자, 반환형, 메소드명, 매개변수 갯수와 타입)
		 * 실행문장만 재정의하는 것 
		 * 3. 오버라이딩이 되면 동적바인딩이 되어 다형성을 이용할 수 있음.
		 */

		/*
		 * Shape shape = new Shape();
		 * Shape shape = new Circle();
		 * Shape shape = new Line();
		 * Shape shape = new Rectangle();
		 * */
		
		shape.draw();					// 드로우라는 매쏘드를 통해서 다형성이라는 
	}
	public static void main(String[] args) {
		Shape shape = new Shape();
		paint(shape);
		Circle circle = new Circle();
		paint(circle);
		Line line = new Line();
		paint(line);
		Rectangle rect = new Rectangle();
		paint(rect);
//		Shape shape = new Shape();
//		shape.draw();
//		Circle circle = new Circle();
//		circle.draw();
//		Line line = new Line();
//		line.draw();
//		Rectangle rect = new Rectangle();
//		rect.draw();

	}
}
// 슈퍼키워드는 부모가 갖고있는 것을 갖고와서 사용하는 것
// 