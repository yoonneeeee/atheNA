package org.atheNA.day14.javaapi;

import java.util.Calendar;

public class Exam_Calendar {

	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
//		System.out.println(today);
		System.out.println(today.get(Calendar.YEAR)+"년");
		System.out.println(today.get(Calendar.MONTH)+1+"월");		//month는 0부터 시작으로 되어있어서 +1해줘야함
		System.out.println(today.get(Calendar.DAY_OF_MONTH)+"일");
		System.out.println(today.get(Calendar.DATE)+"일");
		System.out.println(today.get(Calendar.HOUR_OF_DAY)+"시");
		System.out.print(today.get(Calendar.HOUR)+"시");
		System.out.print(today.get(Calendar.MINUTE)+"분");
		System.out.print(today.get(Calendar.SECOND)+"초");
		System.out.print(today.get(Calendar.MILLISECOND)+"밀리초");
		System.out.print(today.get(Calendar.AM_PM)+"");

		Calendar startDate = Calendar.getInstance();
		printDate("개강한 날은 ", startDate);
		// 개강한 날은 2024/05/07/화요일(9시) 오전9시 00분0초0밀리초
		
	}
	
	public static void printDate(String title, Calendar date) {
		
		
	}

}
