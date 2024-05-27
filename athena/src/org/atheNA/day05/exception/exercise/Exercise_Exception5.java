package org.atheNA.day05.exception.exercise;
import java.util.*;

public class Exercise_Exception5 {
	public static void main(String[] args) {

		// 문제 5
		// NullPointerException
		try {
			String word = null;
			if(word.equals("키위")) {
				System.out.println("맞습니다.");
			}else {
				System.out.println("다름니다.");
				
			}
		} catch (NullPointerException e) {
			System.out.println("Null값을 참조했습니다.");
			// TODO: handle exception
		}
		
		
	}
}
