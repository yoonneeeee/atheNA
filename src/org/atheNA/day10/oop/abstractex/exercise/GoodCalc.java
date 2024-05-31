package org.atheNA.day10.oop.abstractex.exercise;
//상속 >> extends Calculator >> 빨간줄.. >> 1번..
// 카큘레이터라는 추상 클래스 상속
public class GoodCalc extends Calculator{

	@Override
	public int add(int a, int b) {
		return a+b;
	}

	@Override
	public int substract(int a, int b) {
		return a-b;
	}

	@Override
	public double average(int[] a) {
		//배열로 넘어오는 값을 하나씩 꺼내서 누적합을 한 뒤 배열의 길이로 나눠준다.
		int sum = 0;
//		for(int i = 0; i < a.length ; i++) { sum += a[i] }
		for(int num:a) {
			sum +=num;
		}
		double avg = (double)sum/a.length;
		return avg;
	}  			

}
