package org.atheNA.day12.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Exam_SetCollection {

	public static void main(String[] args) {
		// Collection의 List, Set, Map => 저장소
		// 자료구조의 특성에 따라서 선택해서 사용함.
		// set 순서는 중요하지 않음. 중복을 허용하지 않ㄴ음
		// => 중복을 제거할 수 있음.
		Set<Student> stdSet = new HashSet<Student>();
		stdSet.add(new Student("이세훈", 90, 80));
		stdSet.add(new Student("허태성", 88, 44));
		stdSet.add(new Student("남궁성", 78, 67));
		stdSet.add(new Student("이세훈", 90, 80));
		
		System.out.println("크기 : "+ stdSet.size());
		Iterator<Student> it = stdSet.iterator();
		while(it.hasNext()){
			System.out.println(it.next().toString());
		}
	}
	public void setSample() {
		Set<String> strSet = new HashSet<String>();
		strSet.add("체리");
		strSet.add("딸기");
		strSet.add("사과");
		strSet.add("수박");
		strSet.add("포도");
		strSet.add("딸기");

		System.out.println("크기 : " + strSet.size());
		// 결과 : 5, => 딸기가 중복되므로 자동으로 없앰
		// => 중복을 허용하지 않음.
		// => 중복을 허용하지 않는 예시 : 로또, 주민등록번호, 변수 이름,....
		// => 수학의 집합 : 순서가 중요하지 않음. 중복을 허용하지 않음.
		// 순서가 있는 경우에는 index 활용할 수 있으나 set처럼 순서가 없으면 지시자를 활용
		// => 지시자 : Iterator=> 임포트 해줘야 함
		Iterator<String> it = strSet.iterator();
		while (it.hasNext()) {
			System.out.println(it.next().toString());
		}
	}

}
