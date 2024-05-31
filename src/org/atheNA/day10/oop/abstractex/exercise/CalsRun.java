package org.atheNA.day10.oop.abstractex.exercise;

public class CalsRun {
	public static void main(String[] args) {
// add(5, 7)를 호출 -> 12
// substract(10,23)를 호출 -> -13
// average ({5,7,10,23})->11.02	
//		Calculator goodCalc = new GoodCalc();
		Calculator calc = new GoodCalc();			//업캐스팅
//		GoodcCalc goodCalc = new GoodCalc();
		System.out.println("합 : " + calc.add(5, 7));		// 5,7
		System.out.println("차 : " + calc.substract(10, 23));		// 10, 23
		System.out.println("평균 : " + calc.average(new int [] {5,7,10,23}));		// 5, 7, 10, 23
//		배열을 따로 선언하고 출력해도 됨.
		int [] nums = {5,7,10,23};
		System.out.println("평균 : "+calc.average(nums));
	}
}
