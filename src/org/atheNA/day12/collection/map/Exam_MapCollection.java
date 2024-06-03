package org.atheNA.day12.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import org.atheNA.day08.oop.objectarray.student.Student;

public class Exam_MapCollection {
	public static void main(String[] args) {
		// Collection -> 저장소
		// 자료구조의 특성에 따라서 선택해서 사용
		// List, SEt, Map, Stack, Queue, ...

/// HashMap : 해시 테이블을 기반으로 한 구현체다. 키와 값의 쌍을 저장하며, 키의 순서를 보장하지 않는다. 
/// HashMap 구조 : Map 인터페이스는 키-값(key-value) 쌍을 저장하는 자료구조

		// Map에는
		// Key가 있고, 이것은 고유한 값, 중복 X
		// Value가 있고, 이것은 Key에 매핑되는 값임.
		// int 기본형인데 참조형으로 쓸 수 있게 해주는 클래스 -> Wrapper Class
		Map<Integer, Student> stdMap = new HashMap<Integer, Student>();
		stdMap.put(1, new Student("이고잉", 100, 100));
		stdMap.put(2, new Student("박응용", 100, 100));
		System.out.println("첫번째 학생 : "+stdMap.get(1).toString());
		System.out.println("두번째 학생 : "+stdMap.get(2)); 		//toString 생략 가능
		
		
		/// 생략 가능한 것들을 다 적어보세요. 개당 10점
		/*
		 * 1. toString()
		 * 2. 자동형변환
		 * 3. extends Object
		 * 4. this
		 * 5. 기본생성자 상속 시 super()
		 * 6. return;
		 * 7. java.lang패키지
		 * 8. 
		 * */

	}

	public Map<String, Object> mapExercise() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("연봉 : ");
		long salary = sc.nextLong();
		System.out.print("재직여부(true/false) : ");
		boolean isWorking = sc.nextBoolean();

		Map<String, Object> memberInfo = new HashMap<String, Object>();
		memberInfo.put("name", name);
		memberInfo.put("salary", salary);
		memberInfo.put("isWorking", isWorking);
		// -> {"name": name, "salary":salary, "isWorking" : working
		return memberInfo;
	}

	public void megaSample() {
		Map<String, Object> objMap = new HashMap<String, Object>();
		objMap.put("name", "아샷추");
		objMap.put("price", 3500);
		objMap.put("isGood", true);

		String name = (String) objMap.get("name");
		boolean result = (boolean) objMap.get("isGood");
		System.out.println(name);
		System.out.println("추천여부 : " + result);
	}

	public void basicSample() {
		// 예제[번호(key)-지역(value)]
		// 02-서울, 031-경기도, 032-인천, 033-강원도,
		// 041-충청남도, 042-대전, 043-충청북도, 044-세종,
		// 051-부산, 052-울산, 053-대구, 054-경상북도, 055-경상남도,
		// 061-전라남도, 062-광주, 063-전라북도, 064-제주도
		Map<String, String> map = new HashMap<String, String>();
		map.put("02", "서울");
		map.put("031", "경기도");
		map.put("032", "인천");
		map.put("051", "부산");
		map.put("064", "제주도");
		// 소괄호 안에 같이 저장됨
		System.out.println("저장된 데이터 수 : " + map.size());
		System.out.println("02를 누르면 서울이 나옵니다. : " + map.get("02"));
		System.out.println("032를 누르면 서울이 나옵니다. : " + map.get("032"));
		String region="";
		// 지역번호 입력 : 02
		// 입력하신 지역번호에 대한 지역은 : 서울
		do {
			Scanner sc = new Scanner(System.in);
			System.out.print("지역 번호 입력 : ");

//// 윤경 버전
//				String answer =sc.next();
//				System.out.println("입력하신 지역번호에 대한 지역은 : "+map.get(answer));
//// 뱅큐 버전
			region = sc.next();
			String result = map.get(region);
			if (result != null)
				System.out.println("입력하신 지역번호에 대한 지역은 : " + result);
			else
				System.out.println("데이터가 존재하지 않습니다.");
		} while (!"exit".equals(region));

	}
}
