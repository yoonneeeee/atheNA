package org.atheNA.day07.oop;

class StaticSample{
	public int num;
	public static int input;
	
	public void sampleMethod() {}
	public void goodMethod() {}
	public static void originMethod() {
		input =2024;		
	}
}
public class Exam_Static {
	public static void main(String[] args) {
//		StaticSample smp = new StaticSample();
		StaticSample.input = 2023;
		StaticSample.originMethod();
//		System.out.println(StaticSample.input);
//		smp.num=507;
//		smp.sampleMethod();
//		smp.goodMethod();
	}
}
