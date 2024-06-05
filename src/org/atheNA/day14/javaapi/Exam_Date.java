package org.atheNA.day14.javaapi;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Exam_Date {

	public static void main(String[] args) {
		// datd.utl로 임포트!!
		Date date = new Date();
		System.out.println(date);
		SimpleDateFormat trans = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss"); 		//년월일 시분초
		SimpleDateFormat trans2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss:SS"); 		//년월일 시분초,밀리초
		String transDate1 = trans.format(date);
		System.out.println("형식변환1 : "+transDate1);
		String transDate2 = trans2.format(date);
		System.out.println("형식변환2 : "+transDate2);
// Calendar => 추상클래스 : 나라마다 표시하는 법이 달라서 추상클래스를 만들어놓고 상속 받아서 사용하도록
//		Calendar calender = new Calender(); => 빨간줄인 이유 추상클래스라 
		Calendar calendar = new GregorianCalendar();
		System.out.println(calendar.getTime());
		String changed = trans.format(calendar.getTime());
		System.out.println("그레고리안 달력 날짜 변환 : "+ changed);
		
	}

}
