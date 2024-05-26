package org.atheNA.day07.oop;

public class Circle {
	// 멤버 필드
		// 반지름		
		// 넓이
		public double radius;
		public String name;
		
		public void setRadius(double radius) {
			this.radius = radius;
		}
	// 멤버 메소드(행동적 특성)
		//넓이 구하기
//		public void getArea() {
		public double getArea() { 			// 소괄호가 메쏘드
			// return 사용 시, public 옆에 
			// 리턴값과 같은 데이터타입을 써야 함. => void 대신 "double"
			return 3.14*this.radius*this.radius;	
		}
}
