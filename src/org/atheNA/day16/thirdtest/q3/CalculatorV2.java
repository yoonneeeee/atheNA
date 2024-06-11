package org.atheNA.day16.thirdtest.q3;

public class CalculatorV2 extends Calculator{
	public double avg(int num1, int num2){
		return (num1+num2)/(double)2;
		
}
	public int bigNum(int num1, int num2) {
		if(num1>num2) {
			return num1;
		}else if(num1<num2) {
			return num2;
		}else {
			return 0;
		}
	}
	@Override
	public int minus(int num1, int num2) {
		return num1-num2;
	}

}
