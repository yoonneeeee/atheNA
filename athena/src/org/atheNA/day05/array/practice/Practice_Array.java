package org.atheNA.day05.array.practice;

import java.util.Scanner;

public class Practice_Array {
	public void practice1() {

		// 문제1
		// 길이가 10인 배열을 선언하고 1부터 10 까지의 값을 반복문을 이용하여
		// 순서대로 배열 인덱스에 넣은 후 그 값을 출력하세요. 
//				ex. 1 2 3 4 5 6 7 8 9 10
				int [] arrs = new int[10];
				
				for(int i = 0;i<10;i++) {
					arrs[i] = (i+1);
					System.out.print(arrs[i]+" ");
				}
		///////////////////////////////////////
		// 이렇게 다 입력해도 되지만, for문을 이용하여 반복실행하면 더 간단하게 쓸 수 있음. 
//				arrs[0] = 1;
//				arrs[1] = 2;
//				arrs[2] = 3;
//				arrs[3] = 4;
//				arrs[4] = 5;
//				arrs[5] = 6;
//				arrs[6] = 7;
//				arrs[7] = 8;
//				arrs[8] = 9;
//				arrs[9] = 10;
		////////아래 부분이 반복되므로, for문안에것을 위로 올려도 됨.
//				for(int i = 0; i<10; i++) {
//				System.out.print(arrs[i]+" ");
//				}
	}
	public void practice2() {
		// 길이가 10인 배열을 선언하고 , 1부터 10까지의 값을 반복문을 이용하여
		// 역순으로 배열 인덱스에 넣은 후 그 값을 출력하세요.
		int arrs [] = new int[10];
		int count = 10;
		for (int i = 0; i<10; i++){
			arrs[i] = count;
			count--;
			System.out.print(arrs[i]+" ");
		}
		
//		int arrss[] = new int[10];
////		int countt = 10;
//		for (int i = 0, countt =10; i++, countt--){
//			arrss[i] = countt;
////			countt--;
//			System.out.print(arrss[i]+" ");
//		}
	}
	public void practice3() {
		// 사용자에게 입력받은 양의 정수만큼 배열 크기 할당
		// 1부터 입력받은 값까지 배열에 초기화 후 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수 : ");
		int input = sc.nextInt();
		if(input>0) {								//입력 받은 값이 0보다 큰지 체크
			int[]arrs = new int[input];				//입력 받은 값으로 배열 크기 할당
			for(int i = 1; i<= input; i++) {
				arrs[i-1] = i;
				System.out.print(arrs[i-1]+" ");
			}
			System.out.println();					// 개행
			for(int i = 0; i < input ; i++) {
				arrs[i] = i+1;
				System.out.print(arrs[i]+" ");
			}
		}
	}
	public void practice4() {
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
	public void practice5() {
		// 문자열을 입력 받아 문자 하나하나를 배열에 넣고 검색할 문자가
		// 문자열에 몇 개 들어가 있는지
		// 개수와 몇번째 인덱스에 위치하는지 인덱스를 출력하세요. 
		// ex. //
		//		문자열 : application
		//		문자 : i
		//		application에 i가 존재하는 위치(인덱스) : 4, 8
		//		i 개수 : 2
		System.out.println("문자열을 입력해주세요. ");
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String object = sc.next();

		// 입력 받은 문자열을 어떻게 문자 하나하나 배열에 넣을 것인가?
		// 그럼 그 배열은 무슨 배열이어야 하는가?
		int count = 0;				// "문자열".length()하면 ""안에 문자열의 길이가 구해짐. 이 경우 3이 나옴
		int size = object.length();	//만들어지는 문자배열은 입력한 문자열의 길이만큼 크기를 가져야 함.
		char[]words = new char[size]; 	
		//만들어진 문자배열이 입력한 문자열의 길이만큼 크기를 가져야 함.
		for(int i = 0; i < object.length(); i++) {
			words[i] = object.charAt(i);	//"문자열".charAt(0) 하면 ""번째에 해당하는 문자를 가져옴. 이 경우 '문'이 구해짐
		}
		System.out.print("검색할 문자 : ");
		char search = sc.next().charAt(0); 	//입력한 문자열에서 무조건 첫번째 문자를 구해줌
		System.out.print(object +"에 "+ search +"가 존재하는 위치(인덱스) : ");
		for(int i = 0; i < words.length; i++) {	//배열.length 하면 배열의 크기가 구해짐
			if(words[i] == search) {System.out.print(i+" ");
			count++;
			}
		}
		System.out.println();
		System.out.println("i의 개수 : ");
//		words[0] = object.charAt(0);
//		words[1] = object.charAt(1);
//		words[2] = object.charAt(2); //이러한 작업을 문자열의 길이만큼 반복해야 함
//		words[3] = object.charAt(3);
//		words[4] = object.charAt(4);
//		words[5] = object.charAt(5);

		// 그 배열에 검색한 문자가 있는 지 어떻게 처리할 것인가?
//////////////////내가 어떻게 하면 기억이 날까? 문제만 보고도 코딩할 수 있도록 고민해보기
//////////////////비교금지!!
	}
	public void practice6() {
		//문제6//
		//	"월"~"일"까지 초기화 된 문자열 배열을 만들고 0부터 6까지 숫자를 입력받아
		//	입력한 숫자와 같은 인덱스에 있는 요일을 출력하고, 
		//	범위에 없는 숫자를 입력 시 
		//	"잘못 입력하셨습니다."를 출력하세요. 
		//	ex. 
				// 0~6사이 숫자 입력 : (4) -> 금요일
			 	// 0~6사이 숫자 입력 : (7) -> 잘못 입력 하셨습니다. 
		Scanner sc = new Scanner(System.in);
		System.out.println("0~6 사이 숫자 입력 : ");
		int num = sc.nextInt();
		if (num < 0 || num > 6) {
		System.out.println("잘못입력하셨습니다. ");
			
		}else {
			String[]weeks = {"월요일", "화요일", "수요일", "목요일", "금요일", "토요일", "일요일"};
//			Char [] weekss = {'월', '화', '수', '목", "금", "토", "일"};
			System.out.println(weeks[num]);
//			System.out.println(weekss[num]+"요일");
		}
	}
	public void practice7() {	//문제7//	
		// 사용자가 배열의 길이를 직접 입력하여 그 값만큼 정수형 배열을 선언 및 할당하고
		// 배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화 하세요. 
		// 그리고 배열 전체 값을 나열하고 각 인덱스에 저장된 값들의 합을 출력하세요. 
		
		// ex. 정수 : 5
		//		배열 0번째 인덱스에 넣을 값 : 4
		//		배열 1번째 인덱스에 넣을 값 : -4
		//		배열 2번째 인덱스에 넣을 값 : 3
		//		배열 3번째 인덱스에 넣을 값 : -3
		//		배열 4번째 인덱스에 넣을 값 : 2
		//		4 -4 3 -3 2
		//		총 합 : 2
		Scanner sc = new Scanner(System.in);
		
		}
	public void practice8() {}
	public void practice9() {}
	public void practice10() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("주민등록번호(-포함) : ");
		String idNum = sc.next();
		char [] idNums = new char[idNum.length()];		//길이를 숫자로 입력해도 되지만, 오류를 줄이기 위해  ####.length()
		for(int i = 0; i <idNums.length;i++) {
		idNums[i] = idNum.charAt(i);
		}
		char [] copy = new char[idNums.length];
		for(int i = 0; i <idNums.length;i++) {			//123456-1333444	원본저장
//			copy[i] = idNums[i];						//123456-1******	고객 표출용...
			if(i<8) {
				copy[i]=idNums[i];
				
			}else {
				copy[i]='*';
				
			}
		}
		for(char num : copy) {
			System.out.print(num);
		}
			
		}
	public void practice11() {
		
	}
}
