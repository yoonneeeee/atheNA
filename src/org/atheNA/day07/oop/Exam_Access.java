package org.atheNA.day07.oop;

//접근지정자(제한자)
//종류 : public, protected, default, private
class Sample {
	public int a;
	private int b;
	int c;
}


public class Exam_Access {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample smp = new Sample();
		//생성자
		smp.a = 507;
		
		//smp.b = 1023;	
		// The field Sample.b is not visible
		// int b에는 private를 붙여줘 접근이 제한되었다. 
		// private의 경우 는 클래스 내부에서만 쓸 수 있다.
		// 따라서 Sample 클래스 밖에서 불러오면 사용할 수 없다. 
		
		smp.c = 2024;
	}
}