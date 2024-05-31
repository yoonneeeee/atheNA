package org.atheNA.day11.oop.objectex;

class Member {
	String name;
	int age;
	String email;
	String phone;
	String address;
	
	public Member() {}			// 기본생성자를 쓰는 습관을 들이자(안써도 오류가 안나서 빼고 쓰는 경우가 많음) 주의!!
								// 기본생성자는 필수로 쓰고, 필요할 때 생성자 추가해서 사용하시오!
	public Member(String name, int age, String email, String phone, String address) {
		this.name = name;
		this.age = age;
		this.email= email;
		this.phone= phone;
		this.address = address;
	}
	
	@Override
	public String toString() {
	
		return "이름 : "+ name +", 나이 : "+age+", 이메일 : "+email+", 전화번호 : "+phone+", 주소 : "+address;
	}
}

public class Exam_ObjectProperty {

	public static void print(Object obj) {
		System.out.println("클래스 이름 : "+obj.getClass().getName());
		System.out.println("해시 코드값 : "+obj.hashCode());
		// 의미 있는 데이터로 만들어 출력하고 싶다면 오버라이딩 필수
		System.out.println("객체를 문자열로 만들어 출력 : "+obj.toString());
//		System.out.println("객체 출력 : "+obj);		
		//toString()생략 가능함.
		// 객체를 출력하면 toSting()의 결과로 출력됨
	}
		public static void main(String[] args) {
			print(new Member("김윤경",22,"imyk.athena@gmail.com","01044720123","서울시 광진구"));
			print(new Member());	// 생성된 객체는 코드값이 다 다르다.
			
		String javaStr = "Java";
		String javaStr2 = new String("Java");		
		String javaStr3 = "Java";
		
		// 문제
		// if(javaStr == javaStr3){-> ??	T, 둘다 자바 => 쌍따옴표로 넣은 자바는 재사용이라 주소가 서로 같음(feat.상수풀)
		// if(javaStr3 == javaStr2) { ->??	F, new String을 해서 새로운 주소가 들어감
		// if(javaStr3 == "Java") { ->??	T, 저장되어있던 자바가 사용됨
		// if(javaStr == "javA") { ->??		F, 
		// if(javaStr2 == "Java") { ->??	T
		// if(javaStr2.equals("Java") { ->??T
		//
				
		System.out.println("javaStr : "+javaStr+", javaStr2 : "+javaStr2);
//		if(javaStr == "java") {
		
		// 문자열 비교는 equals, equals는 Object 클래스의 메소드
		if("Java".equals(javaStr2)) {			
			System.out.println("똑같습니다.");
		}else {
			System.out.println("다릅니다.");			
		}
	}
}
