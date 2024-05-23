package org.atheNA.day05.array.practice;

public class Practice_Array4 {

	public static void main(String[] args) {
		// 길이가 5인 String 배열을 선언하고, "사과", "귤", "포도", "복숭아", "참외"로 초기화 한 후
		// 배열 인덱스를 활용해서 귤을 출력하세요.
		
//		int [] fruits = new String[5];
//		fruits[0]="사과" // 이렇게 각각 해줘도 되지만, 아래처럼 한번에 선언과 초기화를 같이해도 됨
//		fruits[1]="귤" 
//		fruits[2]="포도" 
//		fruits[3]="복숭아" 
//		fruits[4]="참외" 
		String[]fruits = {"사과", "귤", "포도", "복숭아", "참외"}; 			// 동시에 선언과 초기화 
		for(int i = 0; i < fruits.length; i++) {
			if(fruits[i].equals("귤")) {
				System.out.println(fruits[i]);
				break;
			}
		}
	}

}
