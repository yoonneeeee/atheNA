package org.atheNA.day07.oop;

// 접근 지정자(제한자)
// 종류 : public, protected, default, private

class Sample {
	public int a;
	private int b;
	int c;
}

public class Exam_Access {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample smp = new Sample();
		smp.a = 507;
//		smp.b = 1023;	// The field Sample.b is not visible // 프라이빗이라 불러올 수 없음
		smp.c = 2024;
	}

}
